package com.wizardtech.tripsdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wizardtech.tripsdb.model.FlightDetails;
import com.wizardtech.tripsdb.service.FlightDetailsService;

@RestController
public class FlightDetailsController {
	@Autowired
	private FlightDetailsService flightDetailsService;
	
	@RequestMapping("/flight/details")
	public ResponseEntity<List<FlightDetails>> findAll() {
		try {
			return new ResponseEntity<>(flightDetailsService.findAll(), HttpStatus.OK);			
		}
		catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
