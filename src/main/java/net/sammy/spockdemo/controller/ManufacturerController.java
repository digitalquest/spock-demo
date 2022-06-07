package net.sammy.spockdemo.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import net.sammy.spockdemo.domain.Manufacturer;
import net.sammy.spockdemo.service.ManufacturerService;

@RestController
public class ManufacturerController {
	private final ManufacturerService service;

	public ManufacturerController(ManufacturerService service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/")
	List<String> findAll() {
		return service.findAll().stream().map(Manufacturer::getName).collect(Collectors.toList());
	}

}
