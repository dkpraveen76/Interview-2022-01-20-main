package com.example.intrv;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuickController {
	
	@CrossOrigin
	@GetMapping("/")
	public String index() {
		return "Hello World";
	}
	
	
	@CrossOrigin
	@GetMapping("/ramu")
	public String indexramu() {
		return "Hello Ramu";
	}
	
	@CrossOrigin
	@GetMapping("/kk")
	public String indexkk() {
		return "Hello kk";
	}
	@CrossOrigin
	@GetMapping("/praveen")
	public String indexpraveen() {
		return "Hello praveen";
	}

	@CrossOrigin
	@GetMapping("/sir")
	public String indexsir() {
		return "Hello Sir";
	}

}
