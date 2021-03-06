package com.javainuse.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {

	@Value("${eureka.client.serviceUrl.defaultZone}")
	private String message;

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String firstPage() {
		System.out.println("test endpoint added");
		return message;
	}

}
