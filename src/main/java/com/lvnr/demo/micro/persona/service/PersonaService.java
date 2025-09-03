package com.lvnr.demo.micro.persona.service;

import java.util.ArrayList;
import java.util.List;

import com.lvnr.demo.micro.persona.dto.PersonaDto;

public class PersonaService {

	private List<PersonaDto> personas = new ArrayList<>();

	public void crearPersona(String tipoDocumento, String documento, String nombre, String apellidos) {
		PersonaDto personaDto = new PersonaDto(tipoDocumento, documento, nombre, apellidos);
		this.personas.add(personaDto);
	}

	public void crearPersona(PersonaDto persona) {
		this.personas.add(persona);
	}
	
	public List<PersonaDto> consultarPersonas() {
		return personas;
	}

}
