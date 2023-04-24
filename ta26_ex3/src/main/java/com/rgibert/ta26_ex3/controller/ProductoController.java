package com.rgibert.ta26_ex3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rgibert.ta26_ex3.dto.Producto;
import com.rgibert.ta26_ex3.service.ProductoServiceImp;

@RestController
@RequestMapping("/api")
public class ProductoController {
	
	@Autowired
	ProductoServiceImp productoServiceImp;

	
	@GetMapping("/productos")
	public List<Producto> listarProductos() {
		return productoServiceImp.listarProductos();
	}

	@PostMapping("/productos")
	public Producto salvarProducto(@RequestBody Producto producto) {
		return productoServiceImp.guardarProducto(producto);
	}

	@GetMapping("/productos/{id}")
	public Producto productoXID(@PathVariable(name = "id") int id) {
		return productoServiceImp.productoXID(id);
	}

	@PutMapping("/productos/{id}")
	public Producto actualizarProducto(@PathVariable(name = "id") int id, @RequestBody Producto producto) {

		Producto productoSeleccionado = new Producto();
		Producto productoActualizado = new Producto();

		productoSeleccionado = productoServiceImp.productoXID(id);

		productoSeleccionado.setId(producto.getId());
		productoSeleccionado.setNombre(producto.getNombre());
		productoSeleccionado.setPrecio(producto.getPrecio());

		productoActualizado = productoServiceImp.actualizarProducto(productoSeleccionado);

		return productoActualizado;
	}

	@DeleteMapping("/productos/{id}")
	public void eliminarProducto(@PathVariable(name = "id") int id) {
		productoServiceImp.eliminarProducto(id);
	}
}
