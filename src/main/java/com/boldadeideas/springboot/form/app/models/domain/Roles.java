package com.boldadeideas.springboot.form.app.models.domain;

public class Roles {

	private Integer id;
	private String nombre;
	private String role;

	public Roles(Integer id, String nombre, String role) {
		this.id = id;
		this.nombre = nombre;
		this.role = role;
	}

	public Roles() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(this.getClass() != obj.getClass()) return false;
		
		Roles role = (Roles)obj;
		
		return this.id != null && this.id.equals(role.getId());
	}

}
