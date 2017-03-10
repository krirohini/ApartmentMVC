package com.apartment.vo;

public class Apartment {
	
	private int id;
	private String buildingNo;
	private String noOfOccupants;
	private String currentRent;
	private String modelId;
	private int tenantId;
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getBuildingNo() {
		return buildingNo;
	}



	public void setBuildingNo(String buildingNo) {
		this.buildingNo = buildingNo;
	}



	public String getNoOfOccupants() {
		return noOfOccupants;
	}



	public void setNoOfOccupants(String noOfOccupants) {
		this.noOfOccupants = noOfOccupants;
	}



	public String getCurrentRent() {
		return currentRent;
	}



	public void setCurrentRent(String currentRent) {
		this.currentRent = currentRent;
	}



	public String getModelId() {
		return modelId;
	}



	public void setModelId(String modelId) {
		this.modelId = modelId;
	}



	public int getTenantId() {
		return tenantId;
	}



	public void setTenantId(int tenantId) {
		this.tenantId = tenantId;
	}



	@Override
	public String toString() {
		return "Apartment [id=" + id + ", buildingNo=" + buildingNo
				+ ", noOfOccupants=" + noOfOccupants + ", currentRent="
				+ currentRent + ", modelId=" + modelId + ", tenantId="
				+ tenantId + "]";
	}
	
	
	
}
