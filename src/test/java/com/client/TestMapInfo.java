package com.client;

import java.util.List;

import com.ws.IHelloWorld;
import com.ws.IHelloWorldService;
import com.ws.MapConvertor;
import com.ws.MapEntry;
import com.ws.User;


public class TestMapInfo {

	public static void main(String[] args) {
		
		/**
		 * 测试Map类型
		 */
		IHelloWorldService i = new IHelloWorldService();
		IHelloWorld a = i.getIHelloWorldPort();
		MapConvertor mapInfo = a.getMapInfo();
		List<MapEntry> entries = mapInfo.getEntries();
		
		for(MapEntry entry:entries){
			User u = (User)entry.getValue();
			System.out.println(entry.getKey()+ u.getPassword());
		}
		
		System.out.println("...............");
		
		List<User> allUser = a.getAllUser();
		
		System.out.println(allUser.size());
		
		List<User> allUserArr = a.getAllUserArr();
		for(User u:allUserArr){
			System.out.println(u.getUsername());
		}
	}
}
