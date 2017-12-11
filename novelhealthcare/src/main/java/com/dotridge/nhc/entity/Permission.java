package com.dotridge.nhc.entity;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
@Table(name="permission")
public class Permission {
	@Id
	@GeneratedValue
	@Column(name="per_id")
	private int permissionId;
	
	@Column(name="per_name")
	private String permissionName;
	
	public int getPermissionId() {
		return permissionId;
	}
	public void setPermissionId(int permissionId) {
		this.permissionId = permissionId;
	}
	public String getPermissionName() {
		return permissionName;
	}
	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}
	@Override
	public String toString() {
		return "Permission [permissionId=" + permissionId + ", permissionName=" + permissionName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + permissionId;
		result = prime * result + ((permissionName == null) ? 0 : permissionName.hashCode());
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
		Permission other = (Permission) obj;
		if (permissionId != other.permissionId)
			return false;
		if (permissionName == null) {
			if (other.permissionName != null)
				return false;
		} else if (!permissionName.equals(other.permissionName))
			return false;
		return true;
	}
	

}
