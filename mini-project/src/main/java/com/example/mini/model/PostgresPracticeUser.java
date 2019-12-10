package com.example.mini.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.util.Assert;

import com.sun.istack.Nullable;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
// Table practice_user 를 나타내는 Annotation
@Table(name = "users")
// 파라미터 없는 생성자를 가진다. => 외부에서 접근이 가능하지 X
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class PostgresPracticeUser {
	
	@Id
	@Column(name = "id")
	// 기본 키를 나타내는 Annotation
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	// user_email 컬럼을 나타내는 Annotation
	@Column(name ="user_email")
	@Nullable
	private String userEmail;
	
	@Column(name = "user_name")
	@Nullable
	private String userName;
	
	@Column(name = "user_id")
	@Nullable
	private String userId;
	
	@Column(name = "user_pwd")
	@Nullable
	private String userPwd;
	
	@Builder
	public PostgresPracticeUser(String userEmail, String userName, String userId, String userPwd) {
		Assert.hasText(userEmail,"userEmail must not be empty");
		Assert.hasText(userName,"userName must not be empty");
		Assert.hasText(userId,"userId must not be empty");
		Assert.hasText(userPwd,"userPwd must not be empty");
		
		this.userEmail = userEmail;
		this.userName = userName;
		this.userId = userId;
		this.userPwd = userPwd;
	}
}
