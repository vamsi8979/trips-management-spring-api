package com.wizardtech.tripsdb.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document("car_booking_details")
public class CarBookingDetails {
	@Id
	private ObjectId _id;
	private String id;
	private String status;
	private String carId;
	private String pickUpLocation;
	private String dropOffLocation;
	private String pickUpLocationCode;
	private String dropOffLocationCode;
	private String startDate;
	private String endDate;
	private String pickUpTime;
	private String dropOffTime;
	private String cancelledDate;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCarId() {
		return carId;
	}
	public void setCarId(String carId) {
		this.carId = carId;
	}
	public String getPickUpLocation() {
		return pickUpLocation;
	}
	public void setPickUpLocation(String pickUpLocation) {
		this.pickUpLocation = pickUpLocation;
	}
	public String getDropOffLocation() {
		return dropOffLocation;
	}
	public void setDropOffLocation(String dropOffLocation) {
		this.dropOffLocation = dropOffLocation;
	}
	public String getPickUpLocationCode() {
		return pickUpLocationCode;
	}
	public void setPickUpLocationCode(String pickUpLocationCode) {
		this.pickUpLocationCode = pickUpLocationCode;
	}
	public String getDropOffLocationCode() {
		return dropOffLocationCode;
	}
	public void setDropOffLocationCode(String dropOffLocationCode) {
		this.dropOffLocationCode = dropOffLocationCode;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getPickUpTime() {
		return pickUpTime;
	}
	public void setPickUpTime(String pickUpTime) {
		this.pickUpTime = pickUpTime;
	}
	public String getDropOffTime() {
		return dropOffTime;
	}
	public void setDropOffTime(String dropOffTime) {
		this.dropOffTime = dropOffTime;
	}
	public String getCancelledDate() {
		return cancelledDate;
	}
	public void setCancelledDate(String cancelledDate) {
		this.cancelledDate = cancelledDate;
	}

}
