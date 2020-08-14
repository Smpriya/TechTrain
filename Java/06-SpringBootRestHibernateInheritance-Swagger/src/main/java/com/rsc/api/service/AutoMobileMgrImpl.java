package com.rsc.api.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rsc.api.model.AutoMobile;
import com.rsc.api.model.Car;
import com.rsc.api.repo.AutoMobileDAOImpl;

@Service
@Transactional
public class AutoMobileMgrImpl implements AutoMobileMgr {
	
	@Autowired
	private AutoMobileDAOImpl repoAuto;

	@Override
	public void createAutoMobile(AutoMobile am) {
		// TODO Auto-generated method stub
		repoAuto.createAutoMobile(am);
		System.out.println("fetch=======" + repoAuto.fetchCarByID(3));
	}

	@Override
	public List<Car> getCars() {
		// TODO Auto-generated method stub
		return repoAuto.getCars();
	}

	@Override
	public Car fetchCarByID(int Id) {
		// TODO Auto-generated method stub
		return repoAuto.fetchCarByID(Id);
	}
	
	


}
