package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class objetivocontroller {

	@GetMapping
	public String Objetivos() {
		return "Java <br/ > "
				+ "Lógica da programação <br/>";
}
}
