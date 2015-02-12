package com.nyx.maven.ws.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import com.nyx.maven.ws.domain.User;
import com.nyx.maven.ws.service.IHelloWorld;

@WebService(endpointInterface="com.nyx.maven.ws.service.IHelloWorld")
public class HelloWorldImpl implements IHelloWorld {

	private Map<String, User> map = null;
	
	private List<User> users = null;

	private User[] userArr = null;
	
	@Override
	public String sayHello(String message) {
		return "Hello " + message;
	}

	@Override
	public Map<String, User> getMapInfo() {
		
		map = new HashMap<String, User>();
		
		
		User u1 = new User(System.currentTimeMillis()+"", "张三", "zhansan");
		User u2 = new User(System.currentTimeMillis()+"", "李四", "lisi");
		
		map.put("0001", u1);
		map.put("0002", u2);
		
		return map;
	}

	@Override
	public List<User> getAllUser() {
		
		
		
		users = new ArrayList<User>();
		
		User u1 = new User(System.currentTimeMillis()+"", "张三", "zhansan");
		User u2 = new User(System.currentTimeMillis()+"", "李四", "lisi");
		User u3 = new User(System.currentTimeMillis()+"", "李四", "lisi");
		User u4 = new User(System.currentTimeMillis()+"", "李四", "lisi");
		User u5 = new User(System.currentTimeMillis()+"", "李四", "lisi");
		User u6 = new User(System.currentTimeMillis()+"", "李四", "lisi");
		User u7 = new User(System.currentTimeMillis()+"", "李四", "lisi");
		User u8 = new User(System.currentTimeMillis()+"", "李四", "lisi");
		
		users.add(u1);
		users.add(u2);
		users.add(u3);
		users.add(u4);
		users.add(u5);
		users.add(u6);
		users.add(u7);
		users.add(u8);
		
		return users;
	}

	@Override
	public User[] getAllUserArr() {
		User u1 = new User(System.currentTimeMillis()+"", "张三", "zhansan");
		User u2 = new User(System.currentTimeMillis()+"", "李四", "lisi");
		User u3 = new User(System.currentTimeMillis()+"", "李四", "lisi");
		User u4 = new User(System.currentTimeMillis()+"", "李四", "lisi");
		userArr = new User[]{u1,u2,u3,u4};
		return userArr;
	}

}
