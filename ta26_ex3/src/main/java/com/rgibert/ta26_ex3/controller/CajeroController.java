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

import com.rgibert.ta26_ex3.dto.Cajero;
import com.rgibert.ta26_ex3.service.CajeroServiceImp;

@RestController
@RequestMapping("/api")
public class CajeroController {

	@Autowired
	CajeroServiceImp cajeroServiceImp;

	@GetMapping("/cajeros")
	public List<Cajero> listarCajeros() {
		return cajeroServiceImp.listarCajeros();
	}

	@PostMapping("/cajeros")
	public Cajero salvarCajero(@RequestBody Cajero cajero) {
		return cajeroServiceImp.guardarCajero(cajero);
	}

	@GetMapping("/cajeros/{id}")
	public Cajero cajeroXID(@PathVariable(name = "id") int id) {
		return cajeroServiceImp.cajeroXID(id);
	}

	@PutMapping("/cajeros/{id}")
	public Cajero actualizarCajero(@PathVariable(name = "id") int id, @RequestBody Cajero cajero) {

		Cajero cajeroSeleccionado = new Cajero();
		Cajero cajeroActualizado = new Cajero();

		cajeroSeleccionado = cajeroServiceImp.cajeroXID(id);

		cajeroSeleccionado.setId(cajero.getId());
		cajeroSeleccionado.setNomApels(cajero.getNomApels());

		cajeroActualizado = cajeroServiceImp.actualizarCajero(cajeroSeleccionado);

		return cajeroActualizado;
	}

	@DeleteMapping("/cajeros/{id}")
	public void eliminarCajero(@PathVariable(name = "id") int id) {
		cajeroServiceImp.eliminarCajero(id);
	}
}
