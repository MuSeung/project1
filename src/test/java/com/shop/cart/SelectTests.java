package com.shop.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Cart;
import com.shop.service.CartService;

@SpringBootTest
class SelectTests {

	@Autowired
	CartService service;
	
	@Test
	void contextLoads() {
		Cart obj = null;
		try {
			obj = service.get(30);
			System.out.println("OK");
			System.out.println(obj);
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}







