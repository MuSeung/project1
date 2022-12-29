package com.shop.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.shop.dto.Cart;
import com.shop.frame.MyMapper;

@Repository
@Mapper
public interface CartMapper extends MyMapper<Integer, Cart>{

}
