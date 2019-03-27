package com.imcs.krishna.feb.jpa.service;

import java.util.Set;

import com.imcs.krishna.feb.jpa.dao.UserDao;
import com.imcs.krishna.feb.jpa.model.User;

public class UserService {
	
	
	public static void main(String args[]) {
		
		UserDao dao= new UserDao();
		Set<User> users = dao.getUsers();
		System.out.println("======");
		for (User user : users) {
			System.out.println(user.getUserID());
			System.out.println(user.getFirstName());
			System.out.println(user.getLastName());
			System.out.println("======");
		}
	}

}
