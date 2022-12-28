package com.shop.item;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.service.ItemService;

@SpringBootTest
class DeleteTests {

	@Autowired
	ItemService service;
	
	@Test
	void contextLoads() {
		try {
			service.remove(100);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}







