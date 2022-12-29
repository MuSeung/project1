package com.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dto.Cart;
import com.shop.frame.MyService;
import com.shop.mapper.CartMapper;

@Service
public class CartService implements MyService<Integer, Cart>{

	@Autowired
	CartMapper mapper;
	
	@Override
	public void register(Cart v) throws Exception {
		mapper.insert(v);		
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);		
	}

	@Override
	public void modify(Cart v) throws Exception {
		mapper.update(v);		
	}

	@Override
	public Cart get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<Cart> get() throws Exception {
		return mapper.selectall();
	}

}
