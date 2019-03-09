package com.khoa.mentorship.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.khoa.mentorship.model.LoginModel;
import com.khoa.mentorship.model.LoginResponseModel;
import com.khoa.mentorship.model.UserDetailModel;
import com.khoa.mentorship.service.UserService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/user-service")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/update-details")
	public boolean updateDetails(@RequestBody UserDetailModel userDetailModel) {
		return userService.updateDetails(userDetailModel);
	}
	
	@GetMapping("/activate/{email}")
	public boolean activateAcccount(@PathVariable String email) {
		return userService.activateAcccount(email);
	}
	
	@PostMapping("/login")
	public LoginResponseModel login(@RequestBody LoginModel loginModel) {
		return userService.login(loginModel);
	}

}
