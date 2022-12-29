package com.shop.category;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Category;
import com.shop.service.CategoryService;

@SpringBootTest
class SelectAllTests {

	@Autowired
	CategoryService service;
	
	@Test
	void contextLoads() {
		List<Category> objs = null;
		try {
			objs = service.get();
			System.out.println("OK");
			for(Category a:objs) {
				System.out.println(a);
			}
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}







