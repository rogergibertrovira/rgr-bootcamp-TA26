package com.rgibert.ta26_ex4.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "investigadores")
public class Investigador {

	// Atributos
	@Id
	private String id;
	@Column(name = "nom_apels")
	private String nomApels;

	@OneToMany
	@JoinColumn(name = "id")
	private List<Reserva> reserva;

	@ManyToOne
	@JoinColumn(name = "facultad_id")
	private Facultad facultad;

	// Constructores
	public Investigador() {

	}

	public Investigador(String id, String nomApels) {
		this.id = id;
		this.nomApels = nomApels;
	}

	// Getters
	public String getId() {
		return id;
	}

	public String getNomApels() {
		return nomApels;
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
	public void setId(String id) {
		this.id = id;
	}

	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
	}

	public void setReserva(List<Reserva> reserva) {
		this.reserva = reserva;
	}

	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}

	@Override
	public String toString() {
		return "Investigador [id=" + id + ", nomApels=" + nomApels + ", reserva=" + reserva + ", facultad=" + facultad
				+ "]";
	}
	
}
