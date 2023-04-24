package com.rgibert.ta26_ex2.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "asignado")
public class AsignadoA {

	// Atributos
	@Id
	private String id;

	@ManyToOne
	@JoinColumn(name = "proyecto_id")
	private Proyecto proyecto;

	@ManyToOne
	@JoinColumn(name = "cientifico_id")
	private Cientifico cientifico;

	// Constructores
	public AsignadoA() {

	}

	public AsignadoA(String id, Proyecto proyecto, Cientifico cientifico) {
		this.id = id;
		this.proyecto = proyecto;
		this.cientifico = cientifico;
	}

	// Getters
	public String getId() {
		return id;
	}

	public Proyecto getProyecto() {
		return proyecto;
	}

	public Cientifico getCientifico() {
		return cientifico;
	}

	// Setters
	public void setId(String id) {
		this.id = id;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

	public void setCientifico(Cientifico cientifico) {
		this.cientifico = cientifico;
	}

	@Override
	public String toString() {
		return "AsignadoA [id=" + id + ", proyecto=" + proyecto + ", cientifico=" + cientifico + "]";
	}

}
