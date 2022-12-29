package com.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dto.Item;
import com.shop.frame.MyService;
import com.shop.mapper.ItemMapper;

@Service
public class ItemService implements MyService<Integer, Item>{

	@Autowired
	ItemMapper mapper;
	
	@Override
	public void register(Item v) throws Exception {
		mapper.insert(v);
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
		
	}

	@Override
	public void modify(Item v) throws Exception {
		mapper.update(v);
		
	}

	@Override
	public Item get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<Item> get() throws Exception {
		return mapper.selectall();
	}
	
}
