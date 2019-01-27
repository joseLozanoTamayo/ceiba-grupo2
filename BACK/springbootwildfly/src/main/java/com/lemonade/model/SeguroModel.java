package com.lemonade.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the seguro database table.
 * 
 */
@Entity
@Table(name = "seguro")
@NamedQuery(name="Seguro.findAll", query="SELECT s FROM SeguroModel s")
public class SeguroModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_seguro")
	private Integer idSeguro;

	@Column(name="fecha_creacion")
	private Timestamp fechaCreacion;

	//bi-directional many-to-one association to Reclamacion
	@OneToMany(mappedBy="seguroBean")
	private List<ReclamacionModel> reclamacions;

	//bi-directional many-to-one association to Inmueble
	@ManyToOne
	@JoinColumn(name="inmueble")
	private InmuebleModel inmuebleBean;

	//bi-directional many-to-one association to TipoSeguro
	@ManyToOne
	@JoinColumn(name="tipo")
	private TipoSeguroModel tipoSeguro;

	public SeguroModel() {
	}

	public Integer getIdSeguro() {
		return this.idSeguro;
	}

	public void setIdSeguro(Integer idSeguro) {
		this.idSeguro = idSeguro;
	}

	public Timestamp getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Timestamp fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public List<ReclamacionModel> getReclamacions() {
		return this.reclamacions;
	}

	public void setReclamacions(List<ReclamacionModel> reclamacions) {
		this.reclamacions = reclamacions;
	}

	public ReclamacionModel addReclamacion(ReclamacionModel reclamacion) {
		getReclamacions().add(reclamacion);
		reclamacion.setSeguroBean(this);

		return reclamacion;
	}

	public ReclamacionModel removeReclamacion(ReclamacionModel reclamacion) {
		getReclamacions().remove(reclamacion);
		reclamacion.setSeguroBean(null);

		return reclamacion;
	}

	public InmuebleModel getInmuebleBean() {
		return this.inmuebleBean;
	}

	public void setInmuebleBean(InmuebleModel inmuebleBean) {
		this.inmuebleBean = inmuebleBean;
	}

	public TipoSeguroModel getTipoSeguro() {
		return this.tipoSeguro;
	}

	public void setTipoSeguro(TipoSeguroModel tipoSeguro) {
		this.tipoSeguro = tipoSeguro;
	}

}