package com.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstTest {
	
	@RequestMapping("/hello")
	public String hello(@RequestParam String firstname,@RequestParam String lastname) {
		System.out.println(firstname);
		String rez= "Здравствуйте " + firstname.substring(0,1)+"."+lastname +"!";
		return rez;
	}

}
