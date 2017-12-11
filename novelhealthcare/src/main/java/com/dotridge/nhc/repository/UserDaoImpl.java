package com.dotridge.nhc.repository;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dotridge.nhc.entity.UserProfile;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	public UserProfile getUserDetials(String name) {
		Query query = sessionFactory.openSession().createQuery(" from UserProfile profile where profile.userName=:userName");
		query.setParameter("userName", name);
		query.setCacheable(true);
		UserProfile userProfile = (UserProfile) query.uniqueResult();
		return userProfile;

	}

}
