package com.rsc.api.service;

import java.util.List;

import com.rsc.api.model.Animal;
import com.rsc.api.model.Bat;
import com.rsc.api.model.Elephant;

public interface AnimalServiceManager {
	public void createAutoMobile(Animal am);

	public List<Animal> getAnimals();

	public List<Elephant> getElephants();

	public List<Bat> getBats();
	
	public void save(Object obj);
	
	public List getQueryJoin();
}
