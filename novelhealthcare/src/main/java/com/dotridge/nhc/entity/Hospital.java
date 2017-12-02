/**
 * 
 */
package com.dotridge.nhc.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

/**
 * @author lenovo
 *
 */
@Entity
@Table(name = "hospital")
public class Hospital implements Serializable {

	private static final long serialVersionUID = -2784394389651621538L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="hospital_id")
	private int hospitalId;
	
	@Column(name="hospital_name",unique=true)
	private String hospitalName;
	
	@Column(name="website_url",unique=true)
	private String websiteUrl;
	
	@Type(type="org.hibernate.type.NumericBooleanType")
	@Column(name="hospital_status")
	private boolean status;
	
	@OneToMany(targetEntity=HospitalBranch.class,cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private List<HospitalBranch> branches;

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

	public List<HospitalBranch> getBranches() {
		return branches;
	}

	public void setBranches(List<HospitalBranch> branches) {
		this.branches = branches;
	}

	@Override
	public String toString() {
		return "Hospital [hospitalId=" + hospitalId + ", hospitalName=" + hospitalName + ", websiteUrl=" + websiteUrl
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hospitalId;
		result = prime * result + ((hospitalName == null) ? 0 : hospitalName.hashCode());
		result = prime * result + ((websiteUrl == null) ? 0 : websiteUrl.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hospital other = (Hospital) obj;
		if (hospitalId != other.hospitalId)
			return false;
		if (hospitalName == null) {
			if (other.hospitalName != null)
				return false;
		} else if (!hospitalName.equals(other.hospitalName))
			return false;
		if (websiteUrl == null) {
			if (other.websiteUrl != null)
				return false;
		} else if (!websiteUrl.equals(other.websiteUrl))
			return false;
		return true;
	}

}
