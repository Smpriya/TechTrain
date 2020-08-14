package com.rsc.api.service;

import java.util.List;

import com.rsc.api.model.AutoMobile;
import com.rsc.api.model.AutoParts;
import com.rsc.api.model.Car;

public interface AutoPartsMgr {
	public void createAutoParts(AutoParts aParts);
	
	public List<AutoParts> getAutoParts();

	public AutoParts fetchAutoPartsByID(int Id);
}
