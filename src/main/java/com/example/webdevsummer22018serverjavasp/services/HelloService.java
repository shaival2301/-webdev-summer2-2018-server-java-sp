package com.example.webdevsummer22018serverjavasp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.webdevsummer22018serverjavasp.models.Hello;
import com.example.webdevsummer22018serverjavasp.repositories.HelloRepository;

@RestController
public class HelloService {

	@Autowired
	HelloRepository helloRepository;
	
	@GetMapping("/api/hello")
	public Iterable<Hello> getHello()
	{
		return helloRepository.findAll();
	}
}
