package com.spring.boot.oracledb.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.oracledb.dto.MyIntroductionDTO;
import com.spring.boot.oracledb.repo.MyIntroRepo;
import com.spring.boot.oracledb.service.ExampleService;

@RestController
@RequestMapping("/")
public class ExampleController {
	
	@Autowired
	ExampleService example;
	
	@Autowired
	MyIntroRepo repo;

	@GetMapping("/hello")
	public String Hello() {
		return example.Hello();
	}
	
	@GetMapping("/helloJenkins")
	public String HelloJenkins() {
		return "Hello Jenkins";
	}

	@PostMapping("/myInfo/{name}/{experiance}/{skills}")
	public MyIntroductionDTO myInfo(@PathVariable String name, @PathVariable BigDecimal experiance, @PathVariable String skills) {
		return MyIntroductionDTO.builder().name(name).experiance(experiance).skills(skills).build();
		
	}
	
	@GetMapping("/getDataFromDB")
	public Iterable<MyIntroductionDTO> myInfoNowInOracleDB() {
		return repo.findAll();
	}
	
	@PostMapping("/persistToDB")
	public MyIntroductionDTO myInfoNowInOracleDB(MyIntroductionDTO dto) {
		return repo.save(dto);
	}
}
