package com.dan.triptrap.room.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.dan.triptrap.accommodation.entity.Accommodation;

import lombok.Getter;
import lombok.Setter;

public class Room {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter
	private Long id;
	
	@Getter	@Setter
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "ID")
	@Getter	@Setter
	Accommodation accomodation;
	
	@Getter	@Setter
	private int sleeps;
	
	@Getter	@Setter
	private int price;
}
