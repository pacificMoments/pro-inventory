package com.xpo.ltl.proinventory.dto;

import java.util.Calendar;

public class VoidProRange {

	String proPfx;
	String proSuffix;
	String proTyp;
	Calendar effectiveDate;
	String assign_Type;
	
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
	public String getProPfx() {
		return proPfx;
	}
	public void setProPfx(String proPfx) {
		this.proPfx = proPfx;
	}
	public String getAssign_Type() {
		return assign_Type;
	}
	public void setAssign_Type(String assign_Type) {
		this.assign_Type = assign_Type;
	}

}
