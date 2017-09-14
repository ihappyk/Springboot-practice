package com.ihappyk.practice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/practice")
public class PracticeController {

	@RequestMapping(method = RequestMethod.GET)
	public String ping() {
		return "Practice Works";
	}
}
