package com.vedam.usermanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vedam.usermanagement.model.User;
import com.vedam.usermanagement.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserRepository userRepository;
	@PostMapping("/add")
	public User addUser(@RequestBody User user) {
		return userRepository.save(user);
		
	}
	@GetMapping("/all")
	public Iterable<User> getUsers() {
		return userRepository.findAll();
	}
	
	@DeleteMapping("/del")
	public void delete(@RequestBody User user) {
		 userRepository.deleteById(user.getUser_id());
	}
	
	

}
