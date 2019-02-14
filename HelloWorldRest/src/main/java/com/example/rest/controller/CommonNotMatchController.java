package com.example.rest.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.data.CommonNotMatchData;

/**
 * 
 * @author jpsimon
 * 
 * PRODUCT
 * 
 * Greeting controller class is shared in project and product but one less method greetingRemarks on product
 *
 */
@RestController
public class CommonNotMatchController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping(value = "/greeting", produces = "application/json")
    public CommonNotMatchData greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new CommonNotMatchData(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
   /* @GetMapping(value = "/greeting/evolution1", produces = "application/json")
    public String evolution1() {
        return "Greeting evolution1";
    }*/
}
