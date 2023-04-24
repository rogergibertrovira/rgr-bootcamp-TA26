package com.rgibert.ta26_ex1.service;

import java.util.List;

import com.rgibert.ta26_ex1.dto.Suministra;

public interface ISuministraService {

	public List<Suministra> listarSuministras(); // Listar All

	public Suministra guardarSuministra(Suministra suministra); // Guarda un suministra CREATE

	public Suministra suministraXID(int id); // Leer datos de un suministra READ

	public Suministra actualizarSuministra(Suministra suministra); // Actualiza datos del suministra UPDATE

	public void eliminarSuministra(int id);// Elimina el suministra DELETE
}
