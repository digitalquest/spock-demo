package net.sammy.spockdemo.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
//@Data
public class Vehicle {
	String name;
	Integer year;
	
	@ManyToOne
	Manufacturer manufacturer;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

}
