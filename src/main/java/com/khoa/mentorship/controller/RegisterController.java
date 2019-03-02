package com.khoa.mentorship.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.khoa.mentorship.model.RegisterModel;
import com.khoa.mentorship.service.RegisterService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/register-service")
public class RegisterController {
	
	@Autowired
	RegisterService registerService;
	
	@PostMapping("/register")
	public boolean registerUser(@RequestBody RegisterModel registerModel) {
		return registerService.registerUser(registerModel);
	}

}
