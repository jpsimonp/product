package com.example.product.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@RequestMapping(value = "/product", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public String project() {
		return "Product";
	}

}
