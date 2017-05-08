package com.xpo.ltl.proinventory.dto;

import java.util.Calendar;

public class VoidProRange {

	String proPfx;
	String proSuffix;
	String proTyp;
	Calendar effectiveDate;
	String assignType;
	
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
	public String getProTyp() {
		return proTyp;
	}
	public void setProTyp(String proTyp) {
		this.proTyp = proTyp;
	}
	public Calendar getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(Calendar effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public String getAssignType() {
		return assignType;
	}
	public void setAssignType(String assignType) {
		this.assignType = assignType;
	}

}
