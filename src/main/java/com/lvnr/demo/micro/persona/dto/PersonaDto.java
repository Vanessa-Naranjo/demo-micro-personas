package com.lvnr.demo.micro.persona.dto;

public class PersonaDto {

	private String tipoDocumento;
	private String documento;
	private String nombre;
	private String apellidos;

	public PersonaDto() {

	}

	public PersonaDto(String tipoDocumento, String documento, String nombre, String apellidos) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.documento = documento;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

}
