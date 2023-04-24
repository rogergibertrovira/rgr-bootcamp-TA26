package com.rgibert.ta26_ex3.service;

import java.util.List;

import com.rgibert.ta26_ex3.dto.Cajero;

public interface ICajeroService {
	
	public List<Cajero> listarCajeros(); // Listar All

	public Cajero guardarCajero(Cajero cajero); // Guarda un cajero CREATE

	public Cajero cajeroXID(int id); // Leer datos de un cajero READ

	public Cajero actualizarCajero(Cajero cajero); // Actualiza datos del cajero UPDATE

	public void eliminarCajero(int id);// Elimina el cajero DELETE
}
