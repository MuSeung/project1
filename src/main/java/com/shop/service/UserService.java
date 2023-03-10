package com.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dto.User;
import com.shop.frame.MyService;
import com.shop.mapper.UserMapper;

@Service
public class UserService implements MyService<String, User>{

	@Autowired
	UserMapper mapper;
	
	@Override
	public void register(User v) throws Exception {
		mapper.insert(v);
		
	}

	@Override
	public void remove(String k) throws Exception {
		mapper.delete(k);
		
	}

	@Override
	public void modify(User v) throws Exception {
		mapper.update(v);
		
	}

	@Override
	public User get(String k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<User> get() throws Exception {
		return mapper.selectall();
	}
	
}
