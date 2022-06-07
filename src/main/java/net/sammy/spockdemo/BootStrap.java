package net.sammy.spockdemo;

import org.springframework.stereotype.Component;

import net.sammy.spockdemo.domain.Manufacturer;
import net.sammy.spockdemo.service.ManufacturerService;

@Component
public class BootStrap {
	private final ManufacturerService service;

	public BootStrap(ManufacturerService manufacturerService) {
		service = manufacturerService;
	}


	public void init() {
		Manufacturer audi = new Manufacturer("audi");
		
	}

}
