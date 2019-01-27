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


	public InmuebleModel crearInmueble(InmuebleModel inmuebleModel);
	
	public InmuebleModel consultarInmueble(InmuebleModel inmuebleModel);
	
	public List<InmuebleModel> listaInmueble();
	
}
