package net.sammy.spockdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.sammy.spockdemo.domain.Manufacturer;

public interface ManufacturerRepository extends JpaRepository<Manufacturer, String> {
	List<Manufacturer> findAll();

}
