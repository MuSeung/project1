package com.shop.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.User;
import com.shop.service.UserService;

@SpringBootTest
class InsertTests {

	@Autowired
	UserService service;
	
	@Test
	void contextLoads() {
		User obj = new User("lss", "9999", "이순신", "01010002000", "lss@naver.com", "전라남도 통영시 충무로 100");
		try {
			service.register(obj);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}







