package com.lemonade.business;

import com.lemonade.model.UsuarioModel;

/**
 * Interface ralacionada con usuario
 * 
 * @author JOSE
 *
 */
public interface IUsuarioBusiness {


	public UsuarioModel crearUsuario(UsuarioModel usuarioModel);
	
	public UsuarioModel consultarUsuario(UsuarioModel usuarioModel);
	
}
