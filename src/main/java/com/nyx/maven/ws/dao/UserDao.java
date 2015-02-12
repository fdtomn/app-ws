package com.nyx.maven.ws.dao;

import java.util.Map;

import com.nyx.maven.ws.domain.User;

public class UserDao {

	//private List<User> users;
	
	private static Map<String, User> uMap;
	
	static{
		User u1 = new User();
		u1.setId(System.currentTimeMillis()+"");
		u1.setUsername("zzz");
		u1.setPassword("222222222222");
		
		uMap.put( "0001", u1);
		
	}
	
	public User getUser(String id){
		
		return uMap.get(id);
	}
}
