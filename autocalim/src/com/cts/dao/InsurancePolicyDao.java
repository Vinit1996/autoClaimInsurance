package com.cts.dao;

import java.util.ArrayList;

import com.cts.model.InsurancePolicy;


public interface InsurancePolicyDao {
	public String insertInsurancePolicy(InsurancePolicy insurancePolicy);

	public InsurancePolicy getInsurancePolicy(int policy_id);

	public ArrayList<InsurancePolicy> getAllInsurancePolicy();

	// public String updateVehicle(int vehicle_id,long cust_mobile,String
	// cust_email);
}
