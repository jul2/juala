/*
 * Hello.java 2018. 06. 09
 *
 * Copyright 2018 NHN Corp. All rights Reserved.
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.spring.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Byeongjae
 */
@RestController
@RequestMapping("/hello")
public class Hello {


	@RequestMapping(value = "/testdata", method = {RequestMethod.GET})
	public String index() {
		System.out.println("[juala_test] function Called ");
		return "Greetings from Spring Boot!";
	}

}
