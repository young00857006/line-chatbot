package com.example.linemessagereply;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
@ComponentScan(basePackages="com.example.linemessagereply.*")


public class LineMessageReplyApplication {

	public static void main(String[] args) {
		SpringApplication.run(LineMessageReplyApplication.class, args);

	}

}
