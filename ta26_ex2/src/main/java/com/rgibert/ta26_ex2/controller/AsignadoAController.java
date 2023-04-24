package com.rgibert.ta26_ex2.controller;

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

import com.rgibert.ta26_ex2.dto.AsignadoA;
import com.rgibert.ta26_ex2.service.AsignadoAServiceImp;

@RestController
@RequestMapping("/api")
public class AsignadoAController {

	@Autowired
	AsignadoAServiceImp asignadoAServiceImp;
	
	@GetMapping("/asignado")
	public List<AsignadoA> listarAsignadoAs() {
		return asignadoAServiceImp.listarAsignadoAs();
	}

	@PostMapping("/asignado")
	public AsignadoA salvarAsignadoA(@RequestBody AsignadoA asignadoA) {
		return asignadoAServiceImp.guardarAsignadoA(asignadoA);
	}

	@GetMapping("/asignado/{id}")
	public AsignadoA asignadoAXID(@PathVariable(name = "id") String id) {
		return asignadoAServiceImp.asignadoAXID(id);
	}

	@PutMapping("/asignado/{id}")
	public AsignadoA actualizarAsignadoA(@PathVariable(name = "id") String id, @RequestBody AsignadoA asignadoA) {

		AsignadoA asignadoASeleccionada = new AsignadoA();
		AsignadoA asignadoAActualizada = new AsignadoA();

		asignadoASeleccionada = asignadoAServiceImp.asignadoAXID(id);

		asignadoASeleccionada.setId(asignadoA.getId());
		asignadoASeleccionada.setProyecto(asignadoA.getProyecto());
		asignadoASeleccionada.setCientifico(asignadoA.getCientifico());

		asignadoAActualizada = asignadoAServiceImp.actualizarAsignadoA(asignadoASeleccionada);

		return asignadoAActualizada;
	}

	@DeleteMapping("/asignado/{id}")
	public void eliminarAsignadoA(@PathVariable(name = "id") String id) {
		asignadoAServiceImp.eliminarAsignadoA(id);
	}
}
