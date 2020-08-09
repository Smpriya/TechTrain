package com.rsc.api.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("2")
public class EnginePiston extends AutoParts {
	
	private boolean is4Stroke;
	
	private int diameter;
	
	private int length;

	public boolean getIs4Stroke() {
		return is4Stroke;
	}

	public void setIs4Stroke(boolean is4Stroke) {
		this.is4Stroke = is4Stroke;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "EnginePiston [is4Stroke=" + is4Stroke + ", diameter=" + diameter + ", length=" + length + "]";
	}
	
		
}
