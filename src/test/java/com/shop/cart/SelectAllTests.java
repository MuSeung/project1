package com.shop.cart;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Cart;
import com.shop.service.CartService;

@SpringBootTest
class SelectAllTests {

	@Autowired
	CartService service;
	
	@Test
	void contextLoads() {
		List<Cart> objs = null;
		try {
			objs = service.get();
			System.out.println("OK");
			for(Cart a:objs) {
				System.out.println(a);
			}
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}







