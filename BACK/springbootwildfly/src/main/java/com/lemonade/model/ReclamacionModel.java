package com.lemonade.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the reclamacion database table.
 * 
 */
@Entity
@Table(name = "reclamacion")
@NamedQuery(name="Reclamacion.findAll", query="SELECT r FROM ReclamacionModel r")
public class ReclamacionModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_reclamacion")
	private Integer idReclamacion;

	private String descripcion;

	private String estado;

	@Column(name="fecha_creacion")
	private Timestamp fechaCreacion;

	//bi-directional many-to-one association to Seguro
	@ManyToOne
	@JoinColumn(name="seguro")
	private SeguroModel seguroBean;

	public ReclamacionModel() {
	}

	public Integer getIdReclamacion() {
		return this.idReclamacion;
	}

	public void setIdReclamacion(Integer idReclamacion) {
		this.idReclamacion = idReclamacion;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Timestamp getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Timestamp fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public SeguroModel getSeguroBean() {
		return this.seguroBean;
	}

	public void setSeguroBean(SeguroModel seguroBean) {
		this.seguroBean = seguroBean;
	}

}