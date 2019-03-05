package com.khoa.mentorship.dao.impl;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khoa.mentorship.dao.HighschoolDAO;
import com.khoa.mentorship.dao.MentorDAO;
import com.khoa.mentorship.dao.StudentDAO;
import com.khoa.mentorship.dao.TitleDAO;
import com.khoa.mentorship.dao.UniversityDAO;
import com.khoa.mentorship.dao.UserDAO;
import com.khoa.mentorship.entity.Mentor;
import com.khoa.mentorship.entity.Student;
import com.khoa.mentorship.model.UserDetailModel;

@Repository
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private EntityManager entityManager;
	
	@Autowired
	private StudentDAO studentDAO;
	
	@Autowired
	private MentorDAO mentorDAO;
	
	@Autowired
	private HighschoolDAO highschoolDAO;
	
	@Autowired
	private TitleDAO titleDAO;
	
	@Autowired
	private UniversityDAO universityDAO;

	@Override
	public boolean updateDetails(UserDetailModel userDetailModel) {
		Session currentSession = entityManager.unwrap(Session.class);
		String email = userDetailModel.getEmail();
		Student student = studentDAO.getStudentByEmail(email);
		Mentor mentor = mentorDAO.getMentorByEmail(email);
		if(student != null) {
			student.setHighschool(highschoolDAO.getHighschoolById(userDetailModel.getHighschoolId()));
			currentSession.update(student);
			return true;
		}
		if(mentor != null) {
			mentor.setTitle(titleDAO.getTitleById(userDetailModel.getTitleId()));
			mentor.setUniversity(universityDAO.getUniversityById(userDetailModel.getUniversityId()));
			mentor.setDescription(userDetailModel.getDescription());
			mentor.setWebsite(userDetailModel.getWebsite());
			mentor.setVisible(userDetailModel.isVisible());
			currentSession.update(mentor);
			return true;
		}
		return false;		
	}

	@Override
	public boolean activateAcccount(String email) {
		Session currentSession = entityManager.unwrap(Session.class);
		Student student = studentDAO.getStudentByEmail(email);
		Mentor mentor = mentorDAO.getMentorByEmail(email);
		if(student != null) {
			student.setActive(true);
			currentSession.update(student);
			return true;
		}
		if(mentor != null) {
			mentor.setActive(true);
			currentSession.update(mentor);
			return true;
		}
		return false;		
	}

}
