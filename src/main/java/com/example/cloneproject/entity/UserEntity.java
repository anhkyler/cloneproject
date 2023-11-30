package com.example.cloneproject.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "USER")
public class UserEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="user_id", nullable = false, length = 8)
	protected Integer userId = 0;
	
	@Column(name="first_name", nullable = false, length = 8)
	protected String firstName="";
	
	@Column(name="last_name", nullable = false, length = 8)
	protected String lastName="";

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "UserEntity [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}
