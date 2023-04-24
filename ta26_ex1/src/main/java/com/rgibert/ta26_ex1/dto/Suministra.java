package com.rgibert.ta26_ex1.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "suministra")
public class Suministra {

	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "precio")
	private int precio;

	@ManyToOne
	@JoinColumn(name = "pieza_id")
	private Pieza pieza;

	@ManyToOne
	@JoinColumn(name = "proveedor_id")
	private Proveedor proveedor;

	// Constructores
	public Suministra() {

	}

	public Suministra(int id, Pieza pieza, Proveedor proveedor, int precio) {
		this.id = id;
		this.pieza = pieza;
		this.proveedor = proveedor;
		this.precio = precio;
	}

	// Getters
	public int getId() {
		return id;
	}
	
	public int getPrecio() {
		return precio;
	}

	public Pieza getPieza() {
		return pieza;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	// Setters
	public void setId(int id) {
		this.id = id;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public void setPieza(Pieza pieza) {
		this.pieza = pieza;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	@Override
	public String toString() {
		return "Suministra [id=" + id + ", pieza=" + pieza + ", proveedor=" + proveedor + "]";
	}

}
