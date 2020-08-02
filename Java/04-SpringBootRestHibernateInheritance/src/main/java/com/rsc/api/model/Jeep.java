package com.rsc.api.model;

import javax.persistence.Entity;

@Entity
public class Jeep extends AutoMobile {
	
	private boolean isPickUpTruckAttached;
	
	private boolean isFourWheelDrive;
	
	private boolean isCovered;

	public boolean getIsPickUpTruckAttached() {
		return isPickUpTruckAttached;
	}

	public void setIsPickUpTruckAttached(boolean isPickUpTruckAttached) {
		this.isPickUpTruckAttached = isPickUpTruckAttached;
	}

	public boolean getIsFourWheelDrive() {
		return isFourWheelDrive;
	}

	public void setIsFourWheelDrive(boolean isFourWheelDrive) {
		this.isFourWheelDrive = isFourWheelDrive;
	}

	public boolean getIsCovered() {
		return isCovered;
	}

	public void setIsCovered(boolean isCovered) {
		this.isCovered = isCovered;
	}

	@Override
	public String toString() {
		return "Jeep [isPickUpTruckAttached=" + isPickUpTruckAttached + ", isFourWheelDrive=" + isFourWheelDrive
				+ ", isCovered=" + isCovered + ", getId()=" + getId() + ", getType()=" + getType()
				+ ", getEngineCapacity()=" + getEngineCapacity() + ", getVin()=" + getVin() + ", getFuel()=" + getFuel()
				+ ", getManfDate()=" + getManfDate() + ", getSellingDate()=" + getSellingDate() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}




	
}
