package com.lemonade.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.lemonade.business.impl.InmuebleBusiness;
import com.lemonade.model.InmuebleModel;
import com.lemonade.model.PropietarioModel;

@RestController
@RestControllerAdvice
@RequestMapping(value="/inmueble")
class InmuebleController {


	/**
	 * 
	 */
	@Autowired
	private InmuebleBusiness inmuebleBusiness;
	
	/**
	 * Rest consulta el usuario
	 * @param usuarioModel
	 * @return
	 */
	@RequestMapping(value="/crear", method = RequestMethod.POST)
	public ResponseEntity<InmuebleModel> consultarUsuario(@RequestBody final InmuebleModel propietarioModel) {
		return new ResponseEntity<>(inmuebleBusiness.crearInmueble(propietarioModel), HttpStatus.ACCEPTED);
	}
	
}
