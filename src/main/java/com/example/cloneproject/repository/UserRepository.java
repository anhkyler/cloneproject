package com.example.cloneproject.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.cloneproject.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {
	public List<UserEntity> findAll();
	
	public UserEntity findByUserId(Integer userId);
}
