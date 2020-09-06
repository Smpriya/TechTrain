package com.rsc.payments.repo;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsc.payments.entity.model.Account;
import com.rsc.payments.entity.model.Customer;

@Repository
public class AccountDAOImpl extends AccountDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Account> getAllAccounts(){
		Session session = sessionFactory.getCurrentSession();
		Query qry = session.createQuery("from Account");
		return qry.list();	
	}
	
	public void createAccount(Account act){
		Session session = sessionFactory.getCurrentSession();
		session.save(act);	
	}
	
	public List<Account> fetcAccountByAccountNumber(String acctNbr){
		Session session = sessionFactory.getCurrentSession();
		Criteria cr = session.createCriteria(Account.class);
		
		Projection projection1 = Projections.property("id").as("id"); 
		Projection projection2 = Projections.property("accountNumber").as("accountNumber"); 

		ProjectionList pList = Projections.projectionList(); 
		pList.add(projection1); 
		pList.add(projection2); 
 
		cr.setProjection(pList); 
		cr.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
		
		cr.add(Restrictions.eq("accountNumber", acctNbr));
		
		
		return cr.list();
	}
	
	
}
