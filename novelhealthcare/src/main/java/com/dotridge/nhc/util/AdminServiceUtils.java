package com.dotridge.nhc.util;

import java.util.ArrayList;
import java.util.List;

import com.dotridge.nhc.entity.Address;
import com.dotridge.nhc.entity.Admin;
import com.dotridge.nhc.model.AdminBean;

public class AdminServiceUtils {
	
	public static Admin mapAdminBeanToAdminDomain(AdminBean adminBean)
	{
		Admin admin=new Admin();
		admin.setFullName(adminBean.getFirstName()+" "+adminBean.getLastName());
		admin.setEmail(adminBean.getEmail());
		admin.setUserName(adminBean.getUserName());
		admin.setPassword(adminBean.getPassword());
		admin.setPhoneNumber(adminBean.getPhoneNo());
		admin.setGender(adminBean.getGender());
		admin.setStatus(adminBean.isStatus());
		Address address=new Address();
		address.setAddress1(adminBean.getAddress1());
		address.setAddress2(adminBean.getAddress2());
		address.setCity(adminBean.getCity());
		address.setState(adminBean.getState());
		admin.setAddress(address);
		return admin;
	}
	
	public static AdminBean mapAdminDomainToAdminBean(Admin admin)
	{
		AdminBean adminBean=new AdminBean();
		String[] strings = admin.getFullName().split("");
		adminBean.setFirstName(strings[0]);
		adminBean.setLastName(strings[1]);
		adminBean.setEmail(admin.getEmail());
		adminBean.setPhoneNo(admin.getPhoneNumber());
		adminBean.setStatus(admin.getStatus());
		return adminBean;
	}
	
	public static List<AdminBean> mapAdminDomainsToAdminBeans(List<Admin> admins)
	{
		List<AdminBean> adminBeans=new ArrayList<AdminBean>();
		for (Admin admin : admins) {
			AdminBean adminBean=new AdminBean();
			String[] strings = admin.getFullName().split("");
			adminBean.setFirstName(strings[0]);
			adminBean.setLastName(strings[1]);
			adminBean.setEmail(admin.getEmail());
			adminBean.setPhoneNo(admin.getPhoneNumber());
			adminBean.setStatus(admin.getStatus());
			adminBeans.add(adminBean);
		}
		return adminBeans;
	}

}
