package com.helloWorld.helloWorld.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	@GetMapping
	public String helloworld() {
		return "Hello World!!";
	}
	@GetMapping("/bsms")
    public List<String> listBsm() {
        return Arrays.asList(
        	"Persistência",
        	"Proatividade",
        	"Comunicação",
        	"Orientação ao Futuro",
        	"Orientação ao Detalhe",
        	"Trabalho em Equipe",
        	"Responsabilidade Pessoal",
        	"Mentalidade de Crescimento"   );
    
	}

    @GetMapping("/objetivos")
    public List<String> listObjetivos() {
        return Arrays.asList(
        	 "Reler o cookbook e fazer anotações",
        	 "Estudar Spring Boot",
        	 "Dia de revisão em grupo com colegas de sala",
             "Fazer exercícios para fixar Spring Boot e Java."
        );
    }
}

