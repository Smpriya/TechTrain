package com.rsc.api.service;

import java.util.List;

import com.rsc.api.model.Animal;

public interface AnimalServiceManager {
	public void createAutoMobile(Animal am);
	
	public List<Animal> getAnimals();
}
