package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "OrderItem")
@ToString
@Setter
@Getter
public class OrderItem {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long order_item_id;
	
	@Column
	private Long order_id;
	
	@Column
	private Long item_id;
	
	@Column
	private int orderPrice;
	
	@Column
	private int count;
}
