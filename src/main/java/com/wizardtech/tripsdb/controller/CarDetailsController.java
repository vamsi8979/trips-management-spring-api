package com.wizardtech.tripsdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wizardtech.tripsdb.model.CarDetails;
import com.wizardtech.tripsdb.service.CarDetailsService;

@RestController
public class CarDetailsController {
	@Autowired
	private CarDetailsService carDetailsService;
	
	@RequestMapping("/car/details")
	public ResponseEntity<List<CarDetails>> findAll() {
		try {
			return new ResponseEntity<>(carDetailsService.findAll(), HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
