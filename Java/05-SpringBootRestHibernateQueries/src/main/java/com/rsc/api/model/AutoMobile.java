package com.rsc.api.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


//https://www.baeldung.com/database-auditing-jpa
//com.rsc.api.model.AutoMobile
@MappedSuperclass
public class AutoMobile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String type;
	
	private int engineCapacity;
	
	@Column(unique = true)
	private String vin;
	
	private Fuel fuel;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date manfDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date sellingDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public Fuel getFuel() {
		return fuel;
	}

	public void setFuel(Fuel fuel) {
		this.fuel = fuel;
	}

	public Date getManfDate() {
		return manfDate;
	}

	public void setManfDate(Date manfDate) {
		this.manfDate = manfDate;
	}

	public Date getSellingDate() {
		return sellingDate;
	}

	public void setSellingDate(Date sellingDate) {
		this.sellingDate = sellingDate;
	}
	
	
	
}
