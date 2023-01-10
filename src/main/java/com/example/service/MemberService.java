package com.example.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.example.entity.Member;
import com.example.entity.emf.UniqueEntityManagerFactory;
// MVC에서 DAO
public class MemberService {
					//객체만 정의된 상태(비영속상태) 
	public void save(Member member) {
		//앤티티 매니저 팩토리 : 애플리케이션 당 하나만 공유
		EntityManagerFactory emf = UniqueEntityManagerFactory.emf; //엔티티 매니저 팩토리
		
		//엔티티 매니저: 앤티티 매니저 팩토리를 생성한다
		//엔티티 매니저: 엔티티를 저장,수정,삭제,조회(Crud)와 관련된 작업을 수행
		//createEntityManager() : 엔티티매니져를 생성 및 제어
		EntityManager em = emf.createEntityManager();
		
		//트랜잭션(쪼갤 수 없는 업무의 단위)
		//data를 변경하는 모든 작업은 반드시 transaction안에서 이루어져야한다.
		//매니져에서 트랜젝션생성
		EntityTransaction tx = em.getTransaction();
		
		try {		
			tx.begin(); //트랜잭션 시작과 동시에 커넥션을 획득
			
			//영속:엔티티 매니저를 통해 엔티티를 영속성 컨텍스트에 저장
			//persist과정에서 테이블을 만들어주고 데이터를 삽입함
			em.persist(member); //영속(엔티티는 영속성 컨텍스트에 항상 담겨야함)
			
			tx.commit(); // 실제 DB에 저장이 된다.			
		} catch (Exception e) {
			//만약 에러가 났을때
			e.printStackTrace();
			tx.rollback(); //DB에 저장을 시키지 않고 롤백시킴
		}finally {
			//영속이 있으면 준 영속도 있어야함
			//영속성 컨텍스트에서 관리하던 영속상태의 엔티티를 영속성 컨텍스트가 관리하지 않음
			em.close(); //*준영속:영속성 컨텍스트에 엔티티가 저장되었다가 분리된 상태
			//em.detach(member);
			//em.clear();
			
			//em.remove(member); // 삭제상태:영속성 컨텍스트와 데이터베이스에서 삭제된 상태
		}
		
	}
}
