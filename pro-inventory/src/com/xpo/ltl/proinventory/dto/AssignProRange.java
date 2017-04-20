package com.xpo.ltl.proinventory.dto;

import java.util.Calendar;

public class AssignProRange {

	String proPrefix;
	String proSuffix;
	String proType;
	Calendar effectiveDt;
	String assignType;
	
	public String getAssignType() {
		return assignType;
	}
	public void setAssignType(String assignType) {
		this.assignType = assignType;
	}
	public Calendar getEffectiveDt() {
		return effectiveDt;
	}
	public void setEffectiveDt(Calendar effectiveDt) {
		this.effectiveDt = effectiveDt;
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
}
