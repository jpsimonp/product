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
	
	@GetMapping(value = "/evolution01release03", produces = "application/json")
	@ResponseBody
	public CommonMatchData evolution01release03() {
		return new CommonMatchData();
	}

	@GetMapping(value = "/evolution02release03", produces = "application/json")
	@ResponseBody
	public CommonMatchData evolution02release03() {
		return new CommonMatchData();
	}
	
	@GetMapping(value = "/evolution03release03", produces = "application/json")
	@ResponseBody
	public CommonMatchData evolution03release03() {
		return new CommonMatchData();
	}
}
