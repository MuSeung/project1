package com.shop.user;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.User;
import com.shop.service.UserService;

@SpringBootTest
class SelectAllTests {

	@Autowired
	UserService service;
	
	@Test
	void contextLoads() {
		List<User> objs = null;
		try {
			objs = service.get();
			System.out.println("OK");
			for(User a:objs) {
				System.out.println(a);
			}
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}







