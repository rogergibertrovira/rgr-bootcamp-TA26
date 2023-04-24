package com.rgibert.ta26_ex4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rgibert.ta26_ex4.dao.IFacultadDAO;
import com.rgibert.ta26_ex4.dto.Facultad;

@Service
public class FacultadServiceImp implements IFacultadService {

	@Autowired
	IFacultadDAO iFacultadDAO;

	@Override
	public List<Facultad> listarFacultads() {
		return iFacultadDAO.findAll();
	}

	@Override
	public Facultad guardarFacultad(Facultad facultad) {
		return iFacultadDAO.save(facultad);
	}

	@Override
	public Facultad facultadXID(int id) {
		return iFacultadDAO.findById(id).get();
	}

	@Override
	public Facultad actualizarFacultad(Facultad facultad) {
		return iFacultadDAO.save(facultad);
	}

	@Override
	public void eliminarFacultad(int id) {
		iFacultadDAO.deleteById(id);
	}
}
