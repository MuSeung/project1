package com.shop.Item;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Item;
import com.shop.dto.User;
import com.shop.service.ItemService;
import com.shop.service.UserService;

@SpringBootTest
class InsertTests {

	@Autowired
	ItemService service;
	
	@Test
	void contextLoads() {
		Item obj = new Item(1111,2,"1234",111);
		try {
			service.register(obj);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}







