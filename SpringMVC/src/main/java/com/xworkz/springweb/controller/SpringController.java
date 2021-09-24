package com.xworkz.springweb.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping
public class SpringController {
	public SpringController() {
	}

	@RequestMapping(value = "/ranjitha.com")
	public void onClicked() {
		System.out.println("Invoked onClicked");
	}

	@RequestMapping(value = "/abc.com")
	public void onClicked1() {
		System.out.println("Invoked onClicked1");
	}

	@RequestMapping(value = "/xyz.com")
	public void onClicked2() {
		System.out.println("Invoked onClicked2");
	}
}
