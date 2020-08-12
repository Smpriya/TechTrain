package com.rsc.api.repo.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsc.api.model.Animal;
import com.rsc.api.repo.AnimalDAO;

@Repository
public class AnimalHQLDAO extends AnimalDAO {
	
    @Autowired
	private SessionFactory sessionFactory;
    
    public void save(Object obj) {
    	sessionFactory.getCurrentSession().save(obj);
    }
    
    public List<Animal> getAnimals() {
		Session session = sessionFactory.getCurrentSession();
		Query qry = session.createQuery("from Car c where c.color=:color");
		qry.setString("color", "blue");
		return qry.list();
	}
    
    public int getDistictCount() {
		Session session = sessionFactory.getCurrentSession();
		Query qry = session.createQuery("select count(distinct j.vin) from Jeep j");
		return (int) qry.getSingleResult();
	}
    
    public List<Animal> getOrderedList() {
		Session session = sessionFactory.getCurrentSession();
		Query qry = session.createQuery("from Jeep j order by j.vin asc");
		return qry.list();
	}
    
    public List<Object> getJoinedData() {
		Session session = sessionFactory.getCurrentSession();

		Query qry = session.createQuery("select ctzn.id,ctzn.name,ctzn.email,a.address1,a.address2,a.country,"
				+ "a.city,a.pincode from Citizen as ctzn left join ctzn.address a");
		
		List lst = qry.list();
		
		return lst;
		
		//return qry.list();
	}
    
    
}
