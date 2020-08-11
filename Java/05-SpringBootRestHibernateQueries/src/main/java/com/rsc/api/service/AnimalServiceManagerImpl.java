package com.rsc.api.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rsc.api.model.Animal;
import com.rsc.api.repo.AnimalDAOImpl;

@Service
@Transactional
public class AnimalServiceManagerImpl implements AnimalServiceManager {
	
	@Autowired
	AnimalDAOImpl repo;

	@Override
	public void createAutoMobile(Animal am) {
		// TODO Auto-generated method stub
		repo.createAutoMobile(am);
	}

	@Override
	public List<Animal> getAnimals() {
		// TODO Auto-generated method stub
		return repo.getAnimals();
	}

}
