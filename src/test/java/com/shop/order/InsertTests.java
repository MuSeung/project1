package com.shop.order;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Order;
import com.shop.service.OrderService;

@SpringBootTest
class InsertTests {
	
	@Autowired
	OrderService service;
	
	@Test
	void contextLoads() {
		Order obj = new Order(0, "gbh", 0, "신용", "결제완료", null);
		try {
			service.register(obj);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}
}
