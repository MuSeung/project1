package com.shop.dto;

import java.util.Date;

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
public class Order {
	private int order_id;
	private String userid;
	private int order_price;
	private String payment;
	private String status;
	private Date order_date;
}
