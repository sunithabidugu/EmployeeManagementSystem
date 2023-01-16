package com.cg.ems.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "login_table")
public class UserDto {
	@Id
	int userId;
	@Column(name = "user_password")
	String passWord;
	@Column(name = "user_role")
	String role;
	@Column(name = "user_result")
	int result;
	public UserDto(int userId, String passWord, String role, int result) {
		super();
		this.userId = userId;
		this.passWord = passWord;
		this.role = role;
		this.result = result;
	}
	public UserDto() {
		super();
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "UserDto [userId=" + userId + ", passWord=" + passWord + ", role=" + role + ", result=" + result + "]";
	}
	

}
