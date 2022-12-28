package com.shop.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Cust;
import com.shop.service.CustService;

@SpringBootTest
class SelectTests {

	@Autowired
	CustService service;
	
	@Test
	void contextLoads() {
		Cust cust = null;
		try {
			cust = service.get("id01");
			System.out.println(cust);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}







