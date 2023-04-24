package com.rgibert.ta26_ex4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rgibert.ta26_ex4.dao.IEquipoDAO;
import com.rgibert.ta26_ex4.dto.Equipo;

@Service
public class EquipoServiceImp implements IEquipoService {

	@Autowired
	IEquipoDAO iEquipoDAO;

	@Override
	public List<Equipo> listarEquipos() {
		return iEquipoDAO.findAll();
	}

	@Override
	public Equipo guardarEquipo(Equipo equipo) {
		return iEquipoDAO.save(equipo);
	}

	@Override
	public Equipo equipoXID(String id) {
		return iEquipoDAO.findById(id).get();
	}

	@Override
	public Equipo actualizarEquipo(Equipo equipo) {
		return iEquipoDAO.save(equipo);
	}

	@Override
	public void eliminarEquipo(String id) {
		iEquipoDAO.deleteById(id);
	}

}
