package net.sammy.spockdemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import net.sammy.spockdemo.domain.Manufacturer;
import net.sammy.spockdemo.repository.ManufacturerRepository;

@Service
//@RequiredArgsConstructor
public class ManufacturerService {
	private final ManufacturerRepository repository;
	
	public ManufacturerService(ManufacturerRepository repository) {
		super();
		this.repository = repository;
	}

	public List<Manufacturer> findAll() {
		return repository.findAll();
	}

}
