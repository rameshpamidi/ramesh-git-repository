package com.dotridge.nhc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable(value=true)
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "admin")
@PrimaryKeyJoinColumn(name="admin_id")
public class Admin extends UserProfile implements Serializable {

	private static final long serialVersionUID = -773121363016430026L;
	
	
	@Column(name="created_by",nullable=true)
	private String  createdBy;
	
	@Temporal(TemporalType.DATE)
	@Column(name="created_date",nullable=true)
	private Date createdDate;
	
	@Column(name="updated_by",nullable=true)
	private String updatedBy;
	
	@Temporal(TemporalType.DATE)
	@Column(name="updated_date",nullable=true)
	private Date updatedDate;
	
	@OneToOne(targetEntity=Hospital.class,optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name="hosp_id_fk")
	private Hospital hospital;


	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}


	@Override
	public String toString() {
		return "Admin [hospital=" + hospital + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((hospital == null) ? 0 : hospital.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Admin other = (Admin) obj;
		if (hospital == null) {
			if (other.hospital != null)
				return false;
		} else if (!hospital.equals(other.hospital))
			return false;
		return true;
	}

}
