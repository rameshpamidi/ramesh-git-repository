package com.dotridge.nhc.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dotridge.nhc.model.AdminBean;
import com.dotridge.nhc.repository.AdminDao;
import com.dotridge.nhc.util.AdminServiceUtils;

@Service("adminService")
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDao adminDao;

	@Override
	public AdminBean addAdmin(AdminBean adminBean) {
		return  AdminServiceUtils.mapAdminDomainToAdminBean(adminDao.addAdmin(AdminServiceUtils.mapAdminBeanToAdminDomain(adminBean),adminBean.getHospitalId()));
	}

	@Override
	public AdminBean updateAdmin(AdminBean adminBean) {
		return null;
	}

	@Override
	public AdminBean getAdminById(int adminId) {
		return null;
	}

	@Override
	public void deleteAdmin(int adminId) {

	}

	@Override
	public List<AdminBean> getAllAdmins() {
		return AdminServiceUtils.mapAdminDomainsToAdminBeans(adminDao.getAllAdmins());
	}

}
