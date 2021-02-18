package com.dan.triptrap.accommodation.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Accommodation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter
	private Long id;
	
	@Getter	@Setter
	private String name;
	
	@Enumerated(EnumType.STRING)
	@Getter	@Setter
	AccommodationType type;
	
	@Getter	@Setter
	private String phone;
}
