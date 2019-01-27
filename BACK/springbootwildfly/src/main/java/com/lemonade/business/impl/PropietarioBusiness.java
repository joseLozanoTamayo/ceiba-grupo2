package com.lemonade.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lemonade.business.IPropietarioBusiness;
import com.lemonade.model.PropietarioModel;
import com.lemonade.repository.PropietarioRepository;

/**
 * Clase negocio para usuario
 * @author JOSE
 *
 */
@Repository
public class PropietarioBusiness implements IPropietarioBusiness{

	@Autowired
	private PropietarioRepository repositoryPropietario;

	@Override
	public PropietarioModel crearPropietario(PropietarioModel propietarioModel) {
		return repositoryPropietario.save(propietarioModel);
	}

	@Override
	public PropietarioModel consultarPropietario(PropietarioModel propietarioModel) {
		return repositoryPropietario.findById(propietarioModel.getCedula()).get();
	}

	@Override
	public List<PropietarioModel> listaPropietario() {
		return repositoryPropietario.findAll();
	}

}
