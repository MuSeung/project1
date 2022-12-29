package com.shop.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.User;
import com.shop.service.UserService;

@SpringBootTest
class SelectTests {

	@Autowired
	UserService service;
	
	@Test
	void contextLoads() {
		User obj = null;
		try {
			obj = service.get("pjw");
			System.out.println("OK");
			System.out.println(obj);
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}







