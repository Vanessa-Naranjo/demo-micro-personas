package com.lvnr.demo.micro.persona.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lvnr.demo.micro.persona.dto.PersonaDto;
import com.lvnr.demo.micro.persona.service.PersonaService;

@RestController
public class PersonaController {
	@Autowired
	private PersonaService personaService;

	@GetMapping
	public List<PersonaDto> consultarPersonas() {
		return personaService.consultarPersonas();
	}

	@PostMapping
	public void crearPersona(@RequestBody PersonaDto persona) {
		personaService.crearPersona(persona);
	}

	@PostMapping("/crearPersonas")
	public void crearPersonas(@RequestBody List<PersonaDto> personaDto) {
		personaService.crearPersonas(personaDto);
	}

	@GetMapping("/consultarPersona")
	public PersonaDto consultarPersonaPorTipoDocumentoyDocumento(@RequestParam String tipoDocumento,
			@RequestParam String documento) {
		return personaService.consultarPersonaPorTipoDocumentoyDocumento(tipoDocumento, documento);
	}

	@DeleteMapping("/{tipoDocumento}/{documento}")
	public String eliminarPersonaPorTipoDocumentoyDocumento(@PathVariable String tipoDocumento,
			@PathVariable String documento) {
		return personaService.eliminarPersonaPorTipoDocumentoyDocumento(tipoDocumento, documento);
	}

	@PutMapping("/tipodedocumento/{tipoDocumento}/documento/{documento}")
	public PersonaDto actualizarPersona(@PathVariable String tipoDocumento, @PathVariable String documento,
			@RequestBody PersonaDto personaDto) {
		return personaService.actualizarPersona(tipoDocumento, documento, personaDto);
	}
}
