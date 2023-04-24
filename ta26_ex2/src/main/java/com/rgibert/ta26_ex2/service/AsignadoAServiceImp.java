package com.rgibert.ta26_ex2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rgibert.ta26_ex2.dao.IAsignadoADAO;
import com.rgibert.ta26_ex2.dto.AsignadoA;

@Service
public class AsignadoAServiceImp implements IAsignadoAService {

	@Autowired
	IAsignadoADAO iAsignadoADAO;

	@Override
	public List<AsignadoA> listarAsignadoAs() {
		return iAsignadoADAO.findAll();
	}

	@Override
	public AsignadoA guardarAsignadoA(AsignadoA asignadoA) {
		return iAsignadoADAO.save(asignadoA);
	}

	@Override
	public AsignadoA asignadoAXID(String id) {
		return iAsignadoADAO.findById(id).get();
	}

	@Override
	public AsignadoA actualizarAsignadoA(AsignadoA asignadoA) {
		return iAsignadoADAO.save(asignadoA);
	}

	@Override
	public void eliminarAsignadoA(String id) {
		iAsignadoADAO.deleteById(id);
	}

}
