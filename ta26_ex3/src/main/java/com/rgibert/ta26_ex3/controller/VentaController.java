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

import com.rgibert.ta26_ex3.dto.Venta;
import com.rgibert.ta26_ex3.service.VentaServiceImp;

@RestController
@RequestMapping("/api")
public class VentaController {

	@Autowired
	VentaServiceImp ventaServiceImp;

	
	@GetMapping("/ventas")
	public List<Venta> listarVentas() {
		return ventaServiceImp.listarVentas();
	}

	@PostMapping("/ventas")
	public Venta salvarVenta(@RequestBody Venta venta) {
		return ventaServiceImp.guardarVenta(venta);
	}

	@GetMapping("/ventas/{id}")
	public Venta ventaXID(@PathVariable(name = "id") int id) {
		return ventaServiceImp.ventaXID(id);
	}

	@PutMapping("/ventas/{id}")
	public Venta actualizarVenta(@PathVariable(name = "id") int id, @RequestBody Venta venta) {

		Venta ventaSeleccionado = new Venta();
		Venta ventaActualizado = new Venta();

		ventaSeleccionado = ventaServiceImp.ventaXID(id);

		ventaSeleccionado.setId(venta.getId());
		ventaSeleccionado.setProducto(venta.getProducto());
		ventaSeleccionado.setMaquinaRegistradora(venta.getMaquinaRegistradora());
		ventaSeleccionado.setCajero(venta.getCajero());

		ventaActualizado = ventaServiceImp.actualizarVenta(ventaSeleccionado);

		return ventaActualizado;
	}

	@DeleteMapping("/ventas/{id}")
	public void eliminarVenta(@PathVariable(name = "id") int id) {
		ventaServiceImp.eliminarVenta(id);
	}
}
