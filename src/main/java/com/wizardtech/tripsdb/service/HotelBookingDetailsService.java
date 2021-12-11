package com.wizardtech.tripsdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wizardtech.tripsdb.model.CancelRequest;
import com.wizardtech.tripsdb.model.HotelBookingDetails;
import com.wizardtech.tripsdb.model.StatusConstants;
import com.wizardtech.tripsdb.repository.HotelBookingDetailsRepository;

@Service
public class HotelBookingDetailsService {
	@Autowired
	HotelBookingDetailsRepository hotelBookingDetailsRepository;
	@Autowired
	TripsDetailsService tripsDetailsService;
	@Autowired
	TripsListService tripsListService;
	public List<HotelBookingDetails> findAll(){
		List<HotelBookingDetails> bookingDetails = hotelBookingDetailsRepository.findAll();
		return bookingDetails;
	}
	
	public HotelBookingDetails getHotelBookingDetails(String id) {
		return hotelBookingDetailsRepository.findOne(id);
	}
	
	public void cancelHotelBooking(CancelRequest cancelRequest) {
		HotelBookingDetails hotelBookingDetails =  getHotelBookingDetails(cancelRequest.confirmationId);
		hotelBookingDetails.setStatus(StatusConstants.CANCELLED);
		hotelBookingDetailsRepository.save(hotelBookingDetails);
		tripsDetailsService.cancelTripDetailsbyId(cancelRequest.tripId, cancelRequest.confirmationId);
		tripsListService.cancelTripsbyId(cancelRequest.tripId);
	}
}
