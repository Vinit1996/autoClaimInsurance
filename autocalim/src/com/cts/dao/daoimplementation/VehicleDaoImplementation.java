package com.cts.dao.daoimplementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.cts.dao.DBManager;
import com.cts.dao.VehicleDao;
import com.cts.model.Vehicle;

public class VehicleDaoImplementation implements VehicleDao{

	@Override
	public String insertVehicle(Vehicle vehicle) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		sdf.setLenient(false);
		int i = 0;
		PreparedStatement ps = null;
		String str = "insert into AUTOCLAIM.VEHICLES values (?,?,?,?,?,?)";
		try (Connection con = DBManager.getConnection();) {
			ps = con.prepareStatement(str);
			ps.setString(1, vehicle.getVehicle_id());
			ps.setString(2, vehicle.getCust_id());
			ps.setString(3, vehicle.getPolicy_id());
			ps.setString(4, vehicle.getVehicle_reg_no());
			ps.setString(5, vehicle.getVehicle_type());
			ps.setInt(6, vehicle.getVehicle_price());
			
			i = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (i == 1)
			return ("Vehicle inserted successfully");
		else
			return ("Vehicle insertion fail");
	}

	@Override
	public Vehicle getVehicle(int vehicle_reg_no) {
		
		return null;
	}

	@Override
	public ArrayList<Vehicle> getAllVehicle() {
		
		return null;
	}

}
