package com.xpo.ltl.proinventory.dto;

import java.util.Calendar;

public class ReAssignProRange {

	String proPrefix;
	String proSfx;
	String proType;
	String assignTypeCd;
	Calendar effectiveDt;
	
	public String getProPrefix() {
		return proPrefix;
	}
	public void setProPrefix(String proPrefix) {
		this.proPrefix = proPrefix;
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
	public String getProSfx() {
		return proSfx;
	}
	public void setProSfx(String proSfx) {
		this.proSfx = proSfx;
	}
	public Calendar getEffectiveDt() {
		return effectiveDt;
	}
	public void setEffectiveDt(Calendar effectiveDt) {
		this.effectiveDt = effectiveDt;
	}

}
