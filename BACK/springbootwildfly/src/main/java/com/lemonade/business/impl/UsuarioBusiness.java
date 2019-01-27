package com.lemonade.business.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lemonade.business.IUsuarioBusiness;
import com.lemonade.model.UsuarioModel;
import com.lemonade.repository.UsuarioRepository;

/**
 * Clase negocio para usuario
 * @author JOSE
 *
 */
@Repository
public class UsuarioBusiness implements IUsuarioBusiness{

	@Autowired
	private UsuarioRepository repositoryUsuario;

	/**
	 * crea usuario 
	 */
	@Override
	public UsuarioModel crearUsuario(UsuarioModel usuarioModel) {
		return repositoryUsuario.save(usuarioModel);
	}

	/**
	 * consulta usuario
	 */
	@Override
	public UsuarioModel consultarUsuario(UsuarioModel usuarioModel) {
		Optional<UsuarioModel> response = repositoryUsuario.findByCedulaAndClave(usuarioModel.getCedula(), usuarioModel.getClave());
		
		if ( response.isPresent() ) {
			
		}
		
		return response.get();
	}

}
