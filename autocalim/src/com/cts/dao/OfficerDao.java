package com.cts.dao;

import java.util.ArrayList;


import com.cts.model.Officer;

public interface OfficerDao {
	
	
	public Officer getOfficer(int officer_id);
	
	public   ArrayList<Officer>    getAllOfficer();
	
	
}
