package com.khoa.mentorship.service;

import java.util.List;

import com.khoa.mentorship.entity.Mentor;

public interface MentorService {

	public List<Mentor> getAllMentos();
	
	public Mentor getMentorById(int id);
}
