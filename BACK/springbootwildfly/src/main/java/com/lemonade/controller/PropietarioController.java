package com.lemonade.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.lemonade.business.impl.PropietarioBusiness;
import com.lemonade.model.PropietarioModel;
import com.lemonade.model.UsuarioModel;

@RestController
@RestControllerAdvice
@RequestMapping(value="/propietario")
class PropietarioController {


	/**
	 * 
	 */
	@Autowired
	private PropietarioBusiness propietarioBusiness;
	
	/**
	 * Rest consulta el usuario
	 * @param usuarioModel
	 * @return
	 */
	@RequestMapping(value="/crear", method = RequestMethod.POST)
	public ResponseEntity<PropietarioModel> consultarUsuario(@RequestBody final PropietarioModel propietarioModel) {
		return new ResponseEntity<>(propietarioBusiness.crearPropietario(propietarioModel), HttpStatus.ACCEPTED);
	}
	
}
