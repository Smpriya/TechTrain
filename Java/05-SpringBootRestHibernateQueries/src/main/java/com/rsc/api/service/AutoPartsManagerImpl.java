package com.rsc.api.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rsc.api.model.AutoParts;
import com.rsc.api.repo.AutoPartsDAOImpl;

@Service
@Transactional
public class AutoPartsManagerImpl implements AutoPartsManager {
	
	@Autowired
	private AutoPartsDAOImpl repo;

	@Override
	public void createAutoParts(AutoParts ap) {
		// TODO Auto-generated method stub
		repo.createAutoParts(ap);
	}

	@Override
	public List<AutoParts> getAutoParts() {
		// TODO Auto-generated method stub
		return repo.getAutoParts();
	}

}
