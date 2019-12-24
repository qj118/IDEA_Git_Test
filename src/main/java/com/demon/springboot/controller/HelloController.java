package com.demon.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @ResponseBody
    @GetMapping("/hello")
    public String hello()
    {
	    System.out.println("Edit by git bash");
        System.out.println("Edit by IDEA master!");
        return "hello!";
    }
}
