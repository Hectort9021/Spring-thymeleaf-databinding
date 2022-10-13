package com.boldadeideas.springboot.form.app.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.boldadeideas.springboot.form.app.models.domain.Pais;

@Service
public class PaisServiceImpl implements PaisService {

	private List<Pais> lista;
	
	public PaisServiceImpl() {
		this.lista = Arrays.asList(
				new Pais(1, "ES", "Espana"), 
				new Pais(2, "MX", "Mexico"), 
				new Pais(3, "CL", "Chile"), 
				new Pais(4, "AR", "Argentina"), 
				new Pais(5, "PE", "Peru"), 
				new Pais(6, "CO", "Colombia"), 
				new Pais(7, "VZ", "Venezuela"));
	}
	
	@Override
	public List<Pais> listar() {
		return lista;
	}

	@Override
	public Pais obtenerPorId(Integer id) {
		
		Pais resultado = null;
		for (Pais pais : this.lista) {
			if(pais.getId().equals(id)) {
				resultado = pais;
				break;
			}
		}
		
		return resultado;
	}

	

}
