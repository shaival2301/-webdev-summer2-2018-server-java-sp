package com.example.webdevsummer22018serverjavasp.services;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.webdevsummer22018serverjavasp.models.user;

@RestController
public class UserService {
	// http://localhost:/register
	@PostMapping("/register")
	public user register(@RequestBody user user1) {
		return user1;
	}
}
