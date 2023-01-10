package com.example.entity;

import java.util.Date;
import javax.persistence.*;
import com.example.constant.MemberClass;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Member {
	//엔티티 클래스 = MVC 에서 DO
	//필드값이 db에서 하나의 컬럼값이됨
	//어노테이션 컬럼은 하나의 컬럼 이름을 지정해주면 이름대로 컬럼이 생성
	//enum 타입을 이용하면 반드시 @Enumerated을 붙여줘야함
	//날짜 타입을 맵핑할때 @Temporal 사용
	//pk로 사용할 컬럼에는 @Id 어노테이션을 준다
	
	@Id
	@Column(name="member_id")
	//컬럼값을 알아서 넣어준다?? 시퀀스?
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	private String name;
	
	@Enumerated(EnumType.STRING)
	@Column
	private MemberClass memberclass;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
}
