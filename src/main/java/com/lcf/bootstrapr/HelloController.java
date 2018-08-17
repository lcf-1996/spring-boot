package com.lcf.bootstrapr;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello(){
		return "<h1>hello world</h1>";
	}
	
}
