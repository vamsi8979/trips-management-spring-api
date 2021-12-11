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
import com.wizardtech.tripsdb.model.HotelBookingDetails;
import com.wizardtech.tripsdb.service.HotelBookingDetailsService;

@RestController
public class HotelBookingDetailsController {
	@Autowired
	private HotelBookingDetailsService hotelBookingDetailsService;
	
	@RequestMapping("/hotel/booking/details")
	public ResponseEntity<List<HotelBookingDetails>> findAll() {
		try {
			return new ResponseEntity<>(hotelBookingDetailsService.findAll(), HttpStatus.OK);			
		}
		catch (Exception e) {
		    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping("/hotel/booking/details/{id}")
	public ResponseEntity<HotelBookingDetails> getCarBookingDetails(@PathVariable("id") String id) {
		try {
			return new ResponseEntity<>(hotelBookingDetailsService.getHotelBookingDetails(id), HttpStatus.OK);			
		}
		catch (Exception e) {
		    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/hotel/booking/cancel")
	public ResponseEntity<String> cancelHotelBooking(@RequestBody CancelRequest cancelRequest) {
		try {
			hotelBookingDetailsService.cancelHotelBooking(cancelRequest);
			return new ResponseEntity<>(HttpStatus.OK);			
		}
		catch (Exception e) {
		    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
