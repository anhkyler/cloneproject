package com.example.cloneproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.example.cloneproject.service.InitializationService;

@SpringBootApplication
//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class CloneprojectApplication implements CommandLineRunner{

	@Autowired
	InitializationService initializationService;
	
	@EventListener(ApplicationReadyEvent.class)
	public void doSomethingAfterStartup() {
		initializationService.startServiceNight();	
	}
	
	public static void main(String[] args) {
		SpringApplication.run(CloneprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
