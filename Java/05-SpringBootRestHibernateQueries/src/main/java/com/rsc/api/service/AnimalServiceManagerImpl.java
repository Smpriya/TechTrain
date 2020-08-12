package com.rsc.api.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rsc.api.model.Animal;
import com.rsc.api.model.Bat;
import com.rsc.api.model.Elephant;
import com.rsc.api.repo.AnimalDAOImpl;
import com.rsc.api.repo.hql.AnimalHQLDAO;

@Service
@Transactional
public class AnimalServiceManagerImpl implements AnimalServiceManager {
	
	@Autowired
	AnimalDAOImpl repo;
	
	@Autowired
	AnimalHQLDAO repoHql;

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

	@Override
	public List<Elephant> getElephants() {
		// TODO Auto-generated method stub
		return repo.getElephants();
	}

	@Override
	public List<Bat> getBats() {
		// TODO Auto-generated method stub
		return repo.getBats();
	}
	
	@Override
	public void save(Object obj) {
		// TODO Auto-generated method stub
		repoHql.save(obj);
	}

	@Override
	public List getQueryJoin() {
		// TODO Auto-generated method stub
		return repoHql.getJoinedData();
	}

}
