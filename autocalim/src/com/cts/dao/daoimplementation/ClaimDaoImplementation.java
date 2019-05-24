package com.cts.dao.daoimplementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.cts.dao.ClaimDao;
import com.cts.dao.DBManager;
import com.cts.model.Claim;

public class ClaimDaoImplementation implements ClaimDao {

	@Override
	public String insertClaim(Claim claim) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		sdf.setLenient(false);
		int i = 0;
		PreparedStatement ps = null;
		String str = "insert into AUTOCLAIM.CLAIM_TABLE values (?,?,?,?,?,?,?)";
		try (Connection con = DBManager.getConnection();) {
			ps = con.prepareStatement(str);
			
			ps.setString(1, claim.getClaim_id());
			ps.setString(2, claim.getOfficer_id());
			ps.setString(3, claim.getCust_id());
			ps.setInt(4, claim.getClaim_amount());
			ps.setString(5, sdf.format(claim.getDate_of_claim()));
			ps.setString(6, claim.getClaim_status());
			ps.setString(7, claim.getAssessor_id());
			i = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (i == 1)
			return ("Claim inserted successfully");
		else
			return ("Claim insertion fail");
	}

	@Override
	public Claim getCustomer(int claim_id) {

		return null;
	}

	@Override
	public ArrayList<Claim> getAllClaim() {

		return null;
	}

}
