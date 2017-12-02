package com.dotridge.nhc.service;

import java.util.List;
import java.util.Map;

import com.dotridge.nhc.model.HospitalBranchForm;
import com.dotridge.nhc.model.HospitalForm;


// TODO: Auto-generated Javadoc
/**
 * The Interface HospitalService.
 */
public interface HospitalService {

	/**
	 * Adds the hospital.
	 *
	 * @param hosptialForm the hosptial form
	 * @return the hospital form
	 */
	public HospitalForm addHospital(HospitalForm hosptialForm);
   
	/**
	 * Adds the hospital branch.
	 *
	 * @param branch the branch
	 * @return the hospital form
	 */
	public HospitalBranchForm addHospitalBranch(HospitalBranchForm branch,final int hospId);
	
	/**
	 * Update hospital.
	 *
	 * @param hospitalForm the hospital form
	 * @return the hospital form
	 */
	public HospitalForm updateHospital(HospitalForm hospitalForm);
	
	/**
	 * Update hospital branch.
	 *
	 * @param branch the branch
	 * @return the hospital form
	 */
	public HospitalBranchForm updateHospitalBranch(HospitalBranchForm branch);
	
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
	public void deleteHospitalBranch(final int branchId);
	
	/**
	 * Gets the hospital by id.
	 *
	 * @param hospId the hosp id
	 * @return the hospital by id
	 */
	public HospitalForm getHospitalById(final int hospId);
	
	/**
	 * Gets the hospital branch by id.
	 *
	 * @param hospId the hosp id
	 * @return the hospital branch by id
	 */
	public HospitalBranchForm  getHospitalBranchById(final int hospId);
	/**
	 * Gets the all hospitals.
	 *
	 * @return the all hospitals
	 */
	public List<HospitalForm> getAllHospitals();

	/**
	 * Gets the all branches.
	 *
	 * @param hospitalId the hospital id
	 * @return the all branches
	 */
	public Map<String,Object> getAllBranches(final int hospitalId);
	
	/**
	 * Update hosptial status.
	 *
	 * @param hospId the hosp id
	 */
	public void updateHosptialStatus(final int hospId);

}
