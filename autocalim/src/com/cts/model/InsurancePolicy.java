package com.cts.model;

import java.util.Date;

public class InsurancePolicy {

	private String policy_id;
	private String cust_id;
	private Date start_date;
	private Date expiry_date;
	public InsurancePolicy(String policy_id, String cust_id, Date start_date, Date expiry_date) {
		super();
		this.policy_id = policy_id;
		this.cust_id = cust_id;
		this.start_date = start_date;
		this.expiry_date = expiry_date;
	}
	public InsurancePolicy() {
		super();
		
	}
	public String getPolicy_id() {
		return policy_id;
	}
	public void setPolicy_id(String policy_id) {
		this.policy_id = policy_id;
	}
	public String getCust_id() {
		return cust_id;
	}
	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getExpiry_date() {
		return expiry_date;
	}
	public void setExpiry_date(Date expiry_date) {
		this.expiry_date = expiry_date;
	}
	
	
	
}
