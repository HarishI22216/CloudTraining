package com.vedam.usermanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vedam.usermanagement.model.Role;
import com.vedam.usermanagement.repository.RoleRepository;

@RestController
@RequestMapping("/role")
public class RoleController {
	@Autowired
	RoleRepository roleRepo;

	@PostMapping("/add")
	public Role add(@RequestBody Role role) {
		return roleRepo.save(role);
	}
	
	@PostMapping("/test")
	public String add() {
		return "test";
	}

}
