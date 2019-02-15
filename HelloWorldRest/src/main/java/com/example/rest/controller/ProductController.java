package com.example.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.data.CommonMatchData;

/**
 * 
 * @author jpsimon
 * 
 * PRODUCT
 * 
 * Project controller class is just in product
 *
 */
@RestController
public class ProductController {
	
	@GetMapping(value = "/product", produces = "application/json")
	@ResponseBody
	public CommonMatchData product() {
		return new CommonMatchData("Product");
	}
	
	@GetMapping(value = "/product/evolution1", produces = "application/json")
	@ResponseBody
	public CommonMatchData evolution1() {
		return new CommonMatchData("evolution1");
	}
	
	@GetMapping(value = "/product/evolution2", produces = "application/json")
	@ResponseBody
	public CommonMatchData evolution2() {
		return new CommonMatchData("evolution2");
	}

}
