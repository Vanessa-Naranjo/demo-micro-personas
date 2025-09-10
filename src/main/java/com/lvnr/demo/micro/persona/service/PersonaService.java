package com.lvnr.demo.micro.persona.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.lvnr.demo.micro.persona.dto.PersonaDto;

@Service
public class PersonaService {

	private List<PersonaDto> personas;

	public PersonaService() {
		personas = new ArrayList<>();
	}

	public void crearPersona(String tipoDocumento, String documento, String nombre, String apellidos) {
		PersonaDto personaDto = new PersonaDto(tipoDocumento, documento, nombre, apellidos);
		this.personas.add(personaDto);
	}

	public void crearPersona(PersonaDto persona) {
		this.personas.add(persona);
	}

	public void crearPersonas(List<PersonaDto> personaDto) {
		this.personas.addAll(personaDto);
	}

	public List<PersonaDto> consultarPersonas() {
		return personas;
	}

	public PersonaDto consultarPersonaPorTipoDocumentoyDocumento(String tipoDocumento, String documento) {
		for (PersonaDto personaDto : personas) {
			if (personaDto.getTipoDocumento().equals(tipoDocumento) && personaDto.getDocumento().equals(documento)) {
				return personaDto;
			}
		}
		return null;
	}

	public String eliminarPersonaPorTipoDocumentoyDocumento(String tipoDocumento, String documento) {
		PersonaDto personaDto = this.consultarPersonaPorTipoDocumentoyDocumento(tipoDocumento, documento);
		if (personaDto == null) {
			return "La persona no existe: " + documento;
		}
		this.personas.remove(personaDto);
		return "Se ha eliminado la persona";
	}

	public PersonaDto actualizarPersona(String tipoDocumento, String documento, PersonaDto personaDto) {
		this.eliminarPersonaPorTipoDocumentoyDocumento(tipoDocumento, documento);
		personas.add(personaDto);
		return personaDto;
	}
}