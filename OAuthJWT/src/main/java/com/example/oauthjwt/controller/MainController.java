package com.example.oauthjwt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MainController {
	
	@GetMapping("/")
	@ResponseBody  // api 서버로써 요청이 오면 응답바디 전달
	public String mainAPI() {
		
		return "main route";
	}

}
