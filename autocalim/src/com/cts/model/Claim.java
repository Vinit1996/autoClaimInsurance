package com.cts.model;

import java.util.*;

public class Claim {
	
	
	private String claim_id;
	private String officer_id;
	private String cust_id;
	private Integer claim_amount;
	private Date date_of_claim;
	private String claim_status;
	private String assessor_id;
	
	
	public Claim(String claim_id,String officer_id,  String cust_id, Integer claim_amount, Date date,
			String claim_status, String assessor_id) {
		super();
		this.officer_id = officer_id;
		this.claim_id = claim_id;
		this.cust_id = cust_id;
		this.claim_amount = claim_amount;
		this.date_of_claim = date;
		this.claim_status = claim_status;
		this.assessor_id = assessor_id;
	}
	public Claim() {
		super();
		
	}
	public String getOfficer_id() {
		return officer_id;
	}
	public void setOfficer_id(String officer_id) {
		this.officer_id = officer_id;
	}
	public String getClaim_id() {
		return claim_id;
	}
	public void setClaim_id(String claim_id) {
		this.claim_id = claim_id;
	}
	public String getCust_id() {
		return cust_id;
	}
	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}
	public Integer getClaim_amount() {
		return claim_amount;
	}
	public void setClaim_amount(Integer claim_amount) {
		this.claim_amount = claim_amount;
	}
	public Date getDate_of_claim() {
		return date_of_claim;
	}
	public void setDate_of_claim(Date date_of_claim) {
		this.date_of_claim = date_of_claim;
	}
	public String getClaim_status() {
		return claim_status;
	}
	public void setClaim_status(String claim_status) {
		this.claim_status = claim_status;
	}
	public String getAssessor_id() {
		return assessor_id;
	}
	public void setAssessor_id(String assessor_id) {
		this.assessor_id = assessor_id;
	}
	

}
