package com.boldadeideas.springboot.form.app.services;

import java.util.List;

import com.boldadeideas.springboot.form.app.models.domain.Pais;

public interface PaisService {
	
	public List<Pais> listar();
	
	public Pais obtenerPorId(Integer id);
	
}
