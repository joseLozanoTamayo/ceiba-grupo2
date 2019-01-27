package com.lemonade.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lemonade.model.UsuarioModel;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, String>{
	
	/**
	 * consulta por cedula y clave
	 * 
	 * @param cedula
	 * @param clave
	 * @return
	 */
	public Optional<UsuarioModel> findByCedulaAndClave(String cedula, String clave);

}
