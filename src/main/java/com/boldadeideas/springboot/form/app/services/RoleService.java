package com.boldadeideas.springboot.form.app.services;

import java.util.List;

import com.boldadeideas.springboot.form.app.models.domain.Roles;

public interface RoleService {
	
	public List<Roles> listar();
	
	public Roles obtenerPorId(Integer id);
}
