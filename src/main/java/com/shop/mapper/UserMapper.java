package com.shop.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.shop.dto.User;
import com.shop.frame.MyMapper;

@Repository
@Mapper
public interface UserMapper extends MyMapper<String, User>{
	
}
