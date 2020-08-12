package com.rsc.api.service;

import java.util.List;

import com.rsc.api.model.AutoParts;

public interface AutoPartsManager {
	public void createAutoParts(AutoParts ap);
	
	public List<AutoParts> getAutoParts(); 
}
