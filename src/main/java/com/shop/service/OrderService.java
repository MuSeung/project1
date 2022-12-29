package com.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dto.Order;
import com.shop.frame.MyService;
import com.shop.mapper.OrderMapper;

@Service
public class OrderService implements MyService<Integer, Order>{

	@Autowired
	OrderMapper mapper;
	
	@Override
	public void register(Order v) throws Exception {
		mapper.insert(v);
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
		
	}

	@Override
	public void modify(Order v) throws Exception {
		mapper.update(v);
		
	}

	@Override
	public Order get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<Order> get() throws Exception {
		return mapper.selectall();
	}

}
