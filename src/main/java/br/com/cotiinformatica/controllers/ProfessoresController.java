package br.com.cotiinformatica.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/professores")
public class ProfessoresController {

	@PostMapping
	public void post() {

	}

	@PutMapping
	public void put() {

	}

	@DeleteMapping
	public void delete() {

	}

	@GetMapping
	public void get() {
	}

}
