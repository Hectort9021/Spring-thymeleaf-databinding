package com.boldadeideas.springboot.form.app.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.boldadeideas.springboot.form.app.models.domain.Role;

@Service
public class RoleServiceImpl implements RoleService {

	private List<Role> lista;
	
	public RoleServiceImpl() {
		this.lista = new ArrayList<>();
		lista.add(new Role(1, "Administrador", "ROLE_ADMIN"));
		lista.add(new Role(2, "Usuario", "ROLE_USER"));
		lista.add(new Role(3, "Moderador", "ROLE_MODERATOR"));
	}

	@Override
	public List<Role> listar() {
		return lista;
	}

	@Override
	public Role obtenerPorId(Integer id) {
		Role resultado = null;
		for (Role role : lista) {
			if(id == role.getId()) {
				resultado = role;
				break;
			}
		}
		
		return resultado;
	}

}
