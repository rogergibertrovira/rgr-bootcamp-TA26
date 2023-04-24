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

import com.rgibert.ta26_ex4.dto.Reserva;
import com.rgibert.ta26_ex4.service.ReservaServiceImp;

@RestController
@RequestMapping("/api")
public class ReservaController {

	@Autowired
	ReservaServiceImp reservaServiceImp;

	
	@GetMapping("/reservas")
	public List<Reserva> listarReservas() {
		return reservaServiceImp.listarReservas();
	}

	@PostMapping("/reservas")
	public Reserva salvarReserva(@RequestBody Reserva reserva) {
		return reservaServiceImp.guardarReserva(reserva);
	}

	@GetMapping("/reservas/{id}")
	public Reserva reservaXID(@PathVariable(name = "id") int id) {
		return reservaServiceImp.reservaXID(id);
	}

	@PutMapping("/reservas/{id}")
	public Reserva actualizarReserva(@PathVariable(name = "id") int id, @RequestBody Reserva reserva) {

		Reserva reservaSeleccionado = new Reserva();
		Reserva reservaActualizado = new Reserva();

		reservaSeleccionado = reservaServiceImp.reservaXID(id);

		reservaSeleccionado.setId(reserva.getId());
		reservaSeleccionado.setInvestigador(reserva.getInvestigador());
		reservaSeleccionado.setEquipo(reserva.getEquipo());

		reservaActualizado = reservaServiceImp.actualizarReserva(reservaSeleccionado);

		return reservaActualizado;
	}

	@DeleteMapping("/reservas/{id}")
	public void eliminarReserva(@PathVariable(name = "id") int id) {
		reservaServiceImp.eliminarReserva(id);
	}
}
