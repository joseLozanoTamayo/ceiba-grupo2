package com.lemonade.business;

import java.util.List;

import com.lemonade.model.InmuebleModel;

/**
 * Interface ralacionada con usuario
 * 
 * @author JOSE
 *
 */
public interface IInmuebleBusiness {


	public InmuebleModel crearPropietario(InmuebleModel inmuebleModel);
	
	public InmuebleModel consultarPropietario(InmuebleModel inmuebleModel);
	
	public List<InmuebleModel> listaPropietario();
	
}
