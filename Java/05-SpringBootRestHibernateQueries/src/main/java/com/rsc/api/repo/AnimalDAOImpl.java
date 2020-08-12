package com.rsc.api.repo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsc.api.model.Animal;
import com.rsc.api.model.AutoMobile;
import com.rsc.api.model.Bat;
import com.rsc.api.model.Elephant;

@Repository
public class AnimalDAOImpl extends AnimalDAO {
    @Autowired
	private SessionFactory sessionFactory;
	
	public void createAutoMobile(Animal am) {
		Session session = sessionFactory.getCurrentSession();
		session.save(am);
	}
	
	
	
	public List<Animal> getAnimals() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery(
			      "from Animal")
			      .getResultList();
	}
	
	
	public List<Elephant> getElephants() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery(
			      "from Elephant")
			      .getResultList();
	}
	
	public List<Bat> getBats() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery(
			      "from Bat")
			      .getResultList();
	}
	
}