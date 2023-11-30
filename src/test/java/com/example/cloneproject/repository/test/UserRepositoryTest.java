package com.example.cloneproject.repository.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import com.example.cloneproject.CloneprojectApplication;
import com.example.cloneproject.entity.UserEntity;
import com.example.cloneproject.repository.UserRepository;

//@ExtendWith(SpringExtension.class)
@Transactional
@SpringBootTest(classes = CloneprojectApplication.class)
public class UserRepositoryTest {
	  @Autowired
	  UserRepository userRepository;
	  
	  @Test
	  public void testfindAll() {
		  UserEntity auser = new UserEntity();
		  auser.setUserId(1);
		  auser.setFirstName("Hieu");
		  auser.setFirstName("So");
		  userRepository.save(auser);
		  UserEntity auser2 = userRepository.findByUserId(1);
		  assertEquals(auser2.getUserId(), 1);	 
	  }
}
