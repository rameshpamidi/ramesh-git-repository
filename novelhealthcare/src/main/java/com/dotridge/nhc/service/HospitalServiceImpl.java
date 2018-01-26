package com.dotridge.nhc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dotridge.nhc.entity.Hospital;
import com.dotridge.nhc.entity.HospitalBranch;
import com.dotridge.nhc.model.BranchBean;
import com.dotridge.nhc.model.HospitalBean;
import com.dotridge.nhc.repository.HospitalDao;
import com.dotridge.nhc.util.HospitalServiceUtils;

/**
 * The Class HospitalServiceImpl.
 */
@Service("hospitalService")
public class HospitalServiceImpl implements HospitalService {

	/** The hospital dao. */
	/**
	 * 
	 */
	@Autowired
	private HospitalDao hospitalDao;

	@Override
	@Transactional
	public HospitalBean addHospital(HospitalBean hosptialForm) {
		Hospital addedHospital = hospitalDao.addHospital(HospitalServiceUtils.mapBeanToDomain(hosptialForm));
		return HospitalServiceUtils.mapDomainToBean(addedHospital);
	}

	@Override
	@Transactional
	public BranchBean addHospitalBranch(BranchBean branch,final int hospId) {
		HospitalBranch hospitalBranch = hospitalDao.addHospitalBranch(HospitalServiceUtils.mapBeanToDomain(branch), hospId);
		return HospitalServiceUtils.mapDomainToBean(hospitalBranch);
	}

	@Override
	@Transactional
	public HospitalBean updateHospital(HospitalBean hospitalForm) {
		Hospital updatedHospital = hospitalDao.updateHospital(HospitalServiceUtils.mapBeanToDomain(hospitalForm));
		return HospitalServiceUtils.mapDomainToBean(updatedHospital);
	}

	@Override
	@Transactional
	public BranchBean updateHospitalBranch(BranchBean branchForm) {
		HospitalBranch updatedHospitalBranch = hospitalDao.updateHospitalBranch(HospitalServiceUtils.mapBeanToDomain(branchForm));
		return HospitalServiceUtils.mapDomainToBean(updatedHospitalBranch);
	}

	@Override
	@Transactional
	public void deleteHospital(final int hospitalId) {
         hospitalDao.deleteHospital(hospitalId);
	}

	@Override
	@Transactional
	public void deleteHospitalBranch(final int branchId,final int hospId) {
		hospitalDao.deleteHospitalBranch(branchId,hospId);

	}

	@Override
	@Transactional
	public HospitalBean getHospitalById(final int hospId) {
		return HospitalServiceUtils.mapDomainToBean(hospitalDao.getHospitalById(hospId));
	}

	@Override
	@Transactional
	public BranchBean getHospitalBranchById(int branchId) {
	   HospitalBranch hospitalBranch = hospitalDao.getBranchById(branchId);
	   return HospitalServiceUtils.mapDomainToBean(hospitalBranch);
	}

	//@PreAuthorize("hasRole('ROLE_SUPERADMIN')")
	@Override
	@Transactional
	public List<HospitalBean> getAllHospitals() {

		return HospitalServiceUtils.mapHospitalDomainsToHospitalBeans(hospitalDao.getAllHospitals());
	}

	@Override
	@Transactional
	public List<BranchBean> getAllBranches(int hospitalId) {
		return HospitalServiceUtils.mapBranchDomainsToBranchBeans(hospitalDao.getAllBranches(hospitalId));
	}

	@Override
	@Transactional
	public void updateHosptialStatus(final int hospId) {
		hospitalDao.updateHospitalStatus(hospId);
	}
}
