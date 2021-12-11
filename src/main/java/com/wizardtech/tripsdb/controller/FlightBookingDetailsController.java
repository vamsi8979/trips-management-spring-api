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
import com.wizardtech.tripsdb.model.FlightBookingDetails;
import com.wizardtech.tripsdb.service.FlightBookingDetailsService;

@RestController
public class FlightBookingDetailsController {
	@Autowired
	private FlightBookingDetailsService flightBookingDetailsService;
	
	@RequestMapping("/flight/booking/details")
	public ResponseEntity<List<FlightBookingDetails>> findAll() {
		try {
			return new ResponseEntity<>(flightBookingDetailsService.findAll(), HttpStatus.OK);			
		}
		catch (Exception e) {
		    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping("/flight/booking/details/{id}")
	public ResponseEntity<FlightBookingDetails> getCarBookingDetails(@PathVariable("id") String id) {
		try {
			return new ResponseEntity<>(flightBookingDetailsService.getFlightBookingDetails(id), HttpStatus.OK);			
		}
		catch (Exception e) {
		    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	@RequestMapping(method=RequestMethod.PUT,value="/flight/booking/cancel")
	public ResponseEntity<String> cancelCarBooking(@RequestBody CancelRequest cancelRequest) {
		try {
			flightBookingDetailsService.cancelFlightBooking(cancelRequest);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (Exception e) {
		    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
