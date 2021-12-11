package com.wizardtech.tripsdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wizardtech.tripsdb.model.CancelRequest;
import com.wizardtech.tripsdb.model.CarBookingDetails;
import com.wizardtech.tripsdb.model.StatusConstants;
import com.wizardtech.tripsdb.repository.CarBookingDetailsRepository;

@Service
public class CarBookingDetailsService {
	@Autowired
	CarBookingDetailsRepository carBookingDetailsRepository;
	@Autowired
	TripsDetailsService tripsDetailsService;
	@Autowired
	TripsListService tripsListService;
	public List<CarBookingDetails> findAll(){
		List<CarBookingDetails> bookingDetails = carBookingDetailsRepository.findAll();
		return bookingDetails;
	}

	public CarBookingDetails getCarBookingDetails(String id) {
		return carBookingDetailsRepository.findOne(id);
	}

	public void cancelCarBooking(CancelRequest cancelRequest) {
		CarBookingDetails carBookingDetails =  getCarBookingDetails(cancelRequest.confirmationId);
		carBookingDetails.setStatus(StatusConstants.CANCELLED);
		carBookingDetailsRepository.save(carBookingDetails);
		tripsDetailsService.cancelTripDetailsbyId(cancelRequest.tripId, cancelRequest.confirmationId);
		tripsListService.cancelTripsbyId(cancelRequest.tripId);
	}
}
