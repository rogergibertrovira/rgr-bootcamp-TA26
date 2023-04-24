package com.rgibert.ta26_ex4.service;

import java.util.List;

import com.rgibert.ta26_ex4.dto.Facultad;

public interface IFacultadService {

	public List<Facultad> listarFacultads(); // Listar All

	public Facultad guardarFacultad(Facultad facultad); // Guarda un facultad CREATE

	public Facultad facultadXID(int id); // Leer datos de un facultad READ

	public Facultad actualizarFacultad(Facultad facultad); // Actualiza datos del facultad UPDATE

	public void eliminarFacultad(int id);// Elimina el facultad DELETE
}
