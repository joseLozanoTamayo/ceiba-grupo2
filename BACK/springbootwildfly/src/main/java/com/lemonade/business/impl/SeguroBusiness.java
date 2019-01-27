package com.lemonade.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lemonade.business.ISeguroBusiness;
import com.lemonade.model.SeguroModel;
import com.lemonade.repository.SeguroRepository;

/**
 * Clase negocio para inmueble.
 *
 * @author JOSE
 */
@Repository
public class SeguroBusiness implements ISeguroBusiness {

	/** The repository inmueble. */
	@Autowired
	private SeguroRepository repositorySeguro;

	@Override
	public SeguroModel crearSeguro(SeguroModel inmuebleModel) {
		return repositorySeguro.save(inmuebleModel);
	}

	@Override
	public SeguroModel consultarSeguro(SeguroModel inmuebleModel) {
		return repositorySeguro.findById(inmuebleModel.getIdSeguro()).get();
	}

	@Override
	public List<SeguroModel> listaSeguro() {
		return repositorySeguro.findAll();
	}

}
