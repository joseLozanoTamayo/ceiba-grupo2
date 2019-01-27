package com.lemonade.business;

import java.util.List;

import com.lemonade.model.PropietarioModel;

/**
 * Interface ralacionada con usuario
 * 
 * @author JOSE
 *
 */
public interface IPropietarioBusiness {


	public PropietarioModel crearPropietario(PropietarioModel propietarioModel);
	
	public PropietarioModel consultarPropietario(PropietarioModel propietarioModel);
	
	public List<PropietarioModel> listaPropietario();
	
}
