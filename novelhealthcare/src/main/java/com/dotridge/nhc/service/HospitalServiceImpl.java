package com.dotridge.nhc.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dotridge.nhc.entity.Hospital;
import com.dotridge.nhc.entity.HospitalBranch;
import com.dotridge.nhc.model.HospitalBranchForm;
import com.dotridge.nhc.model.HospitalForm;
import com.dotridge.nhc.repository.HospitalDao;
import com.dotridge.nhc.util.HospitalServiceUtils;

/**
 * The Class HospitalServiceImpl.
 */
@Service("hospitalService")
public class HospitalServiceImpl implements HospitalService {

	/** The hospital dao. */
	@Autowired
	private HospitalDao hospitalDao;

	@Override
	public HospitalForm addHospital(HospitalForm hosptialForm) {
		Hospital addedHospital = hospitalDao.addHospital(HospitalServiceUtils.mapBeanToDomain(hosptialForm));
		return HospitalServiceUtils.mapDomainToBean(addedHospital);
	}

	@Override
	public HospitalBranchForm addHospitalBranch(HospitalBranchForm branch,final int hospId) {
		
		HospitalBranch hospitalBranch = hospitalDao.addHospitalBranch(HospitalServiceUtils.mapBeanToDomain(branch), hospId);
		return HospitalServiceUtils.mapDomainToBean(hospitalBranch);
	}

	@Override
	public HospitalForm updateHospital(HospitalForm hospitalForm) {
		Hospital updatedHospital = hospitalDao.updateHospital(HospitalServiceUtils.mapBeanToDomain(hospitalForm));
		return HospitalServiceUtils.mapDomainToBean(updatedHospital);
	}

	@Override
	public HospitalBranchForm updateHospitalBranch(HospitalBranchForm branch) {
		return null;
	}

	@Override
	public void deleteHospital(final int hospitalId) {
         hospitalDao.deleteHospital(hospitalId);
	}

	@Override
	public void deleteHospitalBranch(final int branchId) {

	}

	@Override
	public HospitalForm getHospitalById(final int hospId) {
		return HospitalServiceUtils.mapDomainToBean(hospitalDao.getHospitalById(hospId));
	}

	@Override
	public HospitalBranchForm getHospitalBranchById(int hospId) {
		return null;
	}

	@Override
	public List<HospitalForm> getAllHospitals() {

		return HospitalServiceUtils.mapHospitalDomainsToHospitalBeans(hospitalDao.getAllHospitals());
	}

	@Override
	public Map<String,Object> getAllBranches(int hospitalId) {
		return HospitalServiceUtils.mapBranchDomainsToBranchBeans(hospitalDao.getAllBranches(hospitalId));
	}

	@Override
	public void updateHosptialStatus(final int hospId) {
		hospitalDao.updateHospitalStatus(hospId);
	}

	

}
