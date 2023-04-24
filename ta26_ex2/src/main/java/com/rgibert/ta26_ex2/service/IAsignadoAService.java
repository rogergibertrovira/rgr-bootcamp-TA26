package com.rgibert.ta26_ex2.service;

import java.util.List;

import com.rgibert.ta26_ex2.dto.AsignadoA;

public interface IAsignadoAService {

	public List<AsignadoA> listarAsignadoAs(); // Listar All

	public AsignadoA guardarAsignadoA(AsignadoA asignadoA); // Guarda un asignadoA CREATE

	public AsignadoA asignadoAXID(String id); // Leer datos de un asignadoA READ

	public AsignadoA actualizarAsignadoA(AsignadoA asignadoA); // Actualiza datos del asignadoA UPDATE

	public void eliminarAsignadoA(String id);// Elimina el asignadoA DELETE
}
