package com.dotridge.nhc.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.dotridge.nhc.entity.Hospital;
import com.dotridge.nhc.entity.HospitalBranch;
import com.dotridge.nhc.model.HospitalBranchForm;
import com.dotridge.nhc.model.HospitalForm;

// TODO: Auto-generated Javadoc
/**
 * The Class HospitalServiceUtils.
 */
public class HospitalServiceUtils {

	/**
	 * Map bean to domain.
	 *
	 * @param hospitalForm
	 *            the hospital form
	 * @return the hospital
	 */
	public static Hospital mapBeanToDomain(HospitalForm hospitalForm) {

		Hospital hospital = new Hospital();
		hospital.setHospitalId(hospitalForm.getHospitalId());
		hospital.setHospitalName(hospitalForm.getHospitalName());
		hospital.setWebsiteUrl(hospitalForm.getWebsiteUrl());
		hospital.setStatus(hospitalForm.isStatus());
		return hospital;
	}

	/**
	 * Map domain to bean.
	 *
	 * @param hospital
	 *            the hospital
	 * @return the hospital form
	 */
	public static HospitalForm mapDomainToBean(Hospital hospital) {
		HospitalForm hospitalForm = new HospitalForm();
		hospitalForm.setHospitalId(hospital.getHospitalId());
		hospitalForm.setHospitalName(hospital.getHospitalName());
		hospitalForm.setWebsiteUrl(hospital.getWebsiteUrl());
		hospitalForm.setStatus(hospital.isStatus());
		return hospitalForm;

	}

	/**
	 * Map branch form to branch domain.
	 *
	 * @param branchForm
	 *            the branch form
	 * @return the hospital branch
	 */
	public static HospitalBranch mapBeanToDomain(HospitalBranchForm branchForm) {
		HospitalBranch hospitalBranch = new HospitalBranch();
		hospitalBranch.setBranchId(branchForm.getBranchId());
		hospitalBranch.setAddress1(branchForm.getAddress1());
		hospitalBranch.setAddress2(branchForm.getAddress2());
		hospitalBranch.setCity(branchForm.getCity());
		hospitalBranch.setState(branchForm.getState());
		hospitalBranch.setEmail(branchForm.getEmail());
		hospitalBranch.setPhoneNo(branchForm.getPhoneNo());
		hospitalBranch.setZipCode(branchForm.getZipcode());
		return hospitalBranch;
	}

	/**
	 * Map domain to bean.
	 *
	 * @param hospitalBranch
	 *            the hospital branch
	 * @return the hospital branch form
	 */
	public static HospitalBranchForm mapDomainToBean(HospitalBranch hospitalBranch) {
		HospitalBranchForm hospitalBranchForm = new HospitalBranchForm();
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
	public static List<HospitalForm> mapHospitalDomainsToHospitalBeans(List<Hospital> hospitals) {
		List<HospitalForm> hospitalForms = new ArrayList<HospitalForm>();
		for (Hospital hospital : hospitals) {
			HospitalForm hospitalForm = new HospitalForm();
			hospitalForm.setHospitalId(hospital.getHospitalId());
			hospitalForm.setHospitalName(hospital.getHospitalName());
			hospitalForm.setWebsiteUrl(hospital.getWebsiteUrl());
			hospitalForm.setStatus(hospital.isStatus());
			hospitalForms.add(hospitalForm);
		}
		return hospitalForms;
	}

	/**
	 * Map branch domains to branch beans.
	 *
	 * @param map
	 *            the hospital branches
	 * @return the list
	 */
	@SuppressWarnings("unchecked")
	public static Map<String, Object> mapBranchDomainsToBranchBeans(Map<String, Object> map) {
		Map<String, Object> branchMap = new HashMap<String, Object>();
		String hospName=null;
		List<HospitalBranchForm> hospitalBranchForms = new ArrayList<HospitalBranchForm>();
		for (Map.Entry<String, Object> entry : map.entrySet()) {
			if (entry.getKey() == "branches") {
				for (HospitalBranch hospitalBranch : (List<HospitalBranch>) entry.getValue()) {
					HospitalBranchForm hospitalBranchForm = new HospitalBranchForm();
					hospitalBranchForm.setAddress1(hospitalBranch.getAddress1());
					hospitalBranchForm.setAddress2(hospitalBranch.getAddress2());
					hospitalBranchForm.setCity(hospitalBranch.getCity());
					hospitalBranchForm.setState(hospitalBranch.getState());
					hospitalBranchForm.setZipcode(hospitalBranch.getZipCode());
					hospitalBranchForm.setEmail(hospitalBranch.getEmail());
					hospitalBranchForm.setPhoneNo(hospitalBranch.getPhoneNo());
					hospitalBranchForms.add(hospitalBranchForm);
				}
			}
			else
				if(entry.getKey() == "hospName")
				{
					hospName=(String)entry.getValue();
				}
		}
		branchMap.put("hospName", hospName);
		branchMap.put("branches", hospitalBranchForms);
		return branchMap;
	}

}
