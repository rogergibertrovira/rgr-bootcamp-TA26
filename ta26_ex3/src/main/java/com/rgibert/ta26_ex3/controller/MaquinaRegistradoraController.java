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

import com.rgibert.ta26_ex3.dto.MaquinaRegistradora;
import com.rgibert.ta26_ex3.service.MaquinaRegistradoraServiceImp;

@RestController
@RequestMapping("/api")
public class MaquinaRegistradoraController {

	@Autowired
	MaquinaRegistradoraServiceImp maquinaRegistradoraServiceImp;

	
	@GetMapping("/maquinaRegistradoras")
	public List<MaquinaRegistradora> listarMaquinaRegistradoras() {
		return maquinaRegistradoraServiceImp.listarMaquinaRegistradoras();
	}

	@PostMapping("/maquinaRegistradoras")
	public MaquinaRegistradora salvarMaquinaRegistradora(@RequestBody MaquinaRegistradora maquinaRegistradora) {
		return maquinaRegistradoraServiceImp.guardarMaquinaRegistradora(maquinaRegistradora);
	}

	@GetMapping("/maquinaRegistradoras/{id}")
	public MaquinaRegistradora maquinaRegistradoraXID(@PathVariable(name = "id") int id) {
		return maquinaRegistradoraServiceImp.maquinaRegistradoraXID(id);
	}

	@PutMapping("/maquinaRegistradoras/{id}")
	public MaquinaRegistradora actualizarMaquinaRegistradora(@PathVariable(name = "id") int id, @RequestBody MaquinaRegistradora maquinaRegistradora) {

		MaquinaRegistradora maquinaRegistradoraSeleccionado = new MaquinaRegistradora();
		MaquinaRegistradora maquinaRegistradoraActualizado = new MaquinaRegistradora();

		maquinaRegistradoraSeleccionado = maquinaRegistradoraServiceImp.maquinaRegistradoraXID(id);

		maquinaRegistradoraSeleccionado.setId(maquinaRegistradora.getId());
		maquinaRegistradoraSeleccionado.setPiso(maquinaRegistradora.getPiso());		

		maquinaRegistradoraActualizado = maquinaRegistradoraServiceImp.actualizarMaquinaRegistradora(maquinaRegistradoraSeleccionado);

		return maquinaRegistradoraActualizado;
	}

	@DeleteMapping("/maquinaRegistradoras/{id}")
	public void eliminarMaquinaRegistradora(@PathVariable(name = "id") int id) {
		maquinaRegistradoraServiceImp.eliminarMaquinaRegistradora(id);
	}
}
