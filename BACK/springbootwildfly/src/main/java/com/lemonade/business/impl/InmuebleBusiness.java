package com.lemonade.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lemonade.business.IInmuebleBusiness;
import com.lemonade.model.InmuebleModel;
import com.lemonade.repository.InmuebleRepository;

/**
 * Clase negocio para inmueble.
 *
 * @author JOSE
 */
@Repository
public class InmuebleBusiness implements IInmuebleBusiness {

	/** The repository inmueble. */
	@Autowired
	private InmuebleRepository repositoryInmueble;

	/* (non-Javadoc)
	 * @see com.lemonade.business.IInmuebleBusiness#crearPropietario(com.lemonade.model.InmuebleModel)
	 */
	@Override
	public InmuebleModel crearPropietario(InmuebleModel inmuebleModel) {
		return repositoryInmueble.save(inmuebleModel);
	}

	/* (non-Javadoc)
	 * @see com.lemonade.business.IInmuebleBusiness#consultarPropietario(com.lemonade.model.InmuebleModel)
	 */
	@Override
	public InmuebleModel consultarPropietario(InmuebleModel inmuebleModel) {
		return repositoryInmueble.findById(inmuebleModel.getIdInmueble()).get();
	}

	/* (non-Javadoc)
	 * @see com.lemonade.business.IInmuebleBusiness#listaPropietario()
	 */
	@Override
	public List<InmuebleModel> listaPropietario() {
		return repositoryInmueble.findAll();
	}

}
