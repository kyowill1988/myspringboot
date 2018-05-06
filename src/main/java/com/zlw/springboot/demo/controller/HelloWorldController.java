package com.zlw.springboot.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value="你是世界", description="你好世界")
@RequestMapping(value= "/hello",method=RequestMethod.GET)
public class HelloWorldController {
	
	@RequestMapping(value= "",method=RequestMethod.GET)
	@ApiOperation(value= "你好世界",notes="")
	public String index() {
		return "hello world";
	}
	
}
