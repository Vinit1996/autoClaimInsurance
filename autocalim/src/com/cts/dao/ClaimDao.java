package com.cts.dao;

import java.util.ArrayList;

import com.cts.model.Claim;

public interface ClaimDao {
	public String insertClaim(Claim claim);

	public Claim getCustomer(int claim_id);

	public ArrayList<Claim> getAllClaim();

	// public String updateCustomer(int cust_id,long cust_mobile,String
	// cust_email);
}
