package com.lemonade.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the inmueble database table.
 * 
 */
@Entity
@Table(name = "inmueble")
@NamedQuery(name="Inmueble.findAll", query="SELECT i FROM InmuebleModel i")
public class InmuebleModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_inmueble")
	private Integer idInmueble;

	private String direccion;

	private String estrato;

	private String metraje;

	private String propietario;

	private Long valor;

	//bi-directional many-to-one association to TipoInmueble
	@ManyToOne
	@JoinColumn(name="tipo")
	private TipoInmuebleModel tipoInmueble;

	//bi-directional many-to-one association to Seguro
	@OneToMany(mappedBy="inmuebleBean")
	private List<SeguroModel> seguros;

	public InmuebleModel() {
	}

	public Integer getIdInmueble() {
		return this.idInmueble;
	}

	public void setIdInmueble(Integer idInmueble) {
		this.idInmueble = idInmueble;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstrato() {
		return this.estrato;
	}

	public void setEstrato(String estrato) {
		this.estrato = estrato;
	}

	public String getMetraje() {
		return this.metraje;
	}

	public void setMetraje(String metraje) {
		this.metraje = metraje;
	}

	public String getPropietario() {
		return this.propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public Long getValor() {
		return this.valor;
	}

	public void setValor(Long valor) {
		this.valor = valor;
	}

	public TipoInmuebleModel getTipoInmueble() {
		return this.tipoInmueble;
	}

	public void setTipoInmueble(TipoInmuebleModel tipoInmueble) {
		this.tipoInmueble = tipoInmueble;
	}

	public List<SeguroModel> getSeguros() {
		return this.seguros;
	}

	public void setSeguros(List<SeguroModel> seguros) {
		this.seguros = seguros;
	}

	public SeguroModel addSeguro(SeguroModel seguro) {
		getSeguros().add(seguro);
		seguro.setInmuebleBean(this);

		return seguro;
	}

	public SeguroModel removeSeguro(SeguroModel seguro) {
		getSeguros().remove(seguro);
		seguro.setInmuebleBean(null);

		return seguro;
	}

}