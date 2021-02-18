package com.dan.triptrap.room.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dan.triptrap.room.entity.Room;
import com.dan.triptrap.room.repository.RoomRepository;

@RestController
@RequestMapping("/room")
public class RoomController {
	
	@Autowired
	RoomRepository repository;

	@GetMapping("/{id}")
	Room findRoom(@PathVariable(name = "id")Long id) {
		return repository.findById(id).orElseThrow();
	}
	
	@PostMapping
	Room saveRoom(@ModelAttribute Room room) {
		return repository.save(room);
	}
	
	@PutMapping
	Room updateRoom(@ModelAttribute Room room) {
		return repository.save(room);
	}
	
	@DeleteMapping
	void deleteRoom(@ModelAttribute Room room) {
		repository.delete(room);
	}
	
}
