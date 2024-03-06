package com.vedam.usermanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vedam.usermanagement.model.User;
import com.vedam.usermanagement.repository.UserRepository;

@RestController
@RequestMapping("/api/users")
public class UserController {
	@Autowired
	UserRepository userRepository;
	
	@GetMapping
	public Iterable<User> getUsers() {
		return userRepository.findAll();
	}
	
	@PostMapping("/create")
	public User addUser(@RequestBody User user) {
		return userRepository.save(user);
		
	}
	
	@DeleteMapping("/remove/{id}")
	public void delete(@PathVariable long id) {
		 userRepository.deleteById(id);
	}
	
	

}
