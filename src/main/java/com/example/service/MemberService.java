package com.example.service;

import javax.persistence.EntityManagerFactory;

import com.example.entity.Member;
import com.example.entity.emf.UniqueEntityManagerFactory;

public class MemberService {

	public void save(Member member) {
		//앤티티 매니저 팩토리 : 애플리케이션 당 하나만 공유
		EntityManagerFactory emf = UniqueEntityManagerFactory.emf; //엔티티 매니저 팩토리
		
	}
}
