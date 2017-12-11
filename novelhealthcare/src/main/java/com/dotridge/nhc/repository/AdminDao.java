package com.dotridge.nhc.repository;

import java.util.List;

import com.dotridge.nhc.entity.Admin;

/**
 * The Interface AdminDao.
 */
public interface AdminDao {
	
	/**
	 * Adds the admin.
	 *
	 * @param admin the admin
	 * @return the admin
	 */
	public Admin addAdmin(Admin admin,final int hospitalId);
	
	/**
	 * Update admin.
	 *
	 * @param admin the admin
	 * @return the admin
	 */
	public Admin updateAdmin(Admin admin);
	
	/**
	 * Delete admin.
	 *
	 * @param adminId the admin id
	 */
	public void deleteAdmin(final int adminId);
	
	/**
	 * Gets the admin by id.
	 *
	 * @param adminId the admin id
	 * @return the admin by id
	 */
	public Admin getAdminById(final int adminId);
	
	/**
	 * Gets the all admins.
	 *
	 * @return the all admins
	 */
	public List<Admin> getAllAdmins();
}
