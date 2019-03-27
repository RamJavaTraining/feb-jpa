package com.imcs.krishna.feb.jpa.dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.imcs.krishna.feb.jpa.model.User;

public class UserDao {
	
	
	
	public Set<User> getUsers(){
		
		Set<User> users= new HashSet<User>();
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		User user = new User();
		user.setUserID(3);
		user.setFirstName("asfsad");
		user.setLastName("12312");
		
		   EntityTransaction transaction = entityManager.getTransaction();
		   transaction.begin();
		   entityManager.persist(user);
		   transaction.commit();
		   
		   
		
		
		
		 Query query = entityManager.createQuery("select u from User u");
		 List<User> resultList = (List<User>)query.getResultList();
		
		
		users.addAll(resultList);
		
		
		return users;
		
		
		
	}

}
