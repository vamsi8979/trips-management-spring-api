package com.wizardtech.tripsdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wizardtech.tripsdb.model.StatusConstants;
import com.wizardtech.tripsdb.model.TripDetails;
import com.wizardtech.tripsdb.repository.TripsDetailsRepository;

@Service
public class TripsDetailsService {
	@Autowired
	TripsDetailsRepository tripsDetailsRepository;
	
	public TripDetails getTripDetails(String id) {
		TripDetails tripDetails = tripsDetailsRepository.findOne(id);
		return tripDetails;
	}
	
	public List<TripDetails> findAllTripsDetails() {
		return tripsDetailsRepository.findAll();
	}

	public void cancelTripDetailsbyId(String tripId, String confirmationId) {
		TripDetails tripDetails = tripsDetailsRepository.findOne(tripId);
	
		boolean isCar = confirmationId.equalsIgnoreCase(tripDetails.getCarBookingId());
		boolean isFlight = confirmationId.equalsIgnoreCase(tripDetails.getFlightBookingId());
		boolean isHotel = confirmationId.equalsIgnoreCase(tripDetails.getHotelBookingId());

		if(isCar) {
			tripDetails.getCarInfo().setStatus(StatusConstants.CANCELLED);
		}
		else if(isFlight) {
			tripDetails.getFlightInfo().setStatus(StatusConstants.CANCELLED);
		}
		else if(isHotel) {
			tripDetails.getHotelInfo().setStatus(StatusConstants.CANCELLED);
		}
		int bookCount = 0;
		
		if(tripDetails.isFlightBooked()) {
			if(tripDetails.getFlightInfo().getStatus().equalsIgnoreCase(StatusConstants.BOOKED)) {
				bookCount ++;
			}
		}
		if(tripDetails.isCarBooked()) {
			if(tripDetails.getCarInfo().getStatus().equalsIgnoreCase(StatusConstants.BOOKED)) {
				bookCount ++;
			}
		}
		if(tripDetails.isHotelBooked()) {
			if(tripDetails.getHotelInfo().getStatus().equalsIgnoreCase(StatusConstants.BOOKED)) {
				bookCount ++;
			}
		}
		
		if(bookCount == 0) {
			tripDetails.setStatus(StatusConstants.CANCELLED);
		}
		else {
			tripDetails.setStatus(StatusConstants.PARTIALLY_CANCELLED);
		}
		
		tripsDetailsRepository.save(tripDetails);
	}
}
