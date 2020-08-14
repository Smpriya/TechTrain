package com.rsc.api.repo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsc.api.model.AutoMobile;
import com.rsc.api.model.AutoParts;
import com.rsc.api.model.Car;
import com.rsc.api.model.Jeep;

@Repository
public class AutoPartsDAOImpl extends AutoPartsDAO {
		
	@Autowired
	private SessionFactory sessionFactory;

	public void createAutoMobile(AutoParts aParts) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(aParts);
	}
	
	public List<AutoParts> getAutoParts() {
		Session session = sessionFactory.getCurrentSession();
		Query qry = session.createQuery("from AutoParts",AutoParts.class);
		return qry.list();
	}
	
	
	
	
//	public void createAutoMobile(AutoMobile aMobile) {
//		System.out.println("=====" + aMobile);
//		Session session = sessionFactory.getCurrentSession();
//		session.saveOrUpdate(aMobile);
//	}
//	
//	public List<Car> getCars() {
//		Session session = sessionFactory.getCurrentSession();
//		Query qry = session.createQuery("from Car",Car.class);
//		return qry.list();
//	}
//
//	public Car fetchCarByID(int Id) {
//		Session session = sessionFactory.getCurrentSession();
//		Car am = session.get(Car.class, Id);
//		return am;
//	}
//	
//	public List<Jeep> getJeeps() {
//		Session session = sessionFactory.getCurrentSession();
//		Query qry = session.createQuery("from Jeep",Jeep.class);
//		return qry.list();
//	}
//
//	public Jeep fetchJeepByID(int Id) {
//		Session session = sessionFactory.getCurrentSession();
//		Jeep am = session.get(Jeep.class, Id);
//		return am;
//	}
//	
//	public AutoMobile fetchAutoMobileByID(int Id) {
//		Session session = sessionFactory.getCurrentSession();
//		AutoMobile am = session.get(AutoMobile.class, Id);
//		return am;
//	}
	
	

}
