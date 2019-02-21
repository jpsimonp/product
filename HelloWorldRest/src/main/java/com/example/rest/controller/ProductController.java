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
		return new CommonMatchData();
	}
	
	@GetMapping(value = "/evolution01", produces = "application/json")
	@ResponseBody
	public CommonMatchData evolution01() {
		return new CommonMatchData();
	}
	
	@GetMapping(value = "/evolution02", produces = "application/json")
	@ResponseBody
	public CommonMatchData evolution02() {
		return new CommonMatchData();
	}
	
	@GetMapping(value = "/evolution03", produces = "application/json")
	@ResponseBody
	public CommonMatchData evolution03() {
		return new CommonMatchData();
	}
	
	@GetMapping(value = "/evolution0101", produces = "application/json")
	@ResponseBody
	public CommonMatchData evolution0101() {
		return new CommonMatchData();
	}
	
	@GetMapping(value = "/evolution0102", produces = "application/json")
	@ResponseBody
	public CommonMatchData evolution0102() {
		return new CommonMatchData();
	}
	
	@GetMapping(value = "/evolution0103", produces = "application/json")
	@ResponseBody
	public CommonMatchData evolution0103() {
		return new CommonMatchData();
	}
	
	@GetMapping(value = "/evolutionrelease02", produces = "application/json")
	@ResponseBody
	public CommonMatchData evolutionrelease02() {
		return new CommonMatchData();
	}
	
	@GetMapping(value = "/evolutionrelease021", produces = "application/json")
	@ResponseBody
	public CommonMatchData evolutionrelease021() {
		return new CommonMatchData();
	}
}
