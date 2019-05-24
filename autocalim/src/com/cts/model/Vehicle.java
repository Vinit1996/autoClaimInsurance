package com.cts.model;

public class Vehicle {
	
	private String vehicle_id;
	private String cust_id;
	private String policy_id;
	private String vehicle_reg_no;
	private String vehicle_type;
	private Integer vehicle_price;
	
	
	public Vehicle(String vehicle_id, String cust_id, String policy_id, String vehicle_reg_no, String vehicle_type,
			Integer vehicle_price) {
		super();
		this.vehicle_id = vehicle_id;
		this.cust_id = cust_id;
		this.policy_id = policy_id;
		this.vehicle_reg_no = vehicle_reg_no;
		this.vehicle_type = vehicle_type;
		this.vehicle_price = vehicle_price;
	}
	public Vehicle() {
		super();
		
	}
	public String getVehicle_id() {
		return vehicle_id;
	}
	public void setVehicle_id(String vehicle_id) {
		this.vehicle_id = vehicle_id;
	}
	public String getCust_id() {
		return cust_id;
	}
	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}
	public String getPolicy_id() {
		return policy_id;
	}
	public void setPolicy_id(String policy_id) {
		this.policy_id = policy_id;
	}
	public String getVehicle_reg_no() {
		return vehicle_reg_no;
	}
	public void setVehicle_reg_no(String vehicle_reg_no) {
		this.vehicle_reg_no = vehicle_reg_no;
	}
	public String getVehicle_type() {
		return vehicle_type;
	}
	public void setVehicle_type(String vehicle_type) {
		this.vehicle_type = vehicle_type;
	}
	public Integer getVehicle_price() {
		return vehicle_price;
	}
	public void setVehicle_price(Integer vehicle_price) {
		this.vehicle_price = vehicle_price;
	}
	

}
