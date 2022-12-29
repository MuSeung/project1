package com.shop.Item;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Item;
import com.shop.dto.User;
import com.shop.service.ItemService;
import com.shop.service.UserService;

@SpringBootTest
class SelectTests {

	@Autowired
	ItemService service;
	
	@Test
	void contextLoads() {
		Item obj = null;
		try {
			obj = service.get(1111);
			System.out.println("OK");
			System.out.println(obj);
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}







