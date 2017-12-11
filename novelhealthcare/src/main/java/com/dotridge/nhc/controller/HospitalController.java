package com.dotridge.nhc.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dotridge.nhc.model.BranchBean;
import com.dotridge.nhc.model.HospitalBean;
import com.dotridge.nhc.service.HospitalService;

/**
 * The Class HospitalController.
 */
@Controller
public class HospitalController {

	/** The hospital service. */
	@Autowired
	private HospitalService hospitalService;

	/**
	 * Adds the hospital page.
	 *
	 * @param model
	 *            the model
	 * @return the string
	 */
	@RequestMapping(value = { "/addhospitalpage" }, method = RequestMethod.GET)
	public String addHospitalPage(Model model) {
		model.addAttribute("hospitalForm", new HospitalBean());
		return "superadmin/addHospitalPage";
	}

	/**
	 * Adds the hospital.
	 *
	 * @param hospitalForm
	 *            the hospital form
	 * @param result
	 *            the result
	 * @param model
	 *            the model
	 * @return the string
	 */
	@RequestMapping(value = { "/addhospital" }, method = RequestMethod.POST)
	public String addHospitalHandler(@Valid @ModelAttribute("hospitalForm") HospitalBean hospitalForm,
			BindingResult result, Model model) {
		String viewPage = null;
		if (result.hasErrors()) {
			viewPage = "superadmin/addHospitalPage";
			return viewPage;
		} else {
			HospitalBean hospital = hospitalService.addHospital(hospitalForm);
			if (hospital != null) {
				viewPage = viewAllHospitalsPage(model);
			}
		}

		return viewPage;
	}

	/**
	 * Edits the hospital page.
	 *
	 * @param hospId
	 *            the hosp id
	 * @param model
	 *            the model
	 * @return the string
	 */
	@RequestMapping(value = { "/edithospitalpage" }, method = RequestMethod.GET)
	public String editHospitalPage(@RequestParam("hospId") int hospId, Model model) {
		model.addAttribute("hospitalForm", hospitalService.getHospitalById(hospId));
		return "superadmin/editHospitalPage";
	}

	/**
	 * Edits the hospital.
	 *
	 * @param hospitalForm
	 *            the hospital form
	 * @param model
	 *            the model
	 * @return the string
	 */
	@RequestMapping(value = { "/edithospital" }, method = RequestMethod.POST)
	public String editHospitalHandler(@Valid @ModelAttribute("hospitalForm") HospitalBean hospitalForm, Model model) {
		String viewPage = null;
		HospitalBean updatedHospital = hospitalService.updateHospital(hospitalForm);
		if (updatedHospital != null)
			viewPage = viewAllHospitalsPage(model);
		else
			viewPage = "superadmin/editHospitalPage";
		return viewPage;
	}

	/**
	 * View all hospitals page.
	 *
	 * @param model
	 *            the model
	 * @return the string
	 */
	@RequestMapping(value = { "/viewallhospitals" }, method = RequestMethod.GET)
	public String viewAllHospitalsPage(Model model) {
		model.addAttribute("hospitals", hospitalService.getAllHospitals());
		return "superadmin/viewHospitalsPage";
	}

	/**
	 * Delete hospital.
	 *
	 * @param hospId
	 *            the hosp id
	 * @param model
	 *            the model
	 * @return the string
	 */
	@RequestMapping(value = { "/deletehospital" }, method = RequestMethod.GET)
	public String deleteHospitalHandler(@RequestParam("hospId") int hospId, Model model) {
		hospitalService.deleteHospital(hospId);
		return viewAllHospitalsPage(model);

	}

	/**
	 * Update hospital status.
	 *
	 * @param hospId
	 *            the hosp id
	 * @param model
	 *            the model
	 * @return the string
	 */
	@RequestMapping(value = { "/statusUpdate" }, method = RequestMethod.GET)
	public String updateHospitalStatus(@RequestParam("hospId") int hospId, Model model) {
		hospitalService.updateHosptialStatus(hospId);
		return viewAllHospitalsPage(model);

	}

	/**
	 * Adds the branchpage.
	 *
	 * @param hospId
	 *            the hosp id
	 * @param hospName
	 *            the hosp name
	 * @param modelMap
	 *            the model map
	 * @return the string
	 */
	@RequestMapping(value = { "/addbranchpage" }, method = RequestMethod.GET)
	public String addBranchpage(@RequestParam("hospId") int hospId, @RequestParam("hospName") String hospName,
			ModelMap modelMap) {
		modelMap.put("hospId", hospId);
		modelMap.put("hospName", hospName);
		modelMap.put("hospitalBranch", new BranchBean());
		return "superadmin/addBranchPage";
	}

