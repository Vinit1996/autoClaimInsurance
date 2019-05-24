package com.cts.model;

import java.util.Date;

public class ClaimStatus {

	
	private String claim_id;
	private String claim_status;
	private Integer amount_paid;
	private Date date_setteld;
	private String claim_settle_id;
	public ClaimStatus(String claim_id, String claim_status, Integer amount_paid, Date date_setteld,
			String claim_settle_id) {
		super();
		this.claim_id = claim_id;
		this.claim_status = claim_status;
		this.amount_paid = amount_paid;
		this.date_setteld = date_setteld;
		this.claim_settle_id = claim_settle_id;
	}
	public ClaimStatus() {
		super();
		
	}
	public String getClaim_id() {
		return claim_id;
	}
	public void setClaim_id(String claim_id) {
		this.claim_id = claim_id;
	}
	public String getClaim_status() {
		return claim_status;
	}
	public void setClaim_status(String claim_status) {
		this.claim_status = claim_status;
	}
	public Integer getAmount_paid() {
		return amount_paid;
	}
	public void setAmount_paid(Integer amount_paid) {
		this.amount_paid = amount_paid;
	}
	public Date getDate_setteld() {
		return date_setteld;
	}
	public void setDate_setteld(Date date_setteld) {
		this.date_setteld = date_setteld;
	}
	public String getClaim_settle_id() {
		return claim_settle_id;
	}
	public void setClaim_settle_id(String claim_settle_id) {
		this.claim_settle_id = claim_settle_id;
	}
	
	
	
}
