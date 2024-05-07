package com.SystemDesignRound.SystemDesignRound;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*
1. It should have login page.
2. User should be provide correct credentials
3. We should be able to authorize
4. Based on the authentication we should provide OTP/token to user with some expiry.
 */
@SpringBootApplication
public class SystemDesignRoundApplication {

	public static void main(String[] args) {
		SpringApplication.run(SystemDesignRoundApplication.class, args);
	}

}
