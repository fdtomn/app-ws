package com.nyx.maven.ws.service.rest.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Path;

import com.nyx.maven.ws.domain.User;
import com.nyx.maven.ws.service.rest.IUserService;

@Path("/user")
public class UserServiceImpl implements IUserService {

	private List<User> users = null;
	
	@Override
	public List<User> getAllUserXML() {
		
		users = new ArrayList<User>();
		
		User u1 = new User(System.currentTimeMillis()+"", "aaaa", "aaaa");
		User u2 = new User(System.currentTimeMillis()+"", "aaaa", "aaaa");
		User u3 = new User(System.currentTimeMillis()+"", "aaaa", "aaaa");
		User u4 = new User(System.currentTimeMillis()+"", "aaaa", "aaaa");
		
		users.add(u1);
		users.add(u2);
		users.add(u3);
		users.add(u4);
		
		return users;
	}
	
	@Override
	public List<User> getAllUserJSON() {
		
		users = new ArrayList<User>();
		
		User u1 = new User(System.currentTimeMillis()+"", "aaaa", "aaaa");
		User u2 = new User(System.currentTimeMillis()+"", "aaaa", "aaaa");
		User u3 = new User(System.currentTimeMillis()+"", "aaaa", "aaaa");
		User u4 = new User(System.currentTimeMillis()+"", "aaaa", "aaaa");
		
		users.add(u1);
		users.add(u2);
		users.add(u3);
		users.add(u4);
		
		return users;
	}
}
