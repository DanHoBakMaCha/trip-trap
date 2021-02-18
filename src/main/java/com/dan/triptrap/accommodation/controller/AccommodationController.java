package com.dan.triptrap.accommodation.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dan.triptrap.accommodation.entity.Accommodation;
import com.dan.triptrap.accommodation.entity.AccommodationType;
import com.dan.triptrap.accommodation.repository.AccommodationRepository;

@RestController
@RequestMapping("/accommodations")
public class AccommodationController {
	
	@Autowired
	AccommodationRepository repository;
	
	@GetMapping("/{id}")
	Accommodation findAccommodation(@PathVariable(name = "id") Long id) {
		return repository.findById(id).orElseThrow();
	}
	
	@PostMapping
	Accommodation saveAccommodation(@ModelAttribute Accommodation accommodation) {
		return repository.save(accommodation);
	}
	
	@PutMapping
	Accommodation updateAccommodation(@ModelAttribute Accommodation accommodation) {
		return repository.save(accommodation);
	}
	
	@DeleteMapping
	void deleteAccommodation(@ModelAttribute Accommodation accommodation) {
		repository.delete(accommodation);
	}
	
	@GetMapping("/types")
	List<AccommodationType> findAccommodationType() {
		
		List<AccommodationType> types = Arrays.asList(AccommodationType.values());
		
		return types;
	}

}
