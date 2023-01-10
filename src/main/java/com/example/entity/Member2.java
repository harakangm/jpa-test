package com.example.entity;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Member2")
@Setter
@Getter
@ToString
public class Member2 {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Member_Id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name ="city")
	private String city;
	
	@Column
	private String street;
	
	@Column
	private String zipcode;
	
}
