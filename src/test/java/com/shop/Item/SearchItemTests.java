package com.shop.Item;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Item;
import com.shop.service.ItemService;

@SpringBootTest
class SearchItemTests {

	@Autowired
	ItemService service;
	
	@Test
	void contextLoads() {
		List<Item> objs = null;
		try {
			objs = service.searchItem("청");
			System.out.println("OK");
			for(Item obj:objs) {
				System.out.println(obj);
			}
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}







