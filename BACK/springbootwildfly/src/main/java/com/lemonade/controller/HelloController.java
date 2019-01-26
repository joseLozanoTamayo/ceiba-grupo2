package com.lemonade.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lemonade.model.PropietarioModel;
import com.lemonade.repository.PropietarioRepository;

@RestController
class HelloController {


	@Autowired
	private PropietarioRepository propietario;

	@RequestMapping("/hello/{name}")
	String hello(@PathVariable String name) {
		
		// System.out.println("Resultado : " + propietario.findById("1091657995"));
		
		Optional<PropietarioModel> resultado = propietario.findById("1091657995");
		
		return "Hi " + name + " !" + resultado.get().getCedula();

	}
}
