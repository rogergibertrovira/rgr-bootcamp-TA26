package com.rgibert.ta26_ex2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rgibert.ta26_ex2.dao.IProyectoDAO;
import com.rgibert.ta26_ex2.dto.Proyecto;

@Service
public class ProyectoServiceImp implements IProyectoService {

	@Autowired
	IProyectoDAO iProyectoDAO;

	@Override
	public List<Proyecto> listarProyectos() {
		return iProyectoDAO.findAll();
	}

	@Override
	public Proyecto guardarProyecto(Proyecto proyecto) {
		return iProyectoDAO.save(proyecto);
	}

	@Override
	public Proyecto proyectoXID(String id) {
		return iProyectoDAO.findById(id).get();
	}

	@Override
	public Proyecto actualizarProyecto(Proyecto proyecto) {
		return iProyectoDAO.save(proyecto);
	}

	@Override
	public void eliminarProyecto(String id) {
		iProyectoDAO.deleteById(id);
	}

}
