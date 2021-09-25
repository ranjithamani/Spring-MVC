package com.xworkz.springweb.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class SpringController {
	public SpringController() {
	}

	@RequestMapping(value = "/actor.com")

	public String onClickRequest(@RequestParam String actorName, @RequestParam String directorName,
			@RequestParam String heroinName, Model model) {
		System.out.println("invoked onclick request");
		System.out.println("actorName" + actorName);
		System.out.println("directorName" + directorName);
		System.out.println("heroinName" + heroinName);

		model.addAttribute("heroinName", heroinName);
		model.addAttribute("actorName", actorName);
		model.addAttribute("directorName", directorName);

		return "/WEB-INF/pages/ABCResponse.jsp";
	}

	@RequestMapping(value = "/ranjitha.com")
	public String onClicked() {
		System.out.println("Invoked onClicked");

		return "/WEB-INF/pages/ABCResponse.jsp";
	}

	@RequestMapping(value = "/abc.com")
	public String onClicked1() {
		System.out.println("Invoked onClicked1");
		return "/WEB-INF/pages/Training.jsp";
	}

	@RequestMapping(value = "/xyz.com")
	public String onClicked2() {
		System.out.println("Invoked onClicked2");
		return "/WEB-INF/pages/Developer.jsp";
	}

}
