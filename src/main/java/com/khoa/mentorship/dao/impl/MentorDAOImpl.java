package com.khoa.mentorship.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khoa.mentorship.dao.MentorDAO;
import com.khoa.mentorship.entity.Mentor;

@Repository
public class MentorDAOImpl implements MentorDAO {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public Mentor getMentorByEmail(String email) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query query = currentSession.createQuery("from Mentor where email = :email");
		query.setParameter("email", email);
		if(query.getResultList().size() > 0) {
			return (Mentor) query.getResultList().get(0);
		}
		return null;
	}

	@Override
	public List<Mentor> getAllMentos() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query query = currentSession.createQuery("from Mentor", Mentor.class);
		List<Mentor> mentors = query.getResultList();
		return mentors;
	}

	@Override
	public Mentor getMentorById(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query query = currentSession.createQuery("from Mentor where mentorId = :mentorId");
		query.setParameter("mentorId", id);
		if(query.getResultList().size() > 0) {
			return (Mentor) query.getResultList().get(0);
		}
		return null;
	}

}
