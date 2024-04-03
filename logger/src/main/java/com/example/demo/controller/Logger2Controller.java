package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class Logger2Controller {
	public String get()
	{
		System.out.println("Hello");
		
		return get() ;
	}
}
