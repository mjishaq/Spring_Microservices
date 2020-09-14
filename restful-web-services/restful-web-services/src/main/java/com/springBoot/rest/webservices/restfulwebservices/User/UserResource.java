package com.springBoot.rest.webservices.restfulwebservices.User;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.hateoas.server.mvc.ControllerLinkBuilder.*;
import  org.springframework.hateoas.*;
import org.springframework.hateoas.server.mvc.ControllerLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {

	//Automatically object of UserDao get created.
	@Autowired
	private UserDAO userService;
	
	@GetMapping("/userList")
	public List<User> retreiveAllUsers()
	{
		return userService.findAll();
		
	}
	
	//Mapping of method is done with get mapping. Get mapping is used for search
	@GetMapping("/userList/{id}")
	public User retreiveAllUsers(@PathVariable int id)
	{
		User user = userService.findOne(id);
		if(user == null) {
			throw new UserNotFoundException("id -"+id);
		}
	//Resource
		//Resource
		//ControllerLinkBuilder linkTo = linkTo(mehtodOn(this.getClass().
		
		return user;
	}

	//Post mapping is used while creating.
	@PostMapping("/userList")
	public ResponseEntity<Object> createUser(@Valid @RequestBody User user) {
		
		User userList= userService.SaveUser(user);
		URI location =ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(userList.getRollNo()).toUri();
		
		
		return ResponseEntity.created(location).build();
		
	}
	
	
	@DeleteMapping("/userList/{id}")
	public void deleteUserById(@PathVariable int id)
	{
		User user = userService.deleteById(id);
		if(user == null) {
			throw new UserNotFoundException("id -"+id);
		}
	
		
	}
	
}
