package com.lemonade.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tipo_inmueble database table.
 * 
 */
@Entity
@Table(name="tipo_inmueble")
@NamedQuery(name="TipoInmueble.findAll", query="SELECT t FROM TipoInmuebleModel t")
public class TipoInmuebleModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_tipo_inmueble")
	private Integer idTipoInmueble;

	private String nombre;

	//bi-directional many-to-one association to Inmueble
	@OneToMany(mappedBy="tipoInmueble")
	private List<InmuebleModel> inmuebles;

	public TipoInmuebleModel() {
	}

	public Integer getIdTipoInmueble() {
		return this.idTipoInmueble;
	}

	public void setIdTipoInmueble(Integer idTipoInmueble) {
		this.idTipoInmueble = idTipoInmueble;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<InmuebleModel> getInmuebles() {
		return this.inmuebles;
	}

	public void setInmuebles(List<InmuebleModel> inmuebles) {
		this.inmuebles = inmuebles;
	}

	public InmuebleModel addInmueble(InmuebleModel inmueble) {
		getInmuebles().add(inmueble);
		inmueble.setTipoInmueble(this);

		return inmueble;
	}

	public InmuebleModel removeInmueble(InmuebleModel inmueble) {
		getInmuebles().remove(inmueble);
		inmueble.setTipoInmueble(null);

		return inmueble;
	}

}