package com.cts.dao.daoimplementation;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Date;

import com.cts.dao.CustomerDao;
import com.cts.dao.DBManager;
import com.cts.model.Customer;

public class CustomerDaoImplementation implements CustomerDao {

	public String insertCustomer(Customer customer) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		sdf.setLenient(false);
		int i = 0;
		PreparedStatement ps = null;
		String str = "insert into AUTOCLAIM.CUSTOMER values (?,?,?,?,?,?,?,?,?,?,?,?)";
		try (Connection con = DBManager.getConnection();) {
			ps = con.prepareStatement(str);
			ps.setString(1, customer.getCust_id());
			ps.setString(2, customer.getCust_name());
			ps.setString(3, sdf.format(customer.getCust_dob()));
			ps.setString(4, customer.getCust_gender());
			ps.setString(5, customer.getCust_email());
			ps.setString(6, customer.getCust_address());
			ps.setLong(7, customer.getCust_mobile());
			ps.setInt(8, customer.getPolicy_id());
			ps.setString(9, customer.getCust_status());
			ps.setString(10, customer.getClaim_status());
			ps.setString(11, customer.getClaim_id());
			ps.setString(12, customer.getCust_password());
			i = ps.executeUpdate();

		}

		catch (SQLException e) {
			e.printStackTrace();
		}

		if (i == 1)
			return ("Customer  inserted successfully");
		else
			return (" Customer insertion fail");

	}

	public Customer getCustomer(int cust_email) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		sdf.setLenient(false);
		Customer customer = null;
		Statement st = null;
		String str = "Select * from AUTOCLAIM.CUSTOMER where cust_id =" + cust_email;
		try (Connection con = DBManager.getConnection();) {
			st = con.createStatement();
			ResultSet rs = st.executeQuery(str);

			if (rs.next()) {
				Date date = null;
				try {
					date = (Date) sdf.parse(rs.getString(3));
				} catch (ParseException e) {
					e.printStackTrace();
				}
				customer = new Customer(rs.getString(1), rs.getString(2), date, rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getLong(7), rs.getInt(8), rs.getString(9), rs.getString(10),
						rs.getString(11), rs.getString(12));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return customer;

	}

	public ArrayList<Customer> getAllCustomer() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		sdf.setLenient(false);
		ArrayList<Customer> clist = new ArrayList<Customer>();
		Customer customer = null;
		Statement st = null;
		String str = "Select * from AUTOCLAIM.CUSTOMER";
		try (Connection con = DBManager.getConnection();) {
			st = con.createStatement();
			ResultSet rs = st.executeQuery(str);

			while (rs.next()) {
				Date date = null;
				try {
					date = (Date) sdf.parse(rs.getString(3));
				} catch (ParseException e) {
					e.printStackTrace();
				}
				customer = new Customer(rs.getString(1), rs.getString(2), date, rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getLong(7), rs.getInt(8), rs.getString(9), rs.getString(10),
						rs.getString(11), rs.getString(12));

				clist.add(customer);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return clist;

	}

	@Override
	public String updateCustomer(int cust_id, long cust_mobile, String cust_email) {

		int result = 0;

		Statement st = null;
		String str = "update AUTOCLAIM.CUSTOMER set cust_mobile=" + cust_mobile + ",cust_email=" + cust_email
				+ "where cust_id=" + cust_id;
		try (Connection con = DBManager.getConnection();) {
			st = con.createStatement();

			result = st.executeUpdate(str);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (result == 1)
			return ("Customer updated successfully");
		else
			return ("Customer update failed");
	}

}
