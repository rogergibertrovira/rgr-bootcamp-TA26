package com.rgibert.ta26_ex4.service;

import java.util.List;

import com.rgibert.ta26_ex4.dto.Investigador;

public interface IInvestigadorService {

	public List<Investigador> listarInvestigadors(); // Listar All

	public Investigador guardarInvestigador(Investigador investigador); // Guarda un investigador CREATE

	public Investigador investigadorXID(String id); // Leer datos de un investigador READ

	public Investigador actualizarInvestigador(Investigador investigador); // Actualiza datos del investigador UPDATE

	public void eliminarInvestigador(String id);// Elimina el investigador DELETE
}
