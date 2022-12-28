package com.shop.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.shop.dto.Adm;
import com.shop.frame.MyMapper;

@Repository
@Mapper
public interface AdmMapper extends MyMapper<String, Adm>{
	
}
