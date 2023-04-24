package com.rgibert.ta26_ex4.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "reserva")
public class Reserva {

	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	@JoinColumn(name = "investigador_id")
	private Investigador investigador;

	@ManyToOne
	@JoinColumn(name = "equipo_id")
	private Equipo equipo;

	// Constructores
	public Reserva() {

	}

	public Reserva(int id, Investigador investigador, Equipo equipo) {
		this.id = id;
		this.investigador = investigador;
		this.equipo = equipo;
	}

	// Getters
	public int getId() {
		return id;
	}

	public Investigador getInvestigador() {
		return investigador;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	// Setters
	public void setId(int id) {
		this.id = id;
	}

	public void setInvestigador(Investigador investigador) {
		this.investigador = investigador;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	@Override
	public String toString() {
		return "Reserva [id=" + id + ", investigador=" + investigador + ", equipo=" + equipo + "]";
	}

}
