package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
public class Item {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long item_id;
	
	@Column
	private String name;
	
	@Column
	private int pirce;
	
	@Column
	private int stockquantity;
}
