package com.shop.order;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Order;
import com.shop.service.OrderService;

@SpringBootTest
class SelectTests {
	
	@Autowired
	OrderService service;
	
	@Test
	void contextLoads() {
		Order obj = null;
		try {
			obj = service.get(10);
			System.out.println("OK");
			System.out.println(obj);
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}
}
