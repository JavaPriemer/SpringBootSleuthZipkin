package com.ankit.zipkin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AppOneController {

	@Autowired
	private RestTemplate template;

	private static final Logger LOGGER = LoggerFactory.getLogger(AppOneController.class);

	private static final String REST_URL = "http://localhost:8082/showB";

	@GetMapping("/showA")
	public String oneMessage() {
		LOGGER.info("MS#1 APPONECONTROLLER::ONEMESSAGE METHOD");
		String response = template.getForObject(REST_URL, String.class);
		LOGGER.info("BACK TO MS#1" + response);
		return "EXECUTION DONE";
	}

}
