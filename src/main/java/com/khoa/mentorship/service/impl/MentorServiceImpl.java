package com.khoa.mentorship.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khoa.mentorship.dao.MentorDAO;
import com.khoa.mentorship.entity.Mentor;
import com.khoa.mentorship.service.MentorService;

@Service
public class MentorServiceImpl implements MentorService {
	
	@Autowired
	MentorDAO mentorDAO;

	@Override
	public List<Mentor> getAllMentos() {
		return mentorDAO.getAllMentos();
	}

}
