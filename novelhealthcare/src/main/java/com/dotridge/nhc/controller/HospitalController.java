package com.dotridge.nhc.controller;

import java.util.Map;

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

import com.dotridge.nhc.model.HospitalBranchForm;
import com.dotridge.nhc.model.HospitalForm;
import com.dotridge.nhc.service.HospitalService;

// TODO: Auto-generated Javadoc
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
		model.addAttribute("hospitalForm", new HospitalForm());
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
	public String addHospital(@Valid @ModelAttribute("hospitalForm") HospitalForm hospitalForm, BindingResult result,
			Model model) {
		String viewPage = null;
		if (result.hasErrors()) {
			viewPage = "superadmin/addHospitalPage";
			return viewPage;
		} else {
			HospitalForm hospital = hospitalService.addHospital(hospitalForm);
			if (hospital.getHospitalId() != 0) {
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
	public String editHospital(@Valid @ModelAttribute("hospitalForm") HospitalForm hospitalForm, Model model) {
		String viewPage = null;
		HospitalForm updatedHospital = hospitalService.updateHospital(hospitalForm);
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
	public String deleteHospital(@RequestParam("hospId") int hospId, Model model) {
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
	 * @param model
	 *            the model
	 * @return the string
	 */
	@RequestMapping(value = { "/addbranchpage" }, method = RequestMethod.GET)
	public String addBranchpage(@RequestParam("hospId") int hospId, @RequestParam("hospName") String hospName,
			ModelMap modelMap) {
		modelMap.put("hospId", hospId);
		modelMap.put("hospName", hospName);
		modelMap.put("hospitalBranch", new HospitalBranchForm());
		return "superadmin/addBranchPage";
	}

	/**
	 * Adds the branch.
	 *
	 * @param hospitalBranchForm
	 *            the hospital branch form
	 * @param hospId
	 *            the hosp id
	 * @param modelmap
	 *            the modelmap
	 * @return the string
	 */
	@RequestMapping(value = { "/addbranch" }, method = RequestMethod.POST)
	public String addBranch(@Valid @ModelAttribute("hospitalBranch") HospitalBranchForm hospitalBranchForm,
			BindingResult result, @RequestParam("hospId") int hospId,@RequestParam("hospName") String hospName, ModelMap modelmap) {
		String viewPage = null;
		if (result.hasErrors()) {
			modelmap.put("hospId", hospId);
			modelmap.put("hospName", hospName);
			viewPage = "superadmin/addBranchPage";
		} else {
			HospitalBranchForm branchForm = hospitalService.addHospitalBranch(hospitalBranchForm, hospId);
			if (branchForm.getBranchId() != 0) {
				viewPage = viewBranches(hospId, modelmap);
			} else {
				modelmap.put("failuremsg", "adding branch failed!..");
				viewPage = "superadmin/addBranchPage";
			}
		}
		return viewPage;
	}

	/**
	 * View branches.
	 *
	 * @param hospId
	 *            the hosp id
	 * @param modelmap
	 *            the modelmap
	 * @return the string
	 */
	@RequestMapping(value = { "/viewbranches" }, method = RequestMethod.GET)
	public String viewBranches(@RequestParam("hospId") int hospId, ModelMap modelmap) {
		Map<String, Object> branchMap = hospitalService.getAllBranches(hospId);
		modelmap.put("hospId", hospId);
		modelmap.putAll(branchMap);
		return "superadmin/viewBranchesPage";
	}

}
