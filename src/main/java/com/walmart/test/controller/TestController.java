package com.walmart.test.controller;

import java.util.Map;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.walmart.test.service.TestService;
import com.walmart.test.vo.Listados;

@Validated
@RestController
@RequestMapping("/api")
public class TestController {
	
	private static final Logger log = LoggerFactory.getLogger(TestController.class);

	@Autowired
	TestService testService;
	
	@PostMapping("/searchArray")
	public  Map<String, Integer> searchArray(@Valid @RequestBody Listados listados) {
		log.info("controller ArrayA {} ArrayB {}", listados.getListadoA().toString(),  listados.getListadoB().toString());
		return testService.countString(listados.getListadoA(), listados.getListadoB());
	}
}
