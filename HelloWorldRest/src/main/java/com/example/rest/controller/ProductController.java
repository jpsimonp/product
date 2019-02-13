package com.example.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.data.CommonData;

/**
 * 
 * @author jpsimon
 * 
 * Project controller class is just in product
 *
 */
@RestController
public class ProductController {
	
	@GetMapping(value = "/product", produces = "application/json")
	@ResponseBody
	public CommonData product() {
		return new CommonData("Product");
	}

}
