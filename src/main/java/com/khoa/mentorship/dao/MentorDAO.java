package com.khoa.mentorship.dao;

import com.khoa.mentorship.entity.Mentor;

public interface MentorDAO {
	
	public Mentor getMentorByEmail(String email);

}
