package com.sapient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.model.City;
import com.sapient.repository.CityRepository;

@RestController
public class SpringController {
	@Autowired
	private CityRepository cityRepository;
	
	@RequestMapping("hello")
	public List<City> findByName() {
		return cityRepository.findByNameEndingWithAndPopulationLessThan("est", 1800000);
	}
	
	
}
