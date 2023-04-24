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

import com.rgibert.ta26_ex2.dto.Cientifico;
import com.rgibert.ta26_ex2.service.CientificoServiceImp;

@RestController
@RequestMapping("/api")
public class CientificoController {
	
	@Autowired
	CientificoServiceImp cientificoServiceImp;
	
	@GetMapping("/cientificos")
	public List<Cientifico> listarCientificos() {
		return cientificoServiceImp.listarCientificos();
	}

	@PostMapping("/cientificos")
	public Cientifico salvarCientifico(@RequestBody Cientifico cientifico) {
		return cientificoServiceImp.guardarCientifico(cientifico);
	}

	@GetMapping("/cientificos/{id}")
	public Cientifico cientificoXID(@PathVariable(name = "id") String id) {
		return cientificoServiceImp.cientificoXID(id);
	}

	@PutMapping("/cientificos/{id}")
	public Cientifico actualizarCientifico(@PathVariable(name = "id") String id, @RequestBody Cientifico cientifico) {

		Cientifico cientificoSeleccionado = new Cientifico();
		Cientifico cientificoActualizado = new Cientifico();

		cientificoSeleccionado = cientificoServiceImp.cientificoXID(id);

		cientificoSeleccionado.setId(cientifico.getId());
		cientificoSeleccionado.setNomApels(cientifico.getNomApels());

		cientificoActualizado = cientificoServiceImp.actualizarCientifico(cientificoSeleccionado);

		return cientificoActualizado;
	}

	@DeleteMapping("/cientificos/{id}")
	public void eliminarCientifico(@PathVariable(name = "id") String id) {
		cientificoServiceImp.eliminarCientifico(id);
	}
}
