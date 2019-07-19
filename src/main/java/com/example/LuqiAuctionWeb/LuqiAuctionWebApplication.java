package com.example.LuqiAuctionWeb;

import com.example.LuqiAuctionWeb.LuqiUser.LuqiUser;
import com.example.LuqiAuctionWeb.LuqiUser.LuqiUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class LuqiAuctionWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(LuqiAuctionWebApplication.class, args);
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12); // Strength set as 12
		String encodedPassword = encoder.encode("login");
		System.out.println(encodedPassword);
	}

}
