package com.rgibert.ta26_ex3.service;

import java.util.List;

import com.rgibert.ta26_ex3.dto.Venta;

public interface IVentaService {
	
	public List<Venta> listarVentas(); // Listar All

	public Venta guardarVenta(Venta venta); // Guarda un venta CREATE

	public Venta ventaXID(int id); // Leer datos de un venta READ

	public Venta actualizarVenta(Venta venta); // Actualiza datos del venta UPDATE

	public void eliminarVenta(int id);// Elimina el venta DELETE

}
