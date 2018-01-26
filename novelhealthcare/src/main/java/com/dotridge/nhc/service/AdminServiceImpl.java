package com.dotridge.nhc.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dotridge.nhc.model.AdminBean;
import com.dotridge.nhc.repository.AdminDao;
import com.dotridge.nhc.util.AdminServiceUtils;

@Service("adminService")
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDao adminDao;

	@Override
	@Transactional
	public AdminBean addAdmin(AdminBean adminBean) {
		return  AdminServiceUtils.mapAdminDomainToAdminBean(adminDao.addAdmin(AdminServiceUtils.mapAdminBeanToAdminDomain(adminBean),adminBean.getHospitalId()));
	}

	@Override
	@Transactional
	public AdminBean updateAdmin(AdminBean adminBean) {
		return null;
	}

	@Override
	@Transactional
	public AdminBean getAdminById(int adminId) {
		return AdminServiceUtils.mapAdminDomainToAdminBean(adminDao.getAdminById(adminId));
	}

	@Override
	@Transactional
	public void deleteAdmin(int adminId) {

	}

	@Override
	@Transactional
	public List<AdminBean> getAllAdmins() {
		return AdminServiceUtils.mapAdminDomainsToAdminBeans(adminDao.getAllAdmins());
	}

}
