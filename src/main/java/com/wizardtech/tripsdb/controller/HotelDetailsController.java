package com.wizardtech.tripsdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wizardtech.tripsdb.model.HotelDetails;
import com.wizardtech.tripsdb.service.HotelDetailsService;

@RestController
public class HotelDetailsController {
	@Autowired
	private HotelDetailsService hotelDetailsService;
	
	@RequestMapping("/hotel/details")
	public ResponseEntity<List<HotelDetails>> findAll() {
		try {
			return new ResponseEntity<>(hotelDetailsService.findAll(), HttpStatus.OK);			
		}
		catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
