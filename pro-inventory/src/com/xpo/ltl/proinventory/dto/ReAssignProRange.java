package com.xpo.ltl.proinventory.dto;

public class ReAssignProRange {

	String proPrefix;
	String proSuffix;
	String proType;
	String assignTypeCd;
	Calendar effectiveDate;
	
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
	public String getProType() {
		return proType;
	}
	public void setProType(String proType) {
		this.proType = proType;
	}
	public String getAssignTypeCd() {
		return assignTypeCd;
	}
	public void setAssignTypeCd(String assignTypeCd) {
		this.assignTypeCd = assignTypeCd;
	}

}
