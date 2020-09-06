package com.rsc.payments.repo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsc.payments.entity.model.Account;
import com.rsc.payments.entity.model.Customer;

@Repository
public class CustomerDAOImpl extends CustomerDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Customer> getAllCustomers(){
		Session session = sessionFactory.getCurrentSession();
		Query qry = session.createQuery("from Customer");
		return qry.list();	
	}
	
	public void createCustomer(Customer act){
		Session session = sessionFactory.getCurrentSession();
		session.save(act);	
	}
	
	public List<Customer> fetcCustomerByCustomerID(int customerId){
		Session session = sessionFactory.getCurrentSession();
		Query qry = session.createQuery("from Customer where id=:id");
		qry.setInteger("id", customerId);
		return qry.list();
	}
	
}
