package com.rgibert.ta26_ex4.service;

import java.util.List;

import com.rgibert.ta26_ex4.dto.Reserva;

public interface IReservaService {

	public List<Reserva> listarReservas(); // Listar All

	public Reserva guardarReserva(Reserva reserva); // Guarda un reserva CREATE

	public Reserva reservaXID(int id); // Leer datos de un reserva READ

	public Reserva actualizarReserva(Reserva reserva); // Actualiza datos del reserva UPDATE

	public void eliminarReserva(int id);// Elimina el reserva DELETE
}
