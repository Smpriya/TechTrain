package com.rsc.api.service;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rsc.api.model.AutoMobile;
import com.rsc.api.repo.AutoMobileDAO;
import com.rsc.api.repo.AutoMobileDAOImpl;

@Service
@Transactional
public class AutoMobileServiceManagerImpl implements AutoMobileServiceManager {
	
	@Autowired
	private AutoMobileDAOImpl autoMobileDAOImpl;
	
	public void createAutoMobile(AutoMobile am) {
		autoMobileDAOImpl.createAutoMobile(am);
	}
	
	public List<AutoMobile> getAutoMobiles() {
		return autoMobileDAOImpl.getAutoMobiles();
	}
}
