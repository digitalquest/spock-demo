package net.sammy.spockdemo.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
//@Data
public class Manufacturer {
	String name;
	
	@OneToMany
	List<Vehicle> vehicles;

	public Manufacturer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}
}
