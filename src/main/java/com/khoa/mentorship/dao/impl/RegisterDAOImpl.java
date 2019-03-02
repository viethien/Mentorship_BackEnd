package com.khoa.mentorship.dao.impl;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khoa.mentorship.dao.RegisterDAO;
import com.khoa.mentorship.entity.Mentor;
import com.khoa.mentorship.entity.Student;
import com.khoa.mentorship.model.RegisterModel;
import com.khoa.mentorship.model.Types;

@Repository
public class RegisterDAOImpl implements RegisterDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public boolean registerUser(RegisterModel registerModel) {
		Session currentSession = entityManager.unwrap(Session.class);
		if(registerModel.getType() == Types.HIGHSCHOOL_STUDENT) {
			Student student = new Student();
			student.setStudentId(0);
			student.setFirstName(registerModel.getFirstName());
			student.setLastName(registerModel.getLastName());
			student.setEmail(registerModel.email);
			student.setPassword(registerModel.getPassword());
			currentSession.saveOrUpdate(student);
		} else if (registerModel.getType() == Types.PROFESSOR) {
			Mentor mentor = new Mentor();
			mentor.setMentorId(0);
			mentor.setFirstName(registerModel.getFirstName());
			mentor.setLastName(registerModel.getLastName());
			mentor.setEmail(registerModel.getEmail());
			mentor.setPassword(registerModel.getPassword());
			currentSession.saveOrUpdate(mentor);
		}
		return true;
	}

}
