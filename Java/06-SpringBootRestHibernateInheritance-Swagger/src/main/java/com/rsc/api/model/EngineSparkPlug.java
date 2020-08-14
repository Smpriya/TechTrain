package com.rsc.api.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("3")
public class EngineSparkPlug extends AutoParts {
	
	private Fuel fuel;
	
	private int length;
	
	private int volt;

	public Fuel getFuel() {
		return fuel;
	}

	public void setFuel(Fuel fuel) {
		this.fuel = fuel;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getVolt() {
		return volt;
	}

	public void setVolt(int volt) {
		this.volt = volt;
	}

	@Override
	public String toString() {
		return "EngineSparkPlug [fuel=" + fuel + ", length=" + length + ", volt=" + volt + "]";
	}
	
		
}
