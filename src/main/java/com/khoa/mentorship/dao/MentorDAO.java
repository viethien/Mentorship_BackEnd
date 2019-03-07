package com.khoa.mentorship.dao;

import java.util.List;

import com.khoa.mentorship.entity.Mentor;

public interface MentorDAO {
	
	public List<Mentor> getAllMentos();
	
	public Mentor getMentorById(int id);
	
	public Mentor getMentorByEmail(String email);

}
