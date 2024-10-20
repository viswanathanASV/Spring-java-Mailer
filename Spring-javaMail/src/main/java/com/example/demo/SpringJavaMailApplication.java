package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.example.demo.mailService.JavaMailerService;

@SpringBootApplication
public class SpringJavaMailApplication {
	
	@Autowired 
	private JavaMailerService jm;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJavaMailApplication.class, args);
		
	}
	@EventListener(ApplicationReadyEvent.class) 
	public void send() {
		jm.sendMail("viswanathanasv333@gmail.com", "testmail", "Testing content for mail-java mailer project");
		
	}
}
