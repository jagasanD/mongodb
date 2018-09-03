package com.mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.model.AppUser;
import com.mongo.service.UserService;

@RestController
@CrossOrigin
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/save-user")
	public void saveUser(@RequestBody AppUser user) {
		userService.saveUser(user);
	}
	
	@GetMapping("/get-user")
	public List<AppUser> getList() {
		return userService.getUsers();	
	}
	

}
