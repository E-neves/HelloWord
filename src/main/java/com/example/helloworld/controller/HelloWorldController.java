package com.example.helloworld.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello-world")
public class HelloWorldController {

	@GetMapping
	public String helloworld () {
	return "Hello World";
	}
	
	@GetMapping ("/bsm")
	public String bsmgeneration () {
	return "Mentalidade de Crescimento\r\n"
			+ "Persistência\r\n"
			+ "Responsabilidade Pessoal\r\n"
			+ "Orientação ao Futuro\r\n"
			+ "Comunicação\r\n"
			+ "Orientação ao Detalhe\r\n"
			+ "Proatividade\r\n"
			+ "Trabalho em Equipe";
	}
	
	@GetMapping ("/bsm/objetivo")
	public String objetivosdasemana () {
	return "Persistencia e Orientação ao detalhe";
	}
}
