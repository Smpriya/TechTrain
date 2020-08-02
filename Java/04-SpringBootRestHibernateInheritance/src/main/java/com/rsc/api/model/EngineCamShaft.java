package com.rsc.api.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("1")
public class EngineCamShaft extends AutoParts {
	
	private int noOfJumps;
	
	private int lenght;
	
	private String type;

	public int getNoOfJumps() {
		return noOfJumps;
	}

	public void setNoOfJumps(int noOfJumps) {
		this.noOfJumps = noOfJumps;
	}

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "EngineCamShaft [noOfJumps=" + noOfJumps + ", lenght=" + lenght + ", type=" + type + "]";
	}
	
	
}
