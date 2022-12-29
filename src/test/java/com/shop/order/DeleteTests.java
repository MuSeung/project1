package com.shop.order;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.service.OrderService;

@SpringBootTest
class DeleteTests {
	
	@Autowired
	OrderService service;
	
	@Test
	void contextLoads() {
		try {
			service.remove(14);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}
}
