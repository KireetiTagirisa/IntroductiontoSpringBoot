package com.codingshuttle.week1Introduction.IntroductiontoSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroductiontoSpringBootApplication implements CommandLineRunner{

	// @Autowired
	// Apple apple1;
	// @Autowired
	// Apple apple2;
	@Autowired
	DBService dbService;
	public static void main(String[] args) {
		SpringApplication.run(IntroductiontoSpringBootApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception{
		// apple1.eatApple();
		// apple2.eatApple();
		// System.out.println(apple1.hashCode());
		// System.out.println(apple2.hashCode());
		System.out.println(dbService.getData());
	}
}
