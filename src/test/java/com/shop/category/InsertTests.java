package com.shop.category;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Category;
import com.shop.service.CategoryService;

@SpringBootTest
class InsertTests {

	@Autowired
	CategoryService service;
	
	@Test
	void contextLoads() {
		Category obj = new Category(1, "상의_맨투");
				
		try {
			service.register(obj);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}







