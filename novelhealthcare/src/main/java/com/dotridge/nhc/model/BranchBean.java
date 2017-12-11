package com.dotridge.nhc.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class BranchBean {
	private int branchId;

	@NotEmpty
	@Email
	private String email;

	@NotEmpty
	private String phoneNo;


	private String image;

	@NotEmpty
	private String address1;

	private String address2;

	@NotEmpty
	private String city;
	@NotEmpty
	private String state;
	@NotEmpty
	private String zipcode;

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}


	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

}
