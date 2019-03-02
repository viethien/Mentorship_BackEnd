package com.khoa.mentorship.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khoa.mentorship.dao.UniversityDAO;
import com.khoa.mentorship.entity.University;

@Repository
public class UniversityDAOImpl implements UniversityDAO {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public University getUniversityById(int universityId) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query query = currentSession.createQuery("from Highschool where universityId = :universityId");
		query.setParameter("universityId", universityId);
		if(query.getResultList().size() > 0) {
			return (University) query.getResultList().get(0);
		}
		return null;
	}

}
