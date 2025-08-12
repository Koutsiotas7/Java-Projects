package controllers;

import entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repositories.UserRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController 
{
    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) 
    {
        this.userRepository = userRepository;
    }

    // Get all users
    @GetMapping
    public List<User> getAllUsers() 
    {
        return userRepository.findAll();
    }

    // Get user by ID
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) 
    {
        return userRepository.findById(id).orElse(null);
    }

    // Create new user
    @PostMapping
    public User createUser(@RequestBody User user) 
    {
        return userRepository.save(user);
    }

    // Update user
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User updatedUser) 
    {
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()) 
        {
            User user = optionalUser.get();
            user.setName(updatedUser.getName());
            user.setEmail(updatedUser.getEmail());
            return userRepository.save(user);
        } 
        else 
        {
            return null;
        }
    }

    // Delete user
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) 
    {
        userRepository.deleteById(id);
    }
}
