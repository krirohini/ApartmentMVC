package com.apartment.vo;

public class Floor {
	
	private int floorId;
	private int bed;
	private int bath;
	private int rent;
	private int sqft;
	private int deposit;
	
	public int getFloorId() {
		return floorId;
	}
	public void setFloorId(int floorId) {
		this.floorId = floorId;
	}
	public int getBed() {
		return bed;
	}
	public void setBed(int bed) {
		this.bed = bed;
	}
	public int getBath() {
		return bath;
	}
	public void setBath(int bath) {
		this.bath = bath;
	}
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
	public int getSqft() {
		return sqft;
	}
	public void setSqft(int sqft) {
		this.sqft = sqft;
	}
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	
	@Override
	public String toString() {
		return "Floor [floorId=" + floorId + ", bed=" + bed + ", bath=" + bath
				+ ", rent=" + rent + ", sqft=" + sqft + ", deposit=" + deposit
				+ "]";
	}	
	
}
