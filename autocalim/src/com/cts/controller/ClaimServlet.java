package com.cts.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.dao.InsurancePolicyDao;
import com.cts.dao.daoimplementation.ClaimDaoImplementation;
import com.cts.dao.daoimplementation.CustomerDaoImplementation;
import com.cts.dao.daoimplementation.InsurancePolicyDaoImplementation;
import com.cts.dao.daoimplementation.OfficerDaoImplementation;
import com.cts.dao.daoimplementation.VehicleDaoImplementation;
import com.cts.model.Claim;
import com.cts.model.Customer;
import com.cts.model.InsurancePolicy;
import com.cts.model.Officer;
import com.cts.model.Vehicle;

public class ClaimServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ClaimServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		sdf.setLenient(false);
		PrintWriter out = response.getWriter();
		String policy_id = request.getParameter("policy_id");
		Date start_date = null;
		try {
			start_date = sdf.parse(request.getParameter("start_date"));
		} catch (ParseException e1) {

			e1.printStackTrace();
		}
		Date expiry_date = null;
		try {
			expiry_date = sdf.parse(request.getParameter("expiry_date"));
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		String vehicle_reg_no = request.getParameter("vehicle_reg_no");
		String vehicle_type = request.getParameter("vehicle_type");
		Integer vehicle_price = Integer.parseInt(request.getParameter("vehicle_price"));
		Integer claim_amount = Integer.parseInt(request.getParameter("claim_amount"));
		OfficerDaoImplementation odao = new OfficerDaoImplementation();
		//ArrayList<Officer> officer = odao.getAllOfficer();
		String officer_id ="12";

		String vehicle_id = "12";
		String cust_id = "11";
		String claim_id = "12";
		String assessor_id="12";
		Date date = null;
		try {
			date = sdf.parse(sdf.format(new Date()));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		Claim claim = new Claim(claim_id, officer_id, cust_id, claim_amount, date, "Pending", assessor_id);
		Vehicle vehicle = new Vehicle(vehicle_id, cust_id, policy_id, vehicle_reg_no, vehicle_type, vehicle_price);
		InsurancePolicy insurancePolicy = new InsurancePolicy(policy_id, cust_id, start_date, expiry_date);

		ClaimDaoImplementation cldao=new ClaimDaoImplementation();
		String str = cldao.insertClaim(claim);
		VehicleDaoImplementation vldao=new VehicleDaoImplementation();
		String str2 =  vldao.insertVehicle(vehicle);
		InsurancePolicyDaoImplementation idao=new InsurancePolicyDaoImplementation();
		String str3 = idao.insertInsurancePolicy(insurancePolicy);

		out.println(str+" "+str2+" "+str3);
	}

}
