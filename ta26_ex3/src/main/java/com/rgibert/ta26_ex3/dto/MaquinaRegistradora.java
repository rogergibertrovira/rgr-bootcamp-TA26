package com.rgibert.ta26_ex3.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "maquinas_registradoras")
public class MaquinaRegistradora {

	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "piso")
	private int piso;

	@OneToMany
	@JoinColumn(name = "id")
	private List<Venta> venta;

	// Constructores
	public MaquinaRegistradora() {

	}

	public MaquinaRegistradora(int id, int piso) {
		this.id = id;
		this.piso = piso;
	}

	// Getters
	public int getId() {
		return id;
	}

	public int getPiso() {
		return piso;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Venta")
	public List<Venta> getVenta() {
		return venta;
	}

	// Setters
	public void setId(int id) {
		this.id = id;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public void setVenta(List<Venta> venta) {
		this.venta = venta;
	}

	@Override
	public String toString() {
		return "MaquinaRegistradora [id=" + id + ", piso=" + piso + ", venta=" + venta + "]";
	}
}
