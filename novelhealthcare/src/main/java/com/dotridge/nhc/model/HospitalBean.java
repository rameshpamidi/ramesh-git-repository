package com.dotridge.nhc.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class HospitalBean {
	@NotNull
	private int hospitalId;
	@NotEmpty
	private String hospitalName;
	@NotEmpty
	private String websiteUrl;
	
	@NotNull
	private boolean status;
	

	public int getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getWebsiteUrl() {
		return websiteUrl;
	}

	public void setWebsiteUrl(String websiteUrl) {
		this.websiteUrl = websiteUrl;
	}
	

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "HospitalForm [hospitalId=" + hospitalId + ", hospitalName=" + hospitalName + ", websiteUrl="
				+ websiteUrl + ", status=" + status + "]";
	}


}
