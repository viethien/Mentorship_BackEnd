package com.khoa.mentorship.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.khoa.mentorship.entity.Mentor;
import com.khoa.mentorship.service.MentorService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/mentor-service")
public class MentorController {
	
	@Autowired
	private MentorService mentorService;
	
	@GetMapping("/mentors")
	public List<Mentor> getMentorByEmail(String email) {
		return mentorService.getAllMentos();
	}

}
