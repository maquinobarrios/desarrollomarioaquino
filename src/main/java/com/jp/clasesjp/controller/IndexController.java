package com.jp.clasesjp.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class IndexController {



	@GetMapping(value="/Tecnicos",	produces=MediaType.TEXT_PLAIN_VALUE)
	public String getTecnico() {
		return "hola pokemon";
	}
	
	
}
