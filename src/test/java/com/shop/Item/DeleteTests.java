package com.shop.Item;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.service.ItemService;
import com.shop.service.UserService;

@SpringBootTest
class DeleteTests {

	@Autowired
	ItemService service;
	
	@Test
	void contextLoads() {
		
		try {
			service.remove(1111);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}







