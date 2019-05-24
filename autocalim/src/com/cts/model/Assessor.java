package com.cts.model;

public class Assessor {

	private String assessor_name;
	private String assessor_id;
	private String assessor_gender;
	private Long assessor_contact;
	private String report_status;
	private String claim_id;
	private String assessor_email;
	

	public Assessor(String assessor_name, String assessor_id, String assessor_gender, Long assessor_contact,
			String report_status, String claim_id,String assessor_email) {
		super();
		this.assessor_name = assessor_name;
		this.assessor_id = assessor_id;
		this.assessor_gender = assessor_gender;
		this.assessor_contact = assessor_contact;
		this.report_status = report_status;
		this.claim_id = claim_id;
		this.assessor_email=assessor_email;
	}
	
	public Assessor() {
		super();
		
	}

	public String getAssessor_name() {
		return assessor_name;
	}
	public void setAssessor_name(String assessor_name) {
		this.assessor_name = assessor_name;
	}
	public String getAssessor_id() {
		return assessor_id;
	}
	public void setAssessor_id(String assessor_id) {
		this.assessor_id = assessor_id;
	}
	public String getAssessor_gender() {
		return assessor_gender;
	}
	public void setAssessor_gender(String assessor_gender) {
		this.assessor_gender = assessor_gender;
	}
	public Long getAssessor_contact() {
		return assessor_contact;
	}
	public void setAssessor_contact(Long assessor_contact) {
		this.assessor_contact = assessor_contact;
	}
	public String getReport_status() {
		return report_status;
	}
	public void setReport_status(String report_status) {
		this.report_status = report_status;
	}
	public String getClaim_id() {
		return claim_id;
	}
	public void setClaim_id(String claim_id) {
		this.claim_id = claim_id;
	}
	public String getAssessor_email() {
		return assessor_email;
	}

	public void setAssessor_email(String assessor_email) {
		this.assessor_email = assessor_email;
	}
	
}
