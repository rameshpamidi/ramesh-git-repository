package com.dotridge.nhc.util;

import java.util.ArrayList;
import java.util.List;

import com.dotridge.nhc.entity.Hospital;
import com.dotridge.nhc.entity.HospitalBranch;
import com.dotridge.nhc.model.BranchBean;
import com.dotridge.nhc.model.HospitalBean;

/**
 * The Class HospitalServiceUtils.
 */
public class HospitalServiceUtils {

	/**
	 * Map bean to domain.
	 *
	 * @param hospitalBean
	 *            the hospital form
	 * @return the hospital
	 */
	public static Hospital mapBeanToDomain(HospitalBean hospitalBean) {
		Hospital hospital = new Hospital();
		hospital.setHospitalId(hospitalBean.getHospitalId());
		hospital.setHospitalName(hospitalBean.getHospitalName());
		hospital.setWebsiteUrl(hospitalBean.getWebsiteUrl());
		hospital.setStatus(hospitalBean.isStatus());
		return hospital;
	}

	/**
	 * Map domain to bean.
	 *
	 * @param hospital
	 *            the hospital
	 * @return the hospital form
	 */
	public static HospitalBean mapDomainToBean(Hospital hospital) {
		HospitalBean hospitalBean = new HospitalBean();
		hospitalBean.setHospitalId(hospital.getHospitalId());
		hospitalBean.setHospitalName(hospital.getHospitalName());
		hospitalBean.setWebsiteUrl(hospital.getWebsiteUrl());
		hospitalBean.setStatus(hospital.isStatus());
		return hospitalBean;

	}

	/**
	 * Map branch form to branch domain.
	 *
	 * @param branchBean
	 *            the branch form
	 * @return the hospital branch
	 */
	public static HospitalBranch mapBeanToDomain(BranchBean branchBean) {
		HospitalBranch hospitalBranch = new HospitalBranch();
		hospitalBranch.setBranchId(branchBean.getBranchId());
		hospitalBranch.setAddress1(branchBean.getAddress1());
		hospitalBranch.setAddress2(branchBean.getAddress2());
		hospitalBranch.setCity(branchBean.getCity());
		hospitalBranch.setState(branchBean.getState());
		hospitalBranch.setEmail(branchBean.getEmail());
		hospitalBranch.setPhoneNo(branchBean.getPhoneNo());
		hospitalBranch.setZipCode(branchBean.getZipcode());
		return hospitalBranch;
	}

	/**
	 * Map domain to bean.
	 *
	 * @param hospitalBranch
	 *            the hospital branch
	 * @return the hospital branch form
	 */
	public static BranchBean mapDomainToBean(HospitalBranch hospitalBranch) {
		BranchBean hospitalBranchForm = new BranchBean();
		hospitalBranchForm.setBranchId(hospitalBranch.getBranchId());
		hospitalBranchForm.setAddress1(hospitalBranch.getAddress1());
		hospitalBranchForm.setAddress2(hospitalBranch.getAddress2());
		hospitalBranchForm.setCity(hospitalBranch.getCity());
		hospitalBranchForm.setState(hospitalBranch.getState());
		hospitalBranchForm.setZipcode(hospitalBranch.getZipCode());
		hospitalBranchForm.setPhoneNo(hospitalBranch.getPhoneNo());
		hospitalBranchForm.setEmail(hospitalBranch.getEmail());
		return hospitalBranchForm;

	}

	/**
	 * Map domain list to bean list.
	 *
	 * @param hospitals
	 *            the hospitals
	 * @return the list
	 */
	public static List<HospitalBean> mapHospitalDomainsToHospitalBeans(List<Hospital> hospitals) {
		List<HospitalBean> hospitalBeans = new ArrayList<HospitalBean>();
		for (Hospital hospital : hospitals) {
			HospitalBean hospitalBean = new HospitalBean();
			hospitalBean.setHospitalId(hospital.getHospitalId());
			hospitalBean.setHospitalName(hospital.getHospitalName());
			hospitalBean.setWebsiteUrl(hospital.getWebsiteUrl());
			hospitalBean.setStatus(hospital.isStatus());
			hospitalBeans.add(hospitalBean);
		}
		return hospitalBeans;
	}

	/**
	 * Map branch domains to branch beans.
	 *
	 * @param map
	 *            the hospital branches
	 * @return the list
	 */
	public static List<BranchBean> mapBranchDomainsToBranchBeans(List<HospitalBranch> hospitalBranches) {
		List<BranchBean> branchBeans = new ArrayList<BranchBean>();
		for (HospitalBranch hospitalBranch : hospitalBranches) {
			BranchBean branchBean = new BranchBean();
			branchBean.setBranchId(hospitalBranch.getBranchId());
			branchBean.setAddress1(hospitalBranch.getAddress1());
			branchBean.setAddress2(hospitalBranch.getAddress2());
			branchBean.setCity(hospitalBranch.getCity());
			branchBean.setState(hospitalBranch.getState());
			branchBean.setZipcode(hospitalBranch.getZipCode());
			branchBean.setEmail(hospitalBranch.getEmail());
			branchBean.setPhoneNo(hospitalBranch.getPhoneNo());
			branchBeans.add(branchBean);
		}
		return branchBeans;
	}

}
