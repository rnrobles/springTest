package com.walmart.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class defaultController {

	@GetMapping("/")
	public RedirectView get() {
		 RedirectView redirectView = new RedirectView();
		    redirectView.setUrl("http://localhost:8080/swagger-ui.html");
		    return redirectView;
	}
}
