package com.lemonade.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tipo_seguro database table.
 * 
 */
@Entity
@Table(name="tipo_seguro")
@NamedQuery(name="TipoSeguro.findAll", query="SELECT t FROM TipoSeguroModel t")
public class TipoSeguroModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_tipo_seguro")
	private Integer idTipoSeguro;

	private String descripcion;

	private String nombre;

	@Column(name="porcentaje_asegurado")
	private Integer porcentajeAsegurado;

	//bi-directional many-to-one association to Seguro
	@OneToMany(mappedBy="tipoSeguro")
	private List<SeguroModel> seguros;

	public TipoSeguroModel() {
	}

	public Integer getIdTipoSeguro() {
		return this.idTipoSeguro;
	}

	public void setIdTipoSeguro(Integer idTipoSeguro) {
		this.idTipoSeguro = idTipoSeguro;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPorcentajeAsegurado() {
		return this.porcentajeAsegurado;
	}

	public void setPorcentajeAsegurado(Integer porcentajeAsegurado) {
		this.porcentajeAsegurado = porcentajeAsegurado;
	}

	public List<SeguroModel> getSeguros() {
		return this.seguros;
	}

	public void setSeguros(List<SeguroModel> seguros) {
		this.seguros = seguros;
	}

	public SeguroModel addSeguro(SeguroModel seguro) {
		getSeguros().add(seguro);
		seguro.setTipoSeguro(this);

		return seguro;
	}

	public SeguroModel removeSeguro(SeguroModel seguro) {
		getSeguros().remove(seguro);
		seguro.setTipoSeguro(null);

		return seguro;
	}

}