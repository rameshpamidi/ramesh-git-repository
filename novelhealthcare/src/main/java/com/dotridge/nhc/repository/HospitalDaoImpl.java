package com.dotridge.nhc.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dotridge.nhc.entity.Hospital;
import com.dotridge.nhc.entity.HospitalBranch;
/**
 * The Class HospitalDaoImpl.
 */
@Repository("hospitalDao")
public class HospitalDaoImpl implements HospitalDao {

	/** The session factory. */
	@Autowired
	private SessionFactory sessionFactory;
	List<HospitalBranch> hospitalBranches=new ArrayList<HospitalBranch>();
	@Override
	public Hospital addHospital(Hospital hospital) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(hospital);
		session.getTransaction().commit();
		session.close();
		System.out.println(hospital);
		return hospital;
	}

	@Override
	public HospitalBranch addHospitalBranch(HospitalBranch branch,final int hospId) {
		
		hospitalBranches.add(branch);
		Session session1 = sessionFactory.openSession();
		Hospital hospital =(Hospital) session1.get(Hospital.class, hospId);
		session1.close();
		hospital.setBranches(hospitalBranches);
		Session session2 = sessionFactory.openSession();
		session2.beginTransaction();
		session2.update(hospital);
		session2.getTransaction().commit();
		session2.close();
		return branch;
	}

	@Override
	public Hospital updateHospital(Hospital hospital) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(hospital);
		session.getTransaction().commit();
		session.close();
		System.out.println(hospital);
		return hospital;
	}

	@Override
	public HospitalBranch updateHospitalBranch(HospitalBranch branch) {
		return null;
	}

	@Override
	public void deleteHospital(int hospitalId) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(session.get(Hospital.class, hospitalId));
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void deleteHospitalBranch(int branchId) {
		
	}

	@Override
	public Hospital getHospitalById(int hospId) {
		Session session = sessionFactory.openSession();
		Hospital hospital=(Hospital)session.load(Hospital.class, hospId);
		session.close();
		return  hospital;
	}
	
	@Override
	public Hospital getBranchById(int branchId) {
		return null;
	}


	@Override
	public Map<String, Object> getAllBranches(final int hospitalId) {
		Map<String, Object> map=new HashMap<String, Object>();
		Session session = sessionFactory.openSession();
		Hospital hospital=(Hospital)session.get(Hospital.class, hospitalId);
		 List<HospitalBranch> branches = hospital.getBranches();
		 map.put("hospName", hospital.getHospitalName());
		 map.put("branches", branches);
		 session.close();
		 return map;
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Hospital> getAllHospitals() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Hospital");
		List<Hospital> hospitals = query.list();
		session.close();
		return hospitals;
	}
	
	@Override
	public void updateHospitalStatus(final int hospId) {
		Session session = sessionFactory.openSession();
		Hospital hospital = (Hospital) session.get(Hospital.class, hospId);
		if (hospital.isStatus() == false) {
			hospital.setStatus(true);
			session.beginTransaction();
			session.update(hospital);
			session.getTransaction().commit();
		} else {
			hospital.setStatus(false);
			session.beginTransaction();
			session.update(hospital);
			session.getTransaction().commit();
		}
	}
}
