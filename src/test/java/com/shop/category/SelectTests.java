package com.shop.category;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Category;
import com.shop.service.CategoryService;

@SpringBootTest
class SelectTests {

	@Autowired
	CategoryService service;
	
	@Test
	void contextLoads() {
		Category obj = null;
		try {
			obj = service.get(1);
			System.out.println("OK");
			System.out.println(obj);
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}







