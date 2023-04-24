package com.rgibert.ta26_ex4.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "equipos")
public class Equipo {

	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "nombre")
	private String nombre;

	@OneToMany
	@JoinColumn(name = "id")
	private List<Reserva> reserva;

	@ManyToOne
	@JoinColumn(name = "facultad_id")
	private Facultad facultad;

	// Constructores
	public Equipo() {

	}

	public Equipo(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	// Getters
	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}


	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Reserva")
	public List<Reserva> getReserva() {
		return reserva;
	}

	public Facultad getFacultad() {
		return facultad;
	}

	// Setters
	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setReserva(List<Reserva> reserva) {
		this.reserva = reserva;
	}

	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}

	@Override
	public String toString() {
		return "Equipo [id=" + id + ", nombre=" + nombre + ", reserva=" + reserva + ", facultad=" + facultad + "]";
	}

}
