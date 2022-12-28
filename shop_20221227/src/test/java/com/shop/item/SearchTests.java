package com.shop.item;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Item;
import com.shop.service.ItemService;

@SpringBootTest
class SearchTests {

	@Autowired
	ItemService service;
	
	@Test
	void contextLoads() {
		List<Item> objs = null;
		try {
			objs = service.searchItem("지");
			for(Item obj:objs) {
				System.out.println(obj);
			}
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}







