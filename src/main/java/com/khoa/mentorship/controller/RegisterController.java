package com.khoa.mentorship.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.khoa.mentorship.model.RegisterModel;
import com.khoa.mentorship.service.EmailService;
import com.khoa.mentorship.service.RegisterService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/register-service")
public class RegisterController {

	@Autowired
	private RegisterService registerService;

	@Autowired
	private EmailService emailService;

	@PostMapping("/register")
	public boolean registerUser(@RequestBody RegisterModel registerModel) {
		try {
			emailService.sendSimpleMessage(registerModel.getEmail(), "Activate Account", "Please click to activate: <a href='http://localhost:4200/activate-account?email=" + registerModel.getEmail() + ">Click here</a>");			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return registerService.registerUser(registerModel);
	}

}
