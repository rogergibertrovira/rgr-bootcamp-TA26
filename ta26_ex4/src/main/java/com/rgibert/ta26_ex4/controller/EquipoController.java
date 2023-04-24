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

import com.rgibert.ta26_ex4.dto.Equipo;
import com.rgibert.ta26_ex4.service.EquipoServiceImp;

@RestController
@RequestMapping("/api")
public class EquipoController {

	@Autowired
	EquipoServiceImp equipoServiceImp;

	
	@GetMapping("/equipos")
	public List<Equipo> listarEquipos() {
		return equipoServiceImp.listarEquipos();
	}

	@PostMapping("/equipos")
	public Equipo salvarEquipo(@RequestBody Equipo equipo) {
		return equipoServiceImp.guardarEquipo(equipo);
	}

	@GetMapping("/equipos/{id}")
	public Equipo equipoXID(@PathVariable(name = "id") String id) {
		return equipoServiceImp.equipoXID(id);
	}

	@PutMapping("/equipos/{id}")
	public Equipo actualizarEquipo(@PathVariable(name = "id") String id, @RequestBody Equipo equipo) {

		Equipo equipoSeleccionado = new Equipo();
		Equipo equipoActualizado = new Equipo();

		equipoSeleccionado = equipoServiceImp.equipoXID(id);

		equipoSeleccionado.setId(equipo.getId());
		equipoSeleccionado.setNombre(equipo.getNombre());
		equipoSeleccionado.setFacultad(equipo.getFacultad());

		equipoActualizado = equipoServiceImp.actualizarEquipo(equipoSeleccionado);

		return equipoActualizado;
	}

	@DeleteMapping("/equipos/{id}")
	public void eliminarEquipo(@PathVariable(name = "id") String id) {
		equipoServiceImp.eliminarEquipo(id);
	}
}
