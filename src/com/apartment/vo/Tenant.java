package com.apartment.vo;

public class Tenant {
	private String id;
	private String firstName;
	private String middleName;
	private String lastName;
	private String sex;
	private String age;
	private String phone;
	private String emailId;
	private String apartId;
	
	private String leaseStartDate;
	private String leaseEndDate;
	private String identificationDocumentType;
	private String identificationDocumentId;
	private String identificationDocumentExpiryDate;
	private String occupation;
	private String annualIncome;
	private String permanentAddress;
	private String description;
	
	public Tenant( ) {
		
	}
	
	public Tenant(boolean bSetDefaultValue ) {
		if (bSetDefaultValue) {
			this.setFirstName("vardhini");
			this.setMiddleName("vikash");
			this.setLastName("Kashyap");
			this.setAge("3");
			this.setAnnualIncome("0");
			this.setDescription("Hi");
			this.setEmailId("vardhinikashyap@gmail.com");
			this.setIdentificationDocumentId("F1234");
			this.setIdentificationDocumentType("I797");
			this.setIdentificationDocumentExpiryDate("02/20/2017");
			this.setOccupation("student");
			this.setPermanentAddress("india");
			this.setSex("Female");
			this.setPhone("4088961033");
			this.setApartId("3");
			this.setLeaseEndDate("02/20/2020");
			this.setLeaseStartDate("02/20/2017");
		}
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
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


	public String getApartId() {
		return apartId;
	}


	public void setApartId(String apartId) {
		this.apartId = apartId;
	}


	public String getLeaseStartDate() {
		return leaseStartDate;
	}


	public void setLeaseStartDate(String leaseStartDate) {
		this.leaseStartDate = leaseStartDate;
	}


	public String getLeaseEndDate() {
		return leaseEndDate;
	}


	public void setLeaseEndDate(String leaseEndDate) {
		this.leaseEndDate = leaseEndDate;
	}


	public String getIdentificationDocumentType() {
		return identificationDocumentType;
	}


	public void setIdentificationDocumentType(String identificationDocumentType) {
		this.identificationDocumentType = identificationDocumentType;
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
		return "Tenant [tenantId=" + id + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", lastName=" + lastName
				+ ", sex=" + sex + ", age=" + age + ", phone=" + phone
				+ ", emailId=" + emailId + ", apartId=" + apartId
				+ ", leaseStartDate=" + leaseStartDate + ", leaseEndDate="
				+ leaseEndDate + ", identificationDocumentType="
				+ identificationDocumentType + ", identificationDocumentID="
				+ identificationDocumentId
				+ ", identificationDocumentExpiryDate="
				+ identificationDocumentExpiryDate + ", occupation="
				+ occupation + ", annualIncome=" + annualIncome
				+ ", permanentAddress=" + permanentAddress + ", description="
				+ description + "]";
	}
	

	

	
	
	
}
