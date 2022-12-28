package com.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dto.Adm;
import com.shop.frame.MyService;
import com.shop.mapper.AdmMapper;

@Service
public class AdmService implements MyService<String, Adm>{

	@Autowired
	AdmMapper mapper;
	
	@Override
	public void register(Adm v) throws Exception {
		mapper.insert(v);
		
	}

	@Override
	public void remove(String k) throws Exception {
		mapper.delete(k);
		
	}

	@Override
	public void modify(Adm v) throws Exception {
		mapper.update(v);
		
	}

	@Override
	public Adm get(String k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<Adm> get() throws Exception {
		return mapper.selectall();
	}
	
}
