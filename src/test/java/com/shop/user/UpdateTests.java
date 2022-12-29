package com.shop.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.User;
import com.shop.service.UserService;

@SpringBootTest
class UpdateTests {

	@Autowired
	UserService service;
	
	@Test
	void contextLoads() {
		User obj = new User("lss", "999900", "이순신2", "01000000000", "lssnew@naver.com", "전라남도 통영시 충무로 222");
		try {
			service.modify(obj);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}







