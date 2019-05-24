package com.cts.dao.daoimplementation;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.cts.dao.DBManager;
import com.cts.dao.OfficerDao;
import com.cts.model.Customer;
import com.cts.model.Officer;

public class OfficerDaoImplementation implements OfficerDao {

	@Override
	public Officer getOfficer(int officer_id) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		sdf.setLenient(false);
		Officer officer = null;
		Statement st = null;
		String str = "Select * from AUTOCLAIM.OFFICER where officer_id =" + officer_id;
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
				officer = new Officer(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return officer;
	}

	@Override
	public ArrayList<Officer> getAllOfficer() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		sdf.setLenient(false);
		ArrayList<Officer> olist = new ArrayList<Officer>();
		Officer officer = null;
		Statement st = null;
		String str = "Select * from AUTOCLAIM.OFFICER";
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
				officer = new Officer(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));

				olist.add(officer);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return olist;
	}

}
