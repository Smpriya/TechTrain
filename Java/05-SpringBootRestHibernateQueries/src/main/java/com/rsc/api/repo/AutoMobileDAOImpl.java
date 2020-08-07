package com.rsc.api.repo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsc.api.model.AutoMobile;

@Repository
public class AutoMobileDAOImpl extends AutoMobileDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void createAutoMobile(AutoMobile am) {
		Session session = sessionFactory.getCurrentSession();
		session.save(am);
	}
	
	public List<AutoMobile> getAutoMobiles() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery(
			      "from com.rsc.api.model.AutoMobile")
			      .getResultList();
	}
}
