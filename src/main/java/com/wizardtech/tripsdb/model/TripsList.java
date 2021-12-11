package com.wizardtech.tripsdb.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("trips_list")
public class TripsList {
	@Id
	private ObjectId _id;
	private String id;
	private String status;
	private String bookedDate;
	private String startDate;
	private String endDate;
	private String cancelledDate;
	private String totalCost;
	private String currencyCode;
	
	public TripsList() {
		
	}
	public TripsList(String id, String status, String bookedDate, String startDate, String endDate,
			String cancelledDate, String totalCost, String currencyCode) {
		super();
		this.id = id;
		this.status = status;
		this.bookedDate = bookedDate;
		this.startDate = startDate;
		this.endDate = endDate;
		this.cancelledDate = cancelledDate;
		this.totalCost = totalCost;
		this.currencyCode = currencyCode;
	}
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
	public String getBookedDate() {
		return bookedDate;
	}
	public void setBookedDate(String bookedDate) {
		this.bookedDate = bookedDate;
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
	public String getCancelledDate() {
		return cancelledDate;
	}
	public void setCancelledDate(String cancelledDate) {
		this.cancelledDate = cancelledDate;
	}
	public String getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(String totalCost) {
		this.totalCost = totalCost;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	
	
}
