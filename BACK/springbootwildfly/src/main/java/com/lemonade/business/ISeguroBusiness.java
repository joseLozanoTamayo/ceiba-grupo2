package com.lemonade.business;

import java.util.List;

import com.lemonade.model.SeguroModel;

/**
 * Interface ralacionada con usuario
 * 
 * @author JOSE
 *
 */
public interface ISeguroBusiness {

	public SeguroModel crearSeguro(SeguroModel inmuebleModel);
	
	public SeguroModel consultarSeguro(SeguroModel inmuebleModel);
	
	public List<SeguroModel> listaSeguro();
	
}
