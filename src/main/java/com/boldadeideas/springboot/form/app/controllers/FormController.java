package com.boldadeideas.springboot.form.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.boldadeideas.springboot.form.app.models.domain.Usuario;

@Controller
public class FormController {

	@GetMapping("/form")
	public String form(Model model) {

		model.addAttribute("titulo", "Formulario Usuarios");
		return "form";
	}

	@PostMapping("/form")
	// You can use @RequestParam to get an attribute from the form with the name
	// @RequestParam String username, @RequestParam String password, @RequestParam
	// String email
	public String procesar(Usuario usuario, Model model) {

		model.addAttribute("titulo", "Resutaldo form");
		model.addAttribute("usuario", usuario);

		return "resultado";
	}

}
