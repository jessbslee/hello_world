package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class hellocontroller {
	
	@GetMapping
	public String hello() {
		return "Hello World";
	}
	@GetMapping ("/bsm")
	public String bsm() {
		return "BSM-0: Introdução às Habilidades Comportamentais e Mentalidades <br/ > "
				+ "BSM-GM: Mentalidade de Crescimento <br/ > BSM-P: Persistência <br/ > "
				+ "BSM-PR: Responsabilidade Pessoal \r\n <br/ > "
				+ "BSM-FO: Orientação ao Futuro <br/ > "
                + "BSM-C: Comunicação <br/ > BSM-OD: Orientação ao Detalhe <br/ > "
                + "BSM-PA: Proatividade <br/ > BSM-T: Trabalho em Equipe";
	}
}
