package com.javacourse.springBootDemo.apiDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {
	
	@GetMapping("/")
	public String get() {
		return "Monster Abra vA5 11.1.2 i7 processor 15.6 inch notebook ";
	}
	
	@GetMapping("/products")
	public String get2() {
		return "msi notebook ";
	}
	

}
