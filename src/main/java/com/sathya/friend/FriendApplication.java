package com.sathya.friend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class FriendApplication {

	public static void main(String[] args) {
		SpringApplication.run(FriendApplication.class, args);
	}

}
