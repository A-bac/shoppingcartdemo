package com.example.shoppingcartdemo;

import com.example.shoppingcartdemo.Entity.users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ShoppingcartdemoApplication {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		users user = new users();
		user.setUserid(1);
		user.setUsername("userman");
		user.setPassword("password");
		session.save(user);
		System.out.println("SAVED SUCCESSFUL");

		Query query = session.createQuery("update users set username=:n where userID=:i");
		query.setParameter("n", "Max");
		query.setParameter("i", "1");
		int status = query.executeUpdate();
		System.out.println(status);
		List<users> usersList = query.list();
		for(users use:usersList){
			System.out.println(use.toString());
		}
		System.out.println("RETRIEVED SUCCESSFULLY");
		t.commit();
		factory.close();
		session.close();

		SpringApplication.run(ShoppingcartdemoApplication.class, args);
	}

}
