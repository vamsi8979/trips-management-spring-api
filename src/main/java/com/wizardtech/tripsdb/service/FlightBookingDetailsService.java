package com.wizardtech.tripsdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wizardtech.tripsdb.model.CancelRequest;
import com.wizardtech.tripsdb.model.FlightBookingDetails;
import com.wizardtech.tripsdb.model.StatusConstants;
import com.wizardtech.tripsdb.repository.FlightBookingDetailsRepository;

@Service
public class FlightBookingDetailsService {
	@Autowired
	FlightBookingDetailsRepository flightBookingDetailsRepository;
	@Autowired
	TripsDetailsService tripsDetailsService;
	@Autowired
	TripsListService tripsListService;
	public List<FlightBookingDetails> findAll(){
		List<FlightBookingDetails> bookingDetails = flightBookingDetailsRepository.findAll();
		return bookingDetails;
	}

	public FlightBookingDetails getFlightBookingDetails(String id) {
		return flightBookingDetailsRepository.findOne(id);
	}

	public void cancelFlightBooking(CancelRequest cancelRequest) {
		FlightBookingDetails flightBookingDetails =  getFlightBookingDetails(cancelRequest.confirmationId);
		flightBookingDetails.setStatus(StatusConstants.CANCELLED);
		flightBookingDetailsRepository.save(flightBookingDetails);
		tripsDetailsService.cancelTripDetailsbyId(cancelRequest.tripId, cancelRequest.confirmationId);
		tripsListService.cancelTripsbyId(cancelRequest.tripId);
	}	
}
