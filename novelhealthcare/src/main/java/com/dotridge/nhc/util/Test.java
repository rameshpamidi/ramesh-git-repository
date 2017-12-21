package com.dotridge.nhc.util;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.dotridge.nhc.config.ApplicationConfig;
import com.dotridge.nhc.entity.Admin;
import com.dotridge.nhc.entity.Hospital;
import com.dotridge.nhc.repository.AdminDaoImpl;

public class Test {

	public static void passwordEncoding() {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(8);

		String string = bCryptPasswordEncoder.encode("ramesh");
		System.out.println(string);

		/*
		 * try { MessageDigest md=MessageDigest.getInstance("SHA-1"); String
		 * password="ramesh"; md.update(password.getBytes()); byte[] bytes =
		 * md.digest(); System.out.println(bytes); String encodeData =
		 * Base64.getEncoder().encodeToString(bytes);
		 * System.out.println(encodeData); } catch (NoSuchAlgorithmException e)
		 * {
		 * 
		 * e.printStackTrace(); }
		 */
	}

	public static void main(String[] args) {

		/*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		AdminDaoImpl bean = (AdminDaoImpl) context.getBean("adminDao");
		bean.getAllHospitals();
		bean.getAllHospitals();
		bean.getAllBranches(8);
		bean.getAllBranches(8);
		Hospital hospital=new Hospital();
		hospital.setHospitalName("kims");
		hospital.setWebsiteUrl("www.kims.com");
		hospital.setStatus(true);
		//UserProfile admin=new UserProfile();
		Admin admin=new Admin();
		admin.setFullName("ramesh pamidi");
		admin.setEmail("rameshpamidi45@gmail.com");
		admin.setGender("male");
		admin.setUserName("ramesh123");
		admin.setPassword("ramesh@45");
		admin.setStatus(true);
		admin.setPhoneNumber(9969890915L);
		admin.setHospital(hospital);*/
		
		String s1="ramesh pamidi";  
		String[] words=s1.split("\\s");//splits the string based on whitespace  
		//using java foreach loop to print elements of string array  
		for(String w:words){  
		System.out.println(w);  
		}  
		
	}

}
