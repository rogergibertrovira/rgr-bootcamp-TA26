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

import com.rgibert.ta26_ex4.dto.Investigador;
import com.rgibert.ta26_ex4.service.InvestigadorServiceImp;

@RestController
@RequestMapping("/api")
public class InvestigadorController {

	@Autowired
	InvestigadorServiceImp investigadorServiceImp;
	
	
	@GetMapping("/investigadors")
	public List<Investigador> listarInvestigadors() {
		return investigadorServiceImp.listarInvestigadors();
	}

	@PostMapping("/investigadors")
	public Investigador salvarInvestigador(@RequestBody Investigador investigador) {
		return investigadorServiceImp.guardarInvestigador(investigador);
	}

	@GetMapping("/investigadors/{id}")
	public Investigador investigadorXID(@PathVariable(name = "id") String id) {
		return investigadorServiceImp.investigadorXID(id);
	}

	@PutMapping("/investigadors/{id}")
	public Investigador actualizarInvestigador(@PathVariable(name = "id") String id, @RequestBody Investigador investigador) {

		Investigador investigadorSeleccionado = new Investigador();
		Investigador investigadorActualizado = new Investigador();

		investigadorSeleccionado = investigadorServiceImp.investigadorXID(id);

		investigadorSeleccionado.setId(investigador.getId());
		investigadorSeleccionado.setNomApels(investigador.getNomApels());
		investigadorSeleccionado.setFacultad(investigador.getFacultad());

		investigadorActualizado = investigadorServiceImp.actualizarInvestigador(investigadorSeleccionado);

		return investigadorActualizado;
	}

	@DeleteMapping("/investigadors/{id}")
	public void eliminarInvestigador(@PathVariable(name = "id") String id) {
		investigadorServiceImp.eliminarInvestigador(id);
	}
}
