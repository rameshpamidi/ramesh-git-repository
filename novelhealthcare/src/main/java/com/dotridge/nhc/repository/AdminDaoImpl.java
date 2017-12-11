package com.dotridge.nhc.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dotridge.nhc.entity.Admin;
import com.dotridge.nhc.entity.Hospital;

@Repository("adminDao")
public class AdminDaoImpl  implements AdminDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Admin addAdmin(Admin admin,final int hospitalId) {

		Session session = sessionFactory.openSession();
		Hospital hospital=(Hospital)session.load(Hospital.class, hospitalId);
		admin.setHospital(hospital);
		session.beginTransaction();
		session.saveOrUpdate(admin);
		session.getTransaction().commit();
		session.close();
		return admin;
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(admin);
		session.getTransaction().commit();
		session.close();
		return admin;
	}

	@Override
	public void deleteAdmin(int adminId) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(adminId);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public Admin getAdminById(int adminId) {
		return (Admin) sessionFactory.openSession().get(Admin.class, adminId);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Admin> getAllAdmins() {
		return sessionFactory.openSession().createQuery("from Admin").list();
	}

}
