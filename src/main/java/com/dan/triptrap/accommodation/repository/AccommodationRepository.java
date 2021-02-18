package com.dan.triptrap.accommodation.repository;

import org.springframework.data.repository.CrudRepository;

import com.dan.triptrap.accommodation.entity.Accommodation;

public interface AccommodationRepository extends CrudRepository<Accommodation, Long>{
	Accommodation findByName(String name);

}
