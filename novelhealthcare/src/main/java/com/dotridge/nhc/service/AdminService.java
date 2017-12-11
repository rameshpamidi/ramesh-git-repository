package com.dotridge.nhc.service;

import java.util.List;

import com.dotridge.nhc.model.AdminBean;

/**
 * The Interface AdminService.
 */
public interface AdminService {

	/**
	 * Adds the admin.
	 *
	 * @param adminForm the admin form
	 * @return the admin form
	 */
	public AdminBean addAdmin(AdminBean adminForm);

	/**
	 * Update admin.
	 *
	 * @param adminForm the admin form
	 * @return the admin form
	 */
	public AdminBean updateAdmin(AdminBean adminForm);

	/**
	 * Delete admin form.
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
	public AdminBean getAdminById(final int adminId);

	/**
	 * View all admins.
	 *
	 * @return the list
	 */
	public List<AdminBean> getAllAdmins();

}
