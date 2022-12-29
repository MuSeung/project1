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
public class User {
	private String userid;
	private String pwd;
	private String name;
	private String tel;
	private String email;
	private String addr;
}
