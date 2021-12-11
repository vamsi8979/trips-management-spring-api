package com.wizardtech.tripsdb.model;

public class CarInfo {
    private String status ;
    private String pickUpLocationCode ;
    private String dropOffLocationCode ;
    private String startDate ;
    private String endDate ;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
}
