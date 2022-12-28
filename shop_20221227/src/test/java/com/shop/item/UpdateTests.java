package com.shop.item;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Cust;
import com.shop.dto.Item;
import com.shop.service.ItemService;

@SpringBootTest
class UpdateTests {

	@Autowired
	ItemService service;
	
	@Test
	void contextLoads() {
		Item item = new Item(105, "털신발", 100000, "f2.jpg", null);
		try {
			service.modify(item);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}







