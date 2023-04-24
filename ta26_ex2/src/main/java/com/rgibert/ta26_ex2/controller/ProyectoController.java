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

import com.rgibert.ta26_ex2.dto.Proyecto;
import com.rgibert.ta26_ex2.service.ProyectoServiceImp;

@RestController
@RequestMapping("/api")
public class ProyectoController {
	
	@Autowired
	ProyectoServiceImp proyectoServiceImp;
	
	@GetMapping("/proyectos")
	public List<Proyecto> listarProyectos() {
		return proyectoServiceImp.listarProyectos();
	}

	@PostMapping("/proyectos")
	public Proyecto salvarProyecto(@RequestBody Proyecto proyecto) {
		return proyectoServiceImp.guardarProyecto(proyecto);
	}

	@GetMapping("/proyectos/{id}")
	public Proyecto proyectoXID(@PathVariable(name = "id") String id) {
		return proyectoServiceImp.proyectoXID(id);
	}

	@PutMapping("/proyectos/{id}")
	public Proyecto actualizarProyecto(@PathVariable(name = "id") String id, @RequestBody Proyecto proyecto) {

		Proyecto proyectoSeleccionada = new Proyecto();
		Proyecto proyectoActualizada = new Proyecto();

		proyectoSeleccionada = proyectoServiceImp.proyectoXID(id);

		proyectoSeleccionada.setId(proyecto.getId());
		proyectoSeleccionada.setNombre(proyecto.getNombre());
		proyectoSeleccionada.setHoras(proyecto.getHoras());

		proyectoActualizada = proyectoServiceImp.actualizarProyecto(proyectoSeleccionada);

		return proyectoActualizada;
	}

	@DeleteMapping("/proyectos/{id}")
	public void eliminarProyecto(@PathVariable(name = "id") String id) {
		proyectoServiceImp.eliminarProyecto(id);
	}

}
