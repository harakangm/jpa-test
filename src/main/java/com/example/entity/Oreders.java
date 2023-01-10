package com.example.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.constant.OrderStatus;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Oreder")
@Setter
@Getter
@ToString
public class Oreders {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long order_ID;
	
	@Column
	private Long member_id;
	
	@Column
	private Date orderDate;
	
	@Column
	private OrderStatus status;
}
