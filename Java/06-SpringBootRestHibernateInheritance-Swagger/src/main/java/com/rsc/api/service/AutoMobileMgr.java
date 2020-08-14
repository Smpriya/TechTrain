package com.rsc.api.service;

import java.util.List;

import com.rsc.api.model.AutoMobile;
import com.rsc.api.model.Car;


public interface AutoMobileMgr {
	public void createAutoMobile(AutoMobile am);
	
	public List<Car> getCars();

	public Car fetchCarByID(int Id);
	
}