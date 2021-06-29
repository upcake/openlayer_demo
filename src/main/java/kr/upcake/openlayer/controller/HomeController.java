package kr.upcake.openlayer.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping(value="/")
	public String home(Model model) {
		return "index";
	}
	
	@GetMapping(value="/sub/**")
	public String toSub(HttpServletRequest req) {
		String uri = req.getRequestURI();
		uri = uri.substring(uri.lastIndexOf("/") + 1, uri.length());
		
		return "sub/" + uri;
	}
}