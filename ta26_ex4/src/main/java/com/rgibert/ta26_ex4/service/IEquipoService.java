package com.rgibert.ta26_ex4.service;

import java.util.List;

import com.rgibert.ta26_ex4.dto.Equipo;

public interface IEquipoService {

	public List<Equipo> listarEquipos(); // Listar All

	public Equipo guardarEquipo(Equipo equipo); // Guarda un equipo CREATE

	public Equipo equipoXID(String id); // Leer datos de un equipo READ

	public Equipo actualizarEquipo(Equipo equipo); // Actualiza datos del equipo UPDATE

	public void eliminarEquipo(String id);// Elimina el equipo DELETE
}
