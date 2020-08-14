package com.rsc.api.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rsc.api.model.AutoParts;
import com.rsc.api.repo.AutoPartsDAOImpl;

@Service
@Transactional
public class AutoPartsMgrImpl implements AutoPartsMgr {
	
	@Autowired
	private AutoPartsDAOImpl autoPartsDao;

	@Override
	public void createAutoParts(AutoParts aParts) {
		// TODO Auto-generated method stub
		autoPartsDao.createAutoMobile(aParts);
	}

	@Override
	public List<AutoParts> getAutoParts() {
		// TODO Auto-generated method stub
		return autoPartsDao.getAutoParts();
	}

	@Override
	public AutoParts fetchAutoPartsByID(int Id) {
		// TODO Auto-generated method stub
		return null;
	}

}
