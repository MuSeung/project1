package com.shop.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Cart {
	private int cart_no;
	private String userid;
	private int i_code;
	private int cnt;
	
	public Cart(String userid, int i_code, int cnt){
		this.userid=userid;
		this.i_code=i_code;
		this.cnt=cnt;
	}
}
