package com.rgibert.ta26_ex1.service;

import java.util.List;

import com.rgibert.ta26_ex1.dto.Proveedor;

public interface IProveedorService {

	public List<Proveedor> listarProveedors(); // Listar All

	public Proveedor guardarProveedor(Proveedor proveedor); // Guarda un proveedor CREATE

	public Proveedor proveedorXID(String id); // Leer datos de un proveedor READ

	public Proveedor actualizarProveedor(Proveedor proveedor); // Actualiza datos del proveedor UPDATE

	public void eliminarProveedor(String id);// Elimina el proveedor DELETE
}
