package com.xpo.ltl.proinventory.dto;

import java.util.Calendar;

public class AssignProRange {

	String proPrefix;
	String proSuffix;
	String proType;
	Calendar effectiveDate;
	String assignType;
	String billTypeCd;
	String pickupDate;
	
	public String getAssignType() {
		return assignType;
	}
	public void setAssignType(String assignType) {
		this.assignType = assignType;
	}
	public Calendar getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(Calendar effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public String getProType() {
		return proType;
	}
	public void setProType(String proType) {
		this.proType = proType;
	}
	public String getProPrefix() {
		return proPrefix;
	}
	public void setProPrefix(String proPrefix) {
		this.proPrefix = proPrefix;
	}
	public String getProSuffix() {
		return proSuffix;
	}
	public void setProSuffix(String proSuffix) {
		this.proSuffix = proSuffix;
	}
	public String getPickupDate() {
		return pickupDate;
	}
	public void setPickupDate(String pickupDate) {
		this.pickupDate = pickupDate;
	}
	public String getBillTypeCd() {
		return billTypeCd;
	}
	public void setBillTypeCd(String billTypeCd) {
		this.billTypeCd = billTypeCd;
	}
}
