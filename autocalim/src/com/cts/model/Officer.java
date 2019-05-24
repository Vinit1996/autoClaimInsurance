package com.cts.model;

public class Officer {
	
	private String officer_id;
	private String assessor_id;
	private String assessor_contact;
	private String assessor_email;
	public Officer(String officer_id, String assessor_id, String assessor_contact, String assessor_email) {
		super();
		this.officer_id = officer_id;
		this.assessor_id = assessor_id;
		this.assessor_contact = assessor_contact;
		this.assessor_email = assessor_email;
	}
	public Officer() {
		super();
		
	}
	public String getOfficer_id() {
		return officer_id;
	}
	public void setOfficer_id(String officer_id) {
		this.officer_id = officer_id;
	}
	public String getAssessor_id() {
		return assessor_id;
	}
	public void setAssessor_id(String assessor_id) {
		this.assessor_id = assessor_id;
	}
	public String getAssessor_contact() {
		return assessor_contact;
	}
	public void setAssessor_contact(String assessor_contact) {
		this.assessor_contact = assessor_contact;
	}
	public String getAssessor_email() {
		return assessor_email;
	}
	public void setAssessor_email(String assessor_email) {
		this.assessor_email = assessor_email;
	}
	

}
