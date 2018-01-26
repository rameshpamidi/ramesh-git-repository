package com.dotridge.nhc.service;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import com.dotridge.nhc.model.BranchBean;
import com.dotridge.nhc.model.HospitalBean;

/**
 * The Interface HospitalService.
 */
/**
 * @author lenovo
 *
 */
public interface HospitalService {

	/**
	 * Adds the hospital.
	 *
	 * @param hospitalBean
	 *            the hosptial form
	 * @return the hospital form
	 */
	@PreAuthorize("hasRole('superadmin')")
	public HospitalBean addHospital(HospitalBean hospitalBean);

	/**
	 * Adds the hospital branch.
	 *
	 * @param branch
	 *            the branch
	 * @return the hospital form
	 */
	@PreAuthorize("hasRole('superadmin')")
	public BranchBean addHospitalBranch(BranchBean branch, final int hospId);

	/**
	 * Update hospital.
	 *
	 * @param hospitalBean
	 *            the hospital form
	 * @return the hospital form
	 */
	@PreAuthorize("hasRole('superadmin')")
	public HospitalBean updateHospital(HospitalBean hospitalBean);

	/**
	 * Update hospital branch.
	 *
	 * @param branch
	 *            the branch
	 * @return the hospital form
	 */
	@PreAuthorize("hasRole('superadmin')")
	public BranchBean updateHospitalBranch(BranchBean branch);

	/**
	 * Delete hospital.
	 *
	 * @param hospitalId
	 *            the hospital id
	 */
	@PreAuthorize("hasRole('superadmin')")
	public void deleteHospital(final int hospitalId);

	/**
	 * Delete hospital branch.
	 *
	 * @param branchId
	 *            the branch id
	 */
	@PreAuthorize("hasRole('superadmin')")
	public void deleteHospitalBranch(final int branchId, final int hospId);

	/**
	 * Gets the hospital by id.
	 *
	 * @param hospId
	 *            the hosp id
	 * @return the hospital by id
	 */
	@PreAuthorize("hasRole('superadmin') or hasRole('admin')")
	public HospitalBean getHospitalById(final int hospId);

	/**
	 * Gets the hospital branch by id.
	 *
	 * @param hospId
	 *            the hosp id
	 * @return the hospital branch by id
	 */
	@PreAuthorize("hasRole('superadmin') or hasRole('admin')")
	public BranchBean getHospitalBranchById(final int hospId);

	/**
	 * Gets the all hospitals.
	 *
	 * @return the all hospitals
	 */
	@PreAuthorize("hasRole('superadmin') or hasRole('admin')")
	public List<HospitalBean> getAllHospitals();

	/**
	 * Gets the all branches.
	 *
	 * @param hospitalId
	 *            the hospital id
	 * @return the all branches
	 */
	@PreAuthorize("hasRole('superadmin') or hasRole('admin')")
	public List<BranchBean> getAllBranches(final int hospitalId);

	/**
	 * Update hosptial status.
	 *
	 * @param hospId
	 *            the hosp id
	 */
	@PreAuthorize("hasRole('superadmin')")
	public void updateHosptialStatus(final int hospId);

}
