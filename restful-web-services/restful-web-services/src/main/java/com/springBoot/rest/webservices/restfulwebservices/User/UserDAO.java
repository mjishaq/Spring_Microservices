package com.springBoot.rest.webservices.restfulwebservices.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDAO {
	
	public static int count=3;
	private static List<User> userList = new ArrayList<User>();

	static {
		
		userList.add(new User(1,"Bond",new Date()));
		userList.add(new User(2,"Welcome",new Date()));
		userList.add(new User(3,"USA",new Date()));
	}
	
	public List<User> findAll()
	{
		return userList;
	}
	
	public User SaveUser(User user) {
		if(user.getRollNo() == null ) {
			user.setRollNo(++count);
				
		}
		 userList.add(user);
		 return user;
		
		
		
	}
	
	public User findOne(int id) {
		
		for(User loop : userList) {
			if(loop.getRollNo() == id) {
				return loop;
			}
			
		}
		return null;
		
	
		
		
	}
	
	
public User deleteById(int id) {
		Iterator<User> iteratorObj = userList.iterator();
		while (iteratorObj.hasNext()) {
			User user = iteratorObj.next();
			if(user.getRollNo()==id) {
				iteratorObj.remove();
				return user;
			}
			
			}
		return null;
		}
		
	
		
	
	
	
}
