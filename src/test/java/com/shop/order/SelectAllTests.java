package com.shop.order;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Order;
import com.shop.service.OrderService;

@SpringBootTest
class SelectAllTests {
	
	@Autowired
	OrderService service;
	
	@Test
	void contextLoads() {
		List<Order> objs = null;
		try {
			objs = service.get();
			System.out.println("OK");
			for(Order obj:objs) {
				System.out.println(obj);
			}
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}
}
