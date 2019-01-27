package com.lemonade.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the propietario database table.
 * 
 */
@Entity
@Table(name = "propietario")
@NamedQuery(name="Propietario.findAll", query="SELECT p FROM PropietarioModel p")
public class PropietarioModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String cedula;

	private String indicativo;

	private String nombre;

	private String sexo;

	private String telefono;

	public PropietarioModel() {
	}

	public String getCedula() {
		return this.cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getIndicativo() {
		return this.indicativo;
	}

	public void setIndicativo(String indicativo) {
		this.indicativo = indicativo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}