package com.rsc.api.model;

import javax.persistence.Entity;


/**
 * Common Animal ID in both the tables. in this table, it will ack as pk and fk
 * @author train
 *
 */
@Entity
public class Bat extends Animal {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
