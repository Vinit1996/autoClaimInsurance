package com.cts.dao.daoimplementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.cts.dao.DBManager;
import com.cts.dao.InsurancePolicyDao;
import com.cts.model.InsurancePolicy;
import com.cts.model.Vehicle;

public class InsurancePolicyDaoImplementation implements InsurancePolicyDao{

	@Override
	public String insertInsurancePolicy(InsurancePolicy insurancePolicy) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		sdf.setLenient(false);
		int i = 0;
		PreparedStatement ps = null;
		String str = "insert into AUTOCLAIM.INSSURANCE_POLICY values (?,?,?,?)";
		try (Connection con = DBManager.getConnection();) {
			ps = con.prepareStatement(str);
			ps.setString(1, insurancePolicy.getPolicy_id());
			ps.setString(2, insurancePolicy.getCust_id());
			ps.setString(3, sdf.format(insurancePolicy.getStart_date()));
			ps.setString(4, sdf.format(insurancePolicy.getExpiry_date()));
			i = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (i == 1)
			return ("InsurancePolicy inserted successfully");
		else
			return (" InsurancePolicy insertion fail");
	}

	@Override
	public InsurancePolicy getInsurancePolicy(int policy_id) {
	return null;
	}

	@Override
	public ArrayList<InsurancePolicy> getAllInsurancePolicy() {
		return null;
	}

	

}
