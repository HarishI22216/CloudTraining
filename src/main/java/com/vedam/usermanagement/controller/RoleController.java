package com.vedam.usermanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vedam.usermanagement.model.Role;
import com.vedam.usermanagement.repository.RoleRepository;

@RestController
@RequestMapping("/api/roles")
public class RoleController {
	@Autowired
	RoleRepository roleRepository;

	@GetMapping
	public Iterable<Role> getRoles() {
		return roleRepository.findAll();
	}

	@PostMapping("/create")
	public Role add(@RequestBody Role role) {
		return roleRepository.save(role);
	}

}
