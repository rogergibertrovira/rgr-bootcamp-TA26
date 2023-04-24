package com.rgibert.ta26_ex2.service;

import java.util.List;

import com.rgibert.ta26_ex2.dto.Cientifico;

public interface ICientificoService {
	
	public List<Cientifico> listarCientificos(); // Listar All

	public Cientifico guardarCientifico(Cientifico cientifico); // Guarda un cientifico CREATE

	public Cientifico cientificoXID(String id); // Leer datos de un cientifico READ

	public Cientifico actualizarCientifico(Cientifico cientifico); // Actualiza datos del cientifico UPDATE

	public void eliminarCientifico(String id);// Elimina el cientifico DELETE
	
}