	/**
	 * Adds the branch.
	 *
	 * @param hospitalBranchForm
	 *            the hospital branch form
	 * @param result
	 *            the result
	 * @param hospId
	 *            the hosp id
	 * @param hospName
	 *            the hosp name
	 * @param modelmap
	 *            the modelmap
	 * @return the string
	 */
	@RequestMapping(value = { "/addbranch" }, method = RequestMethod.POST)
	public String addBranchHandler(@Valid @ModelAttribute("hospitalBranch") BranchBean hospitalBranchForm,
			BindingResult result, @RequestParam("hospId") int hospId, @RequestParam("hospName") String hospName,
			ModelMap modelmap) {
		String viewPage = null;
		if (result.hasErrors()) {
			modelmap.put("hospId", hospId);
			modelmap.put("hospName", hospName);
			viewPage = "superadmin/addBranchPage";
		} else {
			BranchBean branchForm = hospitalService.addHospitalBranch(hospitalBranchForm, hospId);
			if (branchForm.getBranchId() != 0) {
				viewPage = viewBranchesPage(hospId, hospName, modelmap);
			} else {
				modelmap.put("failuremsg", "adding branch failed!..");
				viewPage = "superadmin/addBranchPage";
			}
		}
		return viewPage;
	}

	/**
	 * Edits the branchpage.
	 *
	 * @param hospId
	 *            the hosp id
	 * @param branchId
	 *            the branch id
	 * @param hospName
	 *            the hosp name
	 * @param modelMap
	 *            the model map
	 * @return the string
	 */
	@RequestMapping(value = { "/editbranchpage" }, method = RequestMethod.GET)
	public String editBranchpage(@RequestParam("hospId") int hospId, @RequestParam("branchId") int branchId,
			@RequestParam("hospName") String hospName, ModelMap modelMap) {
		modelMap.put("hospitalBranch", hospitalService.getHospitalBranchById(branchId));
		modelMap.put("hospId", hospId);
		modelMap.put("hospName", hospName);
		return "superadmin/editBranchPage";
	}

	/**
	 * Edits the branch.
	 *
	 * @param hospitalBranchForm
	 *            the hospital branch form
	 * @param result
	 *            the result
	 * @param hospId
	 *            the hosp id
	 * @param hospName
	 *            the hosp name
	 * @param modelmap
	 *            the modelmap
	 * @return the string
	 */
	@RequestMapping(value = { "/editbranch" }, method = RequestMethod.POST)
	public String editBranchHandler(@Valid @ModelAttribute("hospitalBranch") BranchBean hospitalBranchForm,
			BindingResult result, @RequestParam("hospId") int hospId, @RequestParam("hospName") String hospName,
			ModelMap modelmap) {
		String viewPage = null;
		if (result.hasErrors()) {
			modelmap.put("hospId", hospId);
			modelmap.put("hospName", hospName);
			viewPage = "superadmin/editBranchPage";
		} else {
			BranchBean branchForm = hospitalService.updateHospitalBranch(hospitalBranchForm);
			if (branchForm != null) {
				viewPage = viewBranchesPage(hospId, hospName, modelmap);
			} else {
				modelmap.put("failuremsg", "updating branch failed!..");
				viewPage = "superadmin/editBranchPage";
			}
		}
		return viewPage;
	}

	/**
	 * Delete branch.
	 *
	 * @param hospId
	 *            the hosp id
	 * @param hospName
	 *            the hosp name
	 * @param branchId
	 *            the branch id
	 * @param modelMap
	 *            the model map
	 * @return the string
	 */
	@RequestMapping(value = { "/deletebranch" }, method = RequestMethod.GET)
	public String deleteBranchHandler(@RequestParam("hospId") int hospId, @RequestParam("hospName") String hospName,
			@RequestParam("branchId") int branchId, ModelMap modelMap) {
		hospitalService.deleteHospitalBranch(branchId, hospId);
		return viewBranchesPage(hospId, hospName, modelMap);
	}

	/**
	 * View branches.
	 *
	 * @param hospId
	 *            the hosp id
	 * @param hospName
	 *            the hosp name
	 * @param modelmap
	 *            the modelmap
	 * @return the string
	 */
	@RequestMapping(value = { "/viewbranches" }, method = RequestMethod.GET)
	public String viewBranchesPage(@RequestParam("hospId") int hospId, @RequestParam("hospName") String hospName,
			ModelMap modelmap) {
		List<BranchBean> branches = hospitalService.getAllBranches(hospId);
		modelmap.put("hospId", hospId);
		modelmap.put("hospName", hospName);
		modelmap.put("branches", branches);
		return "superadmin/viewBranchesPage";
	}

}
