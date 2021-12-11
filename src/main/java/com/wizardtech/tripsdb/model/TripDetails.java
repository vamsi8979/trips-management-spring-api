package com.wizardtech.tripsdb.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("trip_details")
public class TripDetails {
	@Id
	private ObjectId _id;
	private String id;
	private String bookedDate;
	private String status;
	private float totalCost;
	private String currencyCode;
	private boolean isFlightBooked;
	private boolean isHotelBooked;
	private boolean isCarBooked;
	private String flightBookingId;
	private String hotelBookingId;
	private String carBookingId;
	private FlightInfo flightInfo;
	private HotelInfo hotelInfo;
	private CarInfo carInfo;
	public ObjectId get_id() {
		return _id;
	}
	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBookedDate() {
		return bookedDate;
	}
	public void setBookedDate(String bookedDate) {
		this.bookedDate = bookedDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public float getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public boolean isFlightBooked() {
		return isFlightBooked;
	}
	public void setFlightBooked(boolean isFlightBooked) {
		this.isFlightBooked = isFlightBooked;
	}
	public boolean isHotelBooked() {
		return isHotelBooked;
	}
	public void setHotelBooked(boolean isHotelBooked) {
		this.isHotelBooked = isHotelBooked;
	}
	public boolean isCarBooked() {
		return isCarBooked;
	}
	public void setCarBooked(boolean isCarBooked) {
		this.isCarBooked = isCarBooked;
	}
	public String getFlightBookingId() {
		return flightBookingId;
	}
	public void setFlightBookingId(String flightBookingId) {
		this.flightBookingId = flightBookingId;
	}
	public String getHotelBookingId() {
		return hotelBookingId;
	}
	public void setHotelBookingId(String hotelBookingId) {
		this.hotelBookingId = hotelBookingId;
	}
	public String getCarBookingId() {
		return carBookingId;
	}
	public void setCarBookingId(String carBookingId) {
		this.carBookingId = carBookingId;
	}
	public FlightInfo getFlightInfo() {
		return flightInfo;
	}
	public void setFlightInfo(FlightInfo flightInfo) {
		this.flightInfo = flightInfo;
	}
	public HotelInfo getHotelInfo() {
		return hotelInfo;
	}
	public void setHotelInfo(HotelInfo hotelInfo) {
		this.hotelInfo = hotelInfo;
	}
	public CarInfo getCarInfo() {
		return carInfo;
	}
	public void setCarInfo(CarInfo carInfo) {
		this.carInfo = carInfo;
	}
}
