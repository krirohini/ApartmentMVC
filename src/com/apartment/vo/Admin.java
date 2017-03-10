package com.apartment.vo;

public class Admin {
	
	private int id;
	private String adminType;
	private String firstName;
	private String middleName;
	private String lastName;
	private String sex;
	private String age;
	private String phone;
	private String emailId;
	private String identificationDocumentId;
	private String identificationDocumentExpiryDate;
	private String occupation;
	private String annualIncome;
	private String permanentAddress;
	private String description;
		
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdminType() {
		return adminType;
	}
	public void setAdminType(String adminType) {
		this.adminType = adminType;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getIdentificationDocumentId() {
		return identificationDocumentId;
	}
	public void setIdentificationDocumentId(String identificationDocumentId) {
		this.identificationDocumentId = identificationDocumentId;
	}
	public String getIdentificationDocumentExpiryDate() {
		return identificationDocumentExpiryDate;
	}
	public void setIdentificationDocumentExpiryDate(
			String identificationDocumentExpiryDate) {
		this.identificationDocumentExpiryDate = identificationDocumentExpiryDate;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(String annualIncome) {
		this.annualIncome = annualIncome;
	}
	public String getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + id + ", adminType=" + adminType
				+ ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", sex=" + sex + ", age=" + age
				+ ", phone=" + phone + ", emailID=" + emailId
				+ ", identificationDocumentID=" + identificationDocumentId
				+ ", identificationDocumentExpiryDate="
				+ identificationDocumentExpiryDate + ", occupation="
				+ occupation + ", annualIncome=" + annualIncome
				+ ", permanentAddress=" + permanentAddress + ", description="
				+ description + "]";
	}
	
}
