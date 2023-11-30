package com.example.cloneproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cloneproject.entity.UserEntity;
import com.example.cloneproject.service.UserService;

@CrossOrigin
@RestController
public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping("/getUser")
	List<UserEntity> all(){
		return userService.getAllUser();
	}
}
