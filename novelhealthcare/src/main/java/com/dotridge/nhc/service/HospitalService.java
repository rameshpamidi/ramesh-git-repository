package com.dotridge.nhc.service;

import java.util.List;

import com.dotridge.nhc.model.BranchBean;
import com.dotridge.nhc.model.HospitalBean;


/**
 * The Interface HospitalService.
 */
public interface HospitalService {

	/**
	 * Adds the hospital.
	 *
	 * @param hospitalBean the hosptial form
	 * @return the hospital form
	 */
	public HospitalBean addHospital(HospitalBean hospitalBean);
   
	/**
	 * Adds the hospital branch.
	 *
	 * @param branch the branch
	 * @return the hospital form
	 */
	public BranchBean addHospitalBranch(BranchBean branch,final int hospId);
	
	/**
	 * Update hospital.
	 *
	 * @param hospitalBean the hospital form
	 * @return the hospital form
	 */
	public HospitalBean updateHospital(HospitalBean hospitalBean);
	
	/**
	 * Update hospital branch.
	 *
	 * @param branch the branch
	 * @return the hospital form
	 */
	public BranchBean updateHospitalBranch(BranchBean branch);
	
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
	public HospitalBean getHospitalById(final int hospId);
	
	/**
	 * Gets the hospital branch by id.
	 *
	 * @param hospId the hosp id
	 * @return the hospital branch by id
	 */
	public BranchBean  getHospitalBranchById(final int hospId);
	/**
	 * Gets the all hospitals.
	 *
	 * @return the all hospitals
	 */
	public List<HospitalBean> getAllHospitals();

	/**
	 * Gets the all branches.
	 *
	 * @param hospitalId the hospital id
	 * @return the all branches
	 */
	public List<BranchBean> getAllBranches(final int hospitalId);
	
	/**
	 * Update hosptial status.
	 *
	 * @param hospId the hosp id
	 */
	public void updateHosptialStatus(final int hospId);

}
