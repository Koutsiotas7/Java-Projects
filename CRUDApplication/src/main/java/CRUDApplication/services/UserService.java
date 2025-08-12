package CRUDApplication.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import CRUDApplication.repositories.UserRepository;
import CRUDApplication.entities.User;

@Service
public class UserService 
{
	@Autowired
	private UserRepository userRepository;
	
	public User createUser(User user)
	{
		return userRepository.save(user);
	}
	
	public List<User> createUsers(List<User> users)
	{
		return userRepository.saveAll(users);
	}
	
	public User getUserById(long id)
	{
		return userRepository.findById(id).orElse(null);
	}
	
	public List<User> getUsers()
	{
		return userRepository.findAll();
	}
	
	public User updateUser(User user)
	{
		Optional<User> oldUserOptional = userRepository.findById(user.getId());

	    if (oldUserOptional.isPresent()) 
	    {
	        User oldUser = oldUserOptional.get();

	        if (user.getName() != null) 
	        {
	            oldUser.setName(user.getName());
	        }
	        if (user.getAddress() != null) 
	        {
	            oldUser.setAddress(user.getAddress());
	        }

	        return userRepository.save(oldUser);
	    } 
	    else 
	    {
	        return null;
	    }
	}
	
	public String deleteUserById(long id)
	{
		userRepository.deleteById(id);
		return "User with id " + id +" has been deleted!!!";
	}
}
