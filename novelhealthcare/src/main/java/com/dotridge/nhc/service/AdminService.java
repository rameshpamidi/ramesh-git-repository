package com.dotridge.nhc.service;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;

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
	@PreAuthorize("hasRole('superadmin')")
	public AdminBean addAdmin(AdminBean adminForm);

	/**
	 * Update admin.
	 *
	 * @param adminForm the admin form
	 * @return the admin form
	 */
	@PreAuthorize("hasRole('superadmin')")
	public AdminBean updateAdmin(AdminBean adminForm);

	/**
	 * Delete admin form.
	 *
	 * @param adminId the admin id
	 */
	@PreAuthorize("hasRole('superadmin')")
	public void deleteAdmin(final int adminId);

	/**
	 * Gets the admin by id.
	 *
	 * @param adminId the admin id
	 * @return the admin by id
	 */
	@PreAuthorize("hasRole('superadmin')")
	public AdminBean getAdminById(final int adminId);

	/**
	 * View all admins.
	 *
	 * @return the list
	 */
	@PreAuthorize("hasRole('superadmin') or hasRole('admin')")
	public List<AdminBean> getAllAdmins();

}
