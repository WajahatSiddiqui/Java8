package com.wajahat.learn.json.converter.client;

import com.wajahat.learn.json.converter.domain.User;
import com.wajahat.learn.json.converter.util.JsonUtil;

public class Client {

	public static void main(String args[]) {
		User user = new User();
		user.setId(1L);
		user.setName("Wajahat");
		user.setAge(23);
		
		System.out.println("User object = " + user.toString());
		
		String jsonUser = JsonUtil.getInstance().toJsonString(user);
		
		System.out.println("Conveted into Json: " + jsonUser);
		
		User fromJson = (User) JsonUtil.getInstance().toJavaObject(jsonUser, User.class);
		
		System.out.println("Got from Json Java Object " + fromJson);
		
	}
}
