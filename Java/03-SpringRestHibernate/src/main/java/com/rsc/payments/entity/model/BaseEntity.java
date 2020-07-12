package com.rsc.payments.entity.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class BaseEntity implements Serializable {
	

	
	private String createdBy;
	
	@Temporal(TemporalType.DATE)
	private String createdDate;
	
//	public long getId() {
//		return id;
//	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

//	public void setId(long id) {
//		this.id = id;
//	}
//	
	
}
