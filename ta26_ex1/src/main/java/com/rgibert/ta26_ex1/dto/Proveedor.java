package com.rgibert.ta26_ex1.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "proveedores")
public class Proveedor {

	// Atributos
	@Id
	private String id;
	@Column(name = "nombre")
	private String nombre;

	@OneToMany
	@JoinColumn(name = "id")
	private List<Suministra> suministra;
	
	// Constructores
	public Proveedor() {

	}

	public Proveedor(String id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	// Getters
	public String getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Suministra")
	public List<Suministra> getSuministra() {
		return suministra;
	}

	// Setters
	public void setId(String id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setSuministra(List<Suministra> suministra) {
		this.suministra = suministra;
	}

	@Override
	public String toString() {
		return "Pieza [id=" + id + ", nombre=" + nombre + "]";
	}
}
