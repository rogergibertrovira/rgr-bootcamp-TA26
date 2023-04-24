package com.rgibert.ta26_ex3.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "venta")
public class Venta {

	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	@JoinColumn(name = "producto_id")
	private Producto producto;

	@ManyToOne
	@JoinColumn(name = "maquina_id")
	private MaquinaRegistradora maquinaRegistradora;

	@ManyToOne
	@JoinColumn(name = "cajero_id")
	private Cajero cajero;

	// Constructores
	public Venta() {

	}

	public Venta(int id, Producto producto, MaquinaRegistradora maquinaRegistradora, Cajero cajero) {
		this.id = id;
		this.producto = producto;
		this.maquinaRegistradora = maquinaRegistradora;
		this.cajero = cajero;
	}

	// Getters
	public int getId() {
		return id;
	}

	public Producto getProducto() {
		return producto;
	}

	public MaquinaRegistradora getMaquinaRegistradora() {
		return maquinaRegistradora;
	}

	public Cajero getCajero() {
		return cajero;
	}

	// Setters
	public void setId(int id) {
		this.id = id;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public void setMaquinaRegistradora(MaquinaRegistradora maquinaRegistradora) {
		this.maquinaRegistradora = maquinaRegistradora;
	}

	public void setCajero(Cajero cajero) {
		this.cajero = cajero;
	}

	@Override
	public String toString() {
		return "Venta [id=" + id + ", producto=" + producto + ", maquinaRegistradora=" + maquinaRegistradora
				+ ", cajero=" + cajero + "]";
	}

}
