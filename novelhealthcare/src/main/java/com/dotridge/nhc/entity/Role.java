package com.dotridge.nhc.entity;

import java.util.Set;
import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
@Table(name="role")
public class Role {
	@Id
	@GeneratedValue
	@Column(name="role_id")
	private int roleId;
	
	@Column(name="role_name")
	private String roleName;
	
	@OneToMany(cascade=CascadeType.ALL,targetEntity=Module.class)
	@JoinTable(name="role_module",joinColumns={@JoinColumn(name="role_id_fk")},inverseJoinColumns={@JoinColumn(name="module_id_fk")})
	private Set<Module> modules;

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}


	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleName=" + roleName + ", modules=" + modules + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((modules == null) ? 0 : modules.hashCode());
		result = prime * result + roleId;
		result = prime * result + ((roleName == null) ? 0 : roleName.hashCode());
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
		Role other = (Role) obj;
		if (modules == null) {
			if (other.modules != null)
				return false;
		} else if (!modules.equals(other.modules))
			return false;
		if (roleId != other.roleId)
			return false;
		if (roleName == null) {
			if (other.roleName != null)
				return false;
		} else if (!roleName.equals(other.roleName))
			return false;
		return true;
	}
	
}
