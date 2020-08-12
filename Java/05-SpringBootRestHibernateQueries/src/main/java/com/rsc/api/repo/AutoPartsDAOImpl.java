package com.rsc.api.repo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsc.api.model.AutoMobile;
import com.rsc.api.model.AutoParts;

@Repository
public class AutoPartsDAOImpl extends AutoPartsDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void createAutoParts(AutoParts ap) {
		Session session = sessionFactory.getCurrentSession();
		session.save(ap);
	}
	
	public List<AutoParts> getAutoParts() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery(
			      "from AutoParts")
			      .getResultList();
	}
}
