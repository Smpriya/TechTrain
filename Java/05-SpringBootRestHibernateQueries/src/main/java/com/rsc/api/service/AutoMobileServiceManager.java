package com.rsc.api.service;

import java.util.List;

import org.hibernate.Session;

import com.rsc.api.model.AutoMobile;

public interface AutoMobileServiceManager {
	public void createAutoMobile(AutoMobile am);
	
	public List<AutoMobile> getAutoMobiles();
}
