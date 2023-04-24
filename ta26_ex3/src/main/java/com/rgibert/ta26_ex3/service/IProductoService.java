package com.rgibert.ta26_ex3.service;

import java.util.List;

import com.rgibert.ta26_ex3.dto.Producto;

public interface IProductoService {

	public List<Producto> listarProductos(); // Listar All

	public Producto guardarProducto(Producto producto); // Guarda un producto CREATE

	public Producto productoXID(int id); // Leer datos de un producto READ

	public Producto actualizarProducto(Producto producto); // Actualiza datos del producto UPDATE

	public void eliminarProducto(int id);// Elimina el producto DELETE
}
