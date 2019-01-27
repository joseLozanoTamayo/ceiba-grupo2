package com.lemonade.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.lemonade.business.impl.UsuarioBusiness;
import com.lemonade.model.UsuarioModel;

@RestController
@RestControllerAdvice
@RequestMapping(value="/usuario")
class UsuarioController {


	@Autowired
	private UsuarioBusiness usuarioBusiness;

//	@RequestMapping("/hello/{name}")
//	String hello(@PathVariable String name) {
//		
//		// System.out.println("Resultado : " + propietario.findById("1091657995"));
//		
//		Optional<PropietarioModel> resultado = propietario.findById("1091657995");
//		
//		return "Hi " + name + " !" + resultado.get().getCedula();
//
//	}
//	
//	
	
	/**
	 * Rest consulta el usuario
	 * @param usuarioModel
	 * @return
	 */
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public ResponseEntity<UsuarioModel> consultarUsuario(@RequestBody final UsuarioModel usuarioModel) {
		return new ResponseEntity<>(usuarioBusiness.consultarUsuario(usuarioModel), HttpStatus.ACCEPTED);
	}
	
}
