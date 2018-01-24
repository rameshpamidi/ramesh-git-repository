package com.dotridge.nhc.entity;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable(value = true)
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "user_profile")
public class UserProfile implements Serializable {

	private static final long serialVersionUID = -8022146334312856794L;

	@Id
	@GeneratedValue
	@Column(name = "user_id")
	private int userId;

	@Column(name = "full_name", nullable = false)
	private String fullName;

	@Column(name = "user_name", unique = true, nullable = false)
	private String userName;

	@Column(name = "password", nullable = false)
	private String password;

	@Column(name = "email", unique = true, nullable = false)
	private String email;

	@Column(name = "phone_no", unique = true, nullable = false)
	private long phoneNumber;

	@Column(name = "gender", nullable = false)
	private String gender;

	@Column(name = "status", nullable = false)
	private boolean status;

	@Column(name = "no_of_attempts", nullable = true)
	private int noOfLoginAttempts;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_attempt",nullable=true)
	private Date lastAttempt;
	
	

	@OneToOne(targetEntity = Address.class, optional = true, cascade = CascadeType.ALL, orphanRemoval = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "address_id_fk", unique = true)
	private Address address;
	
	/*@OneToOne(targetEntity=Role.class,cascade=CascadeType.ALL)
	@JoinColumn(name="role_id_fk")
	private Role role;*/
	
	@OneToMany(targetEntity=Role.class,cascade=CascadeType.ALL)
	@JoinTable(name="user_role",joinColumns={@JoinColumn(name="user_id_fk")},inverseJoinColumns={@JoinColumn(name="role_id_fk")})
	private Set<Role> roles;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}


	public Date getLastAttempt() {
		return lastAttempt;
	}

	public void setLastAttempt(Date lastAttempt) {
		this.lastAttempt = lastAttempt;
	}



	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getNoOfLoginAttempts() {
		return noOfLoginAttempts;
	}

	public void setNoOfLoginAttempts(int noOfLoginAttempts) {
		this.noOfLoginAttempts = noOfLoginAttempts;
	}

	@Override
	public String toString() {
		return "UserProfile [userId=" + userId + ", fullName=" + fullName + ", userName=" + userName + ", password="
				+ password + ", email=" + email + ", phoneNumber=" + phoneNumber + ", gender=" + gender + ", status="
				+ status + ", noOfLoginAttempts=" + noOfLoginAttempts + ", lastAttempt=" + lastAttempt + ", address="
				+ address + ", roles=" + roles + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((lastAttempt == null) ? 0 : lastAttempt.hashCode());
		result = prime * result + noOfLoginAttempts;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + (int) (phoneNumber ^ (phoneNumber >>> 32));
		result = prime * result + ((roles == null) ? 0 : roles.hashCode());
		result = prime * result + (status ? 1231 : 1237);
		result = prime * result + userId;
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
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
		UserProfile other = (UserProfile) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (fullName == null) {
			if (other.fullName != null)
				return false;
		} else if (!fullName.equals(other.fullName))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (lastAttempt == null) {
			if (other.lastAttempt != null)
				return false;
		} else if (!lastAttempt.equals(other.lastAttempt))
			return false;
		if (noOfLoginAttempts != other.noOfLoginAttempts)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phoneNumber != other.phoneNumber)
			return false;
		if (roles == null) {
			if (other.roles != null)
				return false;
		} else if (!roles.equals(other.roles))
			return false;
		if (status != other.status)
			return false;
		if (userId != other.userId)
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

}
