package com.vehicles.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicles.springboot.model.User;
import com.vehicles.springboot.repository.UserRepository;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/user")
	 List<User> getUser(){
		return userRepository.findAll();	
		
	}
}
