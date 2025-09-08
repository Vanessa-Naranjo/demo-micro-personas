package com.lvnr.demo.micro.persona.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lvnr.demo.micro.persona.dto.PersonaDto;
import com.lvnr.demo.micro.persona.service.PersonaService;

@RestController
public class PersonaController {

	private PersonaService personaService = new PersonaService();

	@GetMapping
	public List<PersonaDto> consultarPersonas() {
		return personaService.consultarPersonas();

	}

	@PostMapping
	public void crearPersona(@RequestBody PersonaDto persona) {
		personaService.crearPersona(persona);
	}

	@GetMapping("/consultarPersona")
	public PersonaDto consultarPersonaPorTipoDocumentoyDocumento(
			@RequestParam String tipoDocumento,
			@RequestParam String documento) {
		return personaService.consultarPersonaPorTipoDocumentoyDocumento(tipoDocumento, documento);
	}
}
