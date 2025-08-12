package CRUDApplication.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import CRUDApplication.entities.User;
import CRUDApplication.services.UserService;

@RestController
@RequestMapping("/myUsers")
public class UserController 
{
	@Autowired
	private CRUDApplication.services.UserService userService;
	
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user)
	{
		return userService.createUser(user);
	}
	
	@PostMapping("/addUsers")
	public List<User> addUsers(@RequestBody List<User> users)
	{
		return userService.createUsers(users);
	}
	
	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable Long id)
	{
		return userService.getUserById(id);
	}
	
	@GetMapping
	public List<User> getUsers()
	{
		return userService.getUsers();
	}
	
	@PutMapping("/updateUser/{id}")
	public User updateById(@PathVariable Long id, @RequestBody User user)
	{
		user.setId(id);
		return userService.updateUser(user);
	}
	
	@DeleteMapping("/user/{id}")
	public String deleteUser(@PathVariable Long id)
	{
		return userService.deleteUserById(id);
	}
}
