package com.rgibert.ta26_ex4.controller;

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

import com.rgibert.ta26_ex4.dto.Facultad;
import com.rgibert.ta26_ex4.service.FacultadServiceImp;

@RestController
@RequestMapping("/api")
public class FacultadController {

	@Autowired
	FacultadServiceImp facultadServiceImp;

	
	@GetMapping("/facultads")
	public List<Facultad> listarFacultads() {
		return facultadServiceImp.listarFacultads();
	}

	@PostMapping("/facultads")
	public Facultad salvarFacultad(@RequestBody Facultad facultad) {
		return facultadServiceImp.guardarFacultad(facultad);
	}

	@GetMapping("/facultads/{id}")
	public Facultad facultadXID(@PathVariable(name = "id") int id) {
		return facultadServiceImp.facultadXID(id);
	}

	@PutMapping("/facultads/{id}")
	public Facultad actualizarFacultad(@PathVariable(name = "id") int id, @RequestBody Facultad facultad) {

		Facultad facultadSeleccionado = new Facultad();
		Facultad facultadActualizado = new Facultad();

		facultadSeleccionado = facultadServiceImp.facultadXID(id);

		facultadSeleccionado.setId(facultad.getId());
		facultadSeleccionado.setNombre(facultad.getNombre());

		facultadActualizado = facultadServiceImp.actualizarFacultad(facultadSeleccionado);

		return facultadActualizado;
	}

	@DeleteMapping("/facultads/{id}")
	public void eliminarFacultad(@PathVariable(name = "id") int id) {
		facultadServiceImp.eliminarFacultad(id);
	}
}
