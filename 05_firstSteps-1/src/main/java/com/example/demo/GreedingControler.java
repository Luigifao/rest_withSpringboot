package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreedingControler {
	private static final String template = "Hello, %s";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/greeding")
	public Greeding greeting (@RequestParam(value= "name",defaultValue = "World")
	String name) {
		return new Greeding(0,String.format(template, name));
	}

}
