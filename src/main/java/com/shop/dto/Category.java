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
public class Category {
	private int cat_num;
	private int cat_num_up;
	private String cat_name;
	public Category(int cat_num_up, String cat_name) {
		super();
		this.cat_num_up = cat_num_up;
		this.cat_name = cat_name;
	}
	
	
	
	
}
