package com.dotridge.nhc.repository;

import java.util.List;

import com.dotridge.nhc.entity.Hospital;
import com.dotridge.nhc.entity.HospitalBranch;

/**
 * The Interface HospitalDao.
 */
public interface HospitalDao {

	/**
	 * Adds the hospital.
	 *
	 * @param hospital the hospital
	 * @return the hospital
	 */
	public Hospital addHospital(Hospital hospital);
	
	/**
	 * Adds the hospital branch.
	 *
	 * @param branch the branch
	 * @return the hospital form
	 */
	public HospitalBranch addHospitalBranch(HospitalBranch branch,final int hospId);
	
	/**
	 * Update hospital.
	 *
	 * @param hospital the hospital
	 * @return the hospital form
	 */
	public Hospital updateHospital(Hospital hospital);
	
	/**
	 * Update hospital branch.
	 *
	 * @param branch the branch
	 * @return the hospital form
	 */
	public HospitalBranch updateHospitalBranch(HospitalBranch branch);
	
	/**
	 * Delete hospital.
	 *
	 * @param hospitalId the hospital id
	 */
	public void deleteHospital(final int hospitalId);
	
	/**
	 * Delete hospital branch.
	 *
	 * @param branchId the branch id
	 */
	public void deleteHospitalBranch(final int branchId,final int hospId);
	/**
	 * Gets the hospital by id.
	 *
	 * @param hospId the hosp id
	 * @return the hospital by id
	 */
	public Hospital getHospitalById(final int hospId);
	
	/**
	 * Gets the branch by id.
	 *
	 * @param branchId the branch id
	 * @return the branch by id
	 */
	public HospitalBranch getBranchById(final int branchId);
	/**
	 * Gets the all hospitals.
	 *
	 * @return the all hospitals
	 */

	public List<Hospital> getAllHospitals();

	/**
	 * Gets the all branches.
	 *
	 * @param hospitalId the hospital id
	 * @return the all branches
	 */
	public List<HospitalBranch> getAllBranches(final int hospitalId);
	
	/**
	 * Update hospital status.
	 *
	 * @param hospId the hosp id
	 */
	public void updateHospitalStatus(int hospId);
	
	
	
	

}
