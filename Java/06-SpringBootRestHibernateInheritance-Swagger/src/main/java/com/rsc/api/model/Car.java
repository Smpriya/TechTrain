package com.rsc.api.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import io.swagger.annotations.ApiModel;

@Entity
@ApiModel(description="The Model that holds the Car Details, and Sub Class of AutoMobile")
public class Car extends AutoMobile {
	private String color;
	
	private String manufacturer;
	
	private String year;
	
	private boolean isRightHandDrive;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public boolean getIsRightHandDrive() {
		return isRightHandDrive;
	}

	public void setIsRightHandDrive(boolean isRightHandDrive) {
		this.isRightHandDrive = isRightHandDrive;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", manufacturer=" + manufacturer + ", year=" + year + ", isRightHandDrive="
				+ isRightHandDrive + ", getId()=" + getId() + ", getType()=" + getType() + ", getEngineCapacity()="
				+ getEngineCapacity() + ", getVin()=" + getVin() + ", getFuel()=" + getFuel() + ", getManfDate()="
				+ getManfDate() + ", getSellingDate()=" + getSellingDate() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
