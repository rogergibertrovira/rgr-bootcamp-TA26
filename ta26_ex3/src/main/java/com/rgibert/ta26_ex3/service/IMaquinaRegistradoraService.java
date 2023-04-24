package com.rgibert.ta26_ex3.service;

import java.util.List;

import com.rgibert.ta26_ex3.dto.MaquinaRegistradora;

public interface IMaquinaRegistradoraService {

	public List<MaquinaRegistradora> listarMaquinaRegistradoras(); // Listar All

	public MaquinaRegistradora guardarMaquinaRegistradora(MaquinaRegistradora maquinaRegistradora); // Guarda un maquinaRegistradora CREATE

	public MaquinaRegistradora maquinaRegistradoraXID(int id); // Leer datos de un maquinaRegistradora READ

	public MaquinaRegistradora actualizarMaquinaRegistradora(MaquinaRegistradora maquinaRegistradora); // Actualiza datos del maquinaRegistradora UPDATE

	public void eliminarMaquinaRegistradora(int id);// Elimina el maquinaRegistradora DELETE
}
