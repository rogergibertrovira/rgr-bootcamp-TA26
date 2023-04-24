package com.rgibert.ta26_ex1.service;

import java.util.List;

import com.rgibert.ta26_ex1.dto.Pieza;

public interface IPiezaService {

	public List<Pieza> listarPiezas(); // Listar All

	public Pieza guardarPieza(Pieza pieza); // Guarda un pieza CREATE

	public Pieza piezaXID(int id); // Leer datos de un pieza READ

	public Pieza actualizarPieza(Pieza pieza); // Actualiza datos del pieza UPDATE

	public void eliminarPieza(int id);// Elimina el pieza DELETE
}
