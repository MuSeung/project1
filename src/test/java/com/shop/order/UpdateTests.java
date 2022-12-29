package com.shop.order;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Order;
import com.shop.service.OrderService;

@SpringBootTest
class UpdateTests {
	
	@Autowired
	OrderService service;
	
	@Test
	void contextLoads() {
		Order obj = new Order(10, "gbh", 0, "휴대폰", "결제대기", null);
		try {
			service.modify(obj);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}
}
