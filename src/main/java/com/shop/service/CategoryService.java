package com.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dto.Category;
import com.shop.frame.MyService;
import com.shop.mapper.CategoryMapper;

@Service
public class CategoryService implements MyService<Integer, Category>{

	@Autowired
	CategoryMapper mapper;
	
	@Override
	public void register(Category v) throws Exception {
		mapper.insert(v);
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
		
	}

	@Override
	public void modify(Category v) throws Exception {
		mapper.update(v);
		
	}

	@Override
	public Category get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<Category> get() throws Exception {
		return mapper.selectall();
	}
	
	//카테고리 검색기능
	public List<Category> searchcate(String txt) throws Exception{
		return mapper.searchcate(txt);
	}
	
}
