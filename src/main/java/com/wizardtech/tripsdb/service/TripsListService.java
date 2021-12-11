package com.wizardtech.tripsdb.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wizardtech.tripsdb.model.TripDetails;
import com.wizardtech.tripsdb.model.TripsList;
import com.wizardtech.tripsdb.repository.TripsListRepository;


@Service
public class TripsListService {

	@Autowired
	TripsListRepository tripsListServiceRepo;
	@Autowired
	TripsDetailsService tripsDetailsService;
	private List<TripsList> tripsLists = Arrays.asList(
			new TripsList("721423","Booked","23-10-2020","13-11-2020","14-11-2020",null,"12000", "USD"),
			new TripsList("621424", "Booked", "04-10-2020", "20-10-2020", "22-10-2020", null, "13000", "USD"),
			new TripsList("784578", "Cancelled", "25-10-2020", "25-11-2020", "28-11-2020", null, "52600", "USD")
    );
	public List<TripsList> getTripsList() {
		return tripsLists;
	}
	public List<TripsList> getDBTripsList(){
		return tripsListServiceRepo.findAll();
	}
	public TripsList getOneTripFromList(String id) {
		return tripsListServiceRepo.findOne(id);
	}
	public void addTripList(TripsList tripList) {
		tripsListServiceRepo.save(tripList);
	}
	public void cancelTripsbyId(String tripId) {
		TripDetails tripDetails = tripsDetailsService.getTripDetails(tripId);
		TripsList tripsList = tripsListServiceRepo.findOne(tripId);
		tripsList.setStatus(tripDetails.getStatus());
		tripsListServiceRepo.save(tripsList);
	}
}