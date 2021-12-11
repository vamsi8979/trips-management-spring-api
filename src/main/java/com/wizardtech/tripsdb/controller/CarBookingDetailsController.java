package com.wizardtech.tripsdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wizardtech.tripsdb.model.CancelRequest;
import com.wizardtech.tripsdb.model.CarBookingDetails;
import com.wizardtech.tripsdb.service.CarBookingDetailsService;

@RestController
public class CarBookingDetailsController {
	@Autowired
	private CarBookingDetailsService carBookingDetailsService;
	
	@RequestMapping("/car/booking/details")
	public ResponseEntity<List<CarBookingDetails>> findAll() {
		try {
		    return new ResponseEntity<>(carBookingDetailsService.findAll(), HttpStatus.OK);
		} catch (Exception e) {
		    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping("/car/booking/details/{id}")
	public ResponseEntity<CarBookingDetails> getCarBookingDetails(@PathVariable("id") String id) {
		try {
		    return new ResponseEntity<>(carBookingDetailsService.getCarBookingDetails(id), HttpStatus.OK);
		} catch (Exception e) {
		    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/car/booking/cancel")
	public ResponseEntity<String> cancelCarBooking(@RequestBody CancelRequest cancelRequest) {
		try {
			carBookingDetailsService.cancelCarBooking(cancelRequest);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
