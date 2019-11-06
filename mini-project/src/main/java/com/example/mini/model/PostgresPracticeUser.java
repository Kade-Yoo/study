package com.example.mini.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "practice_user")
public class PostgresPracticeUser implements Serializable {
	
	private static final long serialVersionUID = -735006240636182825L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private String userId;
	
	@Column(name = "user_name")
	private String userName;
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserId() {
		return this.userId;
	}
	
	public String getUserName() {
		return this.userName;
	}
}
