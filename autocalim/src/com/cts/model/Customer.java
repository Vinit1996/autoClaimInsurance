package com.cts.model;

import java.util.Date;

public class Customer {

	private String cust_id;
	private String cust_name;
	private String cust_password;
	private Date cust_dob;
	private String cust_gender;
	private String cust_email;
	private String cust_address;
	private Long cust_mobile;
	private Integer policy_id;
	private String cust_status;
	private String claim_status;
	private String claim_id;

	public Customer() {
		super();

	}

	public Customer(String cust_id, String cust_name, Date cust_dob, String cust_gender, String cust_email,
			String cust_address, Long cust_mobile, Integer policy_id, String cust_status, String claim_status,
			String claim_id, String cust_password) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.cust_password = cust_password;
		this.cust_dob = cust_dob;
		this.cust_gender = cust_gender;
		this.cust_email = cust_email;
		this.cust_address = cust_address;
		this.cust_mobile = cust_mobile;
		this.policy_id = policy_id;
		this.cust_status = cust_status;
		this.claim_status = claim_status;
		this.claim_id = claim_id;
	}

	public String getCust_id() {
		return cust_id;
	}

	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public Date getCust_dob() {
		return cust_dob;
	}

	public void setCust_dob(Date cust_dob) {
		this.cust_dob = cust_dob;
	}

	public String getCust_gender() {
		return cust_gender;
	}

	public void setCust_gender(String cust_gender) {
		this.cust_gender = cust_gender;
	}

	public String getCust_email() {
		return cust_email;
	}

	public void setCust_email(String cust_email) {
		this.cust_email = cust_email;
	}

	public String getCust_address() {
		return cust_address;
	}

	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}

	public Long getCust_mobile() {
		return cust_mobile;
	}

	public void setCust_mobile(Long cust_mobile) {
		this.cust_mobile = cust_mobile;
	}

	public Integer getPolicy_id() {
		return policy_id;
	}

	public void setPolicy_id(Integer policy_id) {
		this.policy_id = policy_id;
	}

	public String getCust_status() {
		return cust_status;
	}

	public void setCust_status(String cust_status) {
		this.cust_status = cust_status;
	}

	public String getClaim_status() {
		return claim_status;
	}

	public void setClaim_status(String claim_status) {
		this.claim_status = claim_status;
	}

	public String getClaim_id() {
		return claim_id;
	}

	public void setClaim_id(String claim_id) {
		this.claim_id = claim_id;
	}

	public String getCust_password() {
		return cust_password;
	}

	public void setCust_password(String cust_password) {
		this.cust_password = cust_password;
	}

}
