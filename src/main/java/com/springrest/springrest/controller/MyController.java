package com.springrest.springrest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.train;
import com.springrest.springrest.services.TrainService;

@RestController
public class MyController {
	
	@Autowired
	private TrainService trainService;
	
	@GetMapping("/train")
	public List<train> getTrain(){
		return this.trainService.getTrains();
	}
	
	@GetMapping("/train/{Tno}")
	public Optional<train> getTrain(@PathVariable String Tno) {
		return this.trainService.getTrains(Long.parseLong(Tno));
		
	}
	
	@PostMapping("/train")
	public train addTrain(@RequestBody train Train) {
		return this.trainService.addTrain (Train);
		
	}
	
	@PutMapping("/train")
	public train updateTrain(@RequestBody train Train) {
		return this.trainService.updateTrain(Train);
	}
	
	@DeleteMapping("/train/{Tno}")
//	public ResponseEntity<HttpStatus> deleteTrain(@PathVariable String Tno){
//		try {
//			this.trainService.deleteTrain(Long.parseLong(Tno));
//			return new ResponseEntity<>(HttpStatus.OK);
//		}catch(Exception e) {
//			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//		}
	public void deleteTrain(@PathVariable String Tno) {
		trainService.deleteTrain(Long.parseLong(Tno));
	}
	}
	
