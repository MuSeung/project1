package com.shop.category;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.mapper.CategoryMapper;
import com.shop.service.CategoryService;
import com.shop.service.ItemService;

@SpringBootTest
class DeleteTests {

	@Autowired
	CategoryService service;
	
	@Test
	void contextLoads() {
		
		try {
			service.remove(2);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}







