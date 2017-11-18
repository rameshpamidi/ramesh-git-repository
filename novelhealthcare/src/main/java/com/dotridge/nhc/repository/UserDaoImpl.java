package com.dotridge.nhc.repository;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.dotridge.nhc.entity.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	public User getUserByName(String name) {
		Query query = sessionFactory.openSession().createQuery("from User where userName=:userName");
		query.setParameter("userName", name);
		User user = (User) query.uniqueResult();
		return user;

	}

}
