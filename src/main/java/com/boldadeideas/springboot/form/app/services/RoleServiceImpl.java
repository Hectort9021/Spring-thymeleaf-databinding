package com.boldadeideas.springboot.form.app.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.boldadeideas.springboot.form.app.models.domain.Roles;

@Service
public class RoleServiceImpl implements RoleService {

	private List<Roles> lista;
	
	public RoleServiceImpl() {
		this.lista = new ArrayList<>();
		lista.add(new Roles(1, "Administrador", "ROLE_ADMIN"));
		lista.add(new Roles(2, "Usuario", "ROLE_USER"));
		lista.add(new Roles(3, "Moderador", "ROLE_MODERATOR"));
	}

	@Override
	public List<Roles> listar() {
		return lista;
	}

	@Override
	public Roles obtenerPorId(Integer id) {
		Roles resultado = null;
		for (Roles role : lista) {
			if(id == role.getId()) {
				resultado = role;
				break;
			}
		}
		
		return resultado;
	}

}
