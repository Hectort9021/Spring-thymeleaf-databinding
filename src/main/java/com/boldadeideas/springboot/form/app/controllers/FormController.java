package com.boldadeideas.springboot.form.app.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.boldadeideas.springboot.form.app.models.domain.Usuario;

@Controller
@SessionAttributes("usuario")
public class FormController {

	@GetMapping("/form")
	public String form(Model model) {

		Usuario usuario = new Usuario();
		
		usuario.setNombre("John");
		usuario.setApellido("Doe");
		usuario.setIdentificador("123.456.789-K");
		
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Formulario Usuarios");
		return "form";
	}

	@PostMapping("/form")
	// You can use @RequestParam to get an attribute from the form with the name
	// @RequestParam String username, @RequestParam String password, @RequestParam
	// String email
	public String procesar(@Valid Usuario usuario, 
			BindingResult result, 
			Model model, 
			SessionStatus status) {

		model.addAttribute("titulo", "Resutaldo form");
		
		if(result.hasErrors()) {
			/*
			 * Map<String, String> errores = new HashMap();
			 * result.getFieldErrors().forEach(error -> { errores.put(error.getField(),
			 * "El campo " .concat(error.getField()) .concat(" ")
			 * .concat(error.getDefaultMessage())); }); model.addAttribute("error",
			 * errores);
			 */
			
			return "form";
		}

		model.addAttribute("usuario", usuario);
		status.setComplete();
		return "resultado";
	}

}
