package com.lemonade.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.lemonade.business.impl.SeguroBusiness;
import com.lemonade.model.SeguroModel;

@RestController
@RestControllerAdvice
@RequestMapping(value="/seguro")
class SeguroController {


	/**
	 * 
	 */
	@Autowired
	private SeguroBusiness seguroBusiness;
	
	/**
	 * Rest consulta el usuario
	 * @param usuarioModel
	 * @return
	 */
	@RequestMapping(value="/crear", method = RequestMethod.POST)
	public ResponseEntity<SeguroModel> consultarUsuario(@RequestBody final SeguroModel seguroModel) {
		return new ResponseEntity<>(seguroBusiness.crearSeguro(seguroModel), HttpStatus.ACCEPTED);
	}
	
}
