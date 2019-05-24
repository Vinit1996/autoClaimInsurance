package com.cts.dao;

import java.util.ArrayList;

import com.cts.model.Customer;

public interface CustomerDao {

	public String insertCustomer(Customer customer);

	public Customer getCustomer(int cust_id);

	public ArrayList<Customer> getAllCustomer();

	public String updateCustomer(int cust_id, long cust_mobile, String cust_email);

}
