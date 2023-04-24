package com.rgibert.ta26_ex3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rgibert.ta26_ex3.dao.ICajeroDAO;
import com.rgibert.ta26_ex3.dto.Cajero;

@Service
public class CajeroServiceImp implements ICajeroService {

	@Autowired
	ICajeroDAO iCajeroDAO;

	@Override
	public List<Cajero> listarCajeros() {
		return iCajeroDAO.findAll();
	}

	@Override
	public Cajero guardarCajero(Cajero cajero) {
		return iCajeroDAO.save(cajero);
	}

	@Override
	public Cajero cajeroXID(int id) {
		return iCajeroDAO.findById(id).get();
	}

	@Override
	public Cajero actualizarCajero(Cajero cajero) {
		return iCajeroDAO.save(cajero);
	}

	@Override
	public void eliminarCajero(int id) {
		iCajeroDAO.deleteById(id);
	}
}
