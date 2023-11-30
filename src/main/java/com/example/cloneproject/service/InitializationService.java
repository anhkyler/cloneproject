package com.example.cloneproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cloneproject.entity.UserEntity;
import com.example.cloneproject.repository.UserRepository;

@Service
public class InitializationService {
	@Autowired
	UserRepository userRepository;
	
	public void startServiceNight() {
		List<UserEntity> listUsers =  userRepository.findAll();
		
	}
}
