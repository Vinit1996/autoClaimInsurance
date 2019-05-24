package com.cts.dao;

import java.util.ArrayList;

import com.cts.model.Customer;
import com.cts.model.Vehicle;

public interface VehicleDao {
public String insertVehicle(Vehicle vehicle);
	
	public Vehicle getVehicle(int vehicle_reg_no);
	
	public   ArrayList<Vehicle>    getAllVehicle();
	
	//public String updateCustomer(int cust_id,long cust_mobile,String cust_email);

}
