package com.shop.Item;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Item;
import com.shop.service.ItemService;

@SpringBootTest
class UpdateTests {

	@Autowired
	ItemService service;
	
	@Test
	void contextLoads() {
		Item obj = new Item(1111,2,"aaaa",124412);
		try {
			service.modify(obj);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}







