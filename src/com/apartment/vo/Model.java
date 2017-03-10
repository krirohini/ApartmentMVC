package com.apartment.vo;

public class Model {

	private String id;
	private int noOfBedrooms;
	private int noOfBathrooms;
	private String rentRange;
	private String area;
	private String securityDeposite;
	private int maxOccupancy;
	

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public int getNoOfBedrooms() {
		return noOfBedrooms;
	}


	public void setNoOfBedrooms(int noOfBedrooms) {
		this.noOfBedrooms = noOfBedrooms;
	}


	public int getNoOfBathrooms() {
		return noOfBathrooms;
	}


	public void setNoOfBathrooms(int noOfBathrooms) {
		this.noOfBathrooms = noOfBathrooms;
	}


	public String getRentRange() {
		return rentRange;
	}


	public void setRentRange(String rentRange) {
		this.rentRange = rentRange;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public String getSecurityDeposite() {
		return securityDeposite;
	}


	public void setSecurityDeposite(String securityDeposite) {
		this.securityDeposite = securityDeposite;
	}


	public int getMaxOccupancy() {
		return maxOccupancy;
	}


	public void setMaxOccupancy(int maxOccupancy) {
		this.maxOccupancy = maxOccupancy;
	}


	@Override
	public String toString() {
		return "Model [id=" + id + ", noOfBedrooms=" + noOfBedrooms
				+ ", noOfBathrooms=" + noOfBathrooms + ", rentRange="
				+ rentRange + ", area=" + area + ", securityDeposite="
				+ securityDeposite + ", maxOccupancy=" + maxOccupancy + "]";
	}
	
}
