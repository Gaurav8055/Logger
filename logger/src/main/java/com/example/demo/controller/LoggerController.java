package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;

@RestController
@RequestMapping("logger")
public class LoggerController {

	static final Logger LOGGER = LoggerFactory.getLogger(LoggerController.class);

	@GetMapping("/hi")
	public JsonNode printLoggers() {

		JsonNode responseMsg = null;

		System.out.println("-----------------------------Logges--------------------------");

		int a = 10 + 10;
		LOGGER.trace("TRACE lOGGER" + ":" + a);

		int b = 20 + 20;
		LOGGER.debug("Debug Logger :" + b);

		String Info = "Info Logger is Here";
		LOGGER.info("Info Logger :" + Info);

		String warn = "Error Logger is here";
		LOGGER.warn("WARN LOGGER : " + warn);

		String error = "Wrong Output";
		LOGGER.error("ERROR LOGGER : " + error);
//		LOGGER.fatal("fatal Logger"); <-- WHY fATAL IS NOT COME ?

		return responseMsg;

	}

}
