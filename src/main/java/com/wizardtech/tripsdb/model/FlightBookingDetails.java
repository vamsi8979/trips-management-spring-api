package com.wizardtech.tripsdb.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document("flight_booking_details")
public class FlightBookingDetails {
	@Id
	private ObjectId _id;
	private String id;
	private String status;
	private String flightId;
	private String sourceCode;
	private String destinationCode;
	private String source;
	private String destination;
	private String startDate;
	private String endDate;
	private String startTime;
	private String endTime;
	private String journeyTime;
	private double adults;
	private double children;
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
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public String getSourceCode() {
		return sourceCode;
	}
	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}
	public String getDestinationCode() {
		return destinationCode;
	}
	public void setDestinationCode(String destinationCode) {
		this.destinationCode = destinationCode;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
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
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getJourneyTime() {
		return journeyTime;
	}
	public void setJourneyTime(String journeyTime) {
		this.journeyTime = journeyTime;
	}
	public double getAdults() {
		return adults;
	}
	public void setAdults(double adults) {
		this.adults = adults;
	}
	public double getChildren() {
		return children;
	}
	public void setChildren(double children) {
		this.children = children;
	}
	public String getCancelledDate() {
		return cancelledDate;
	}
	public void setCancelledDate(String cancelledDate) {
		this.cancelledDate = cancelledDate;
	}
	
}
