package com.cts.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.dao.daoimplementation.CustomerDaoImplementation;
import com.cts.model.Customer;

public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CustomerServlet() {
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// System.out.println("My Servlet1");

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		sdf.setLenient(false);
		PrintWriter out = response.getWriter();
		String cust_id = "11";
		String cust_name = request.getParameter("cust_name");
		Date cust_dob = null;
		try {
			cust_dob = sdf.parse(request.getParameter("cust_dob"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		String cust_password=request.getParameter("cust_password");
		String cust_gender = request.getParameter("cust_gender");
		String cust_email = request.getParameter("cust_email");
		String cust_address = request.getParameter("cust_address");
		Long cust_mobile = Long.parseLong(request.getParameter("cust_mobile"));
		Integer policy_id = Integer.parseInt(request.getParameter("policy_id"));

		Customer customer = new Customer(cust_id, cust_name,cust_dob, cust_gender, cust_email, cust_address,
				cust_mobile, policy_id, null, null, null,cust_password);

		CustomerDaoImplementation cdao = new CustomerDaoImplementation();
		String str = cdao.insertCustomer(customer);

		out.println(str);

	}

}
