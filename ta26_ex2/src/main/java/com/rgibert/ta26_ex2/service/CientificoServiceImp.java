package com.rgibert.ta26_ex2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rgibert.ta26_ex2.dao.ICientificoDAO;
import com.rgibert.ta26_ex2.dto.Cientifico;

@Service
public class CientificoServiceImp implements ICientificoService {

	@Autowired
	ICientificoDAO iCientificoDAO;

	@Override
	public List<Cientifico> listarCientificos() {
		return iCientificoDAO.findAll();
	}

	@Override
	public Cientifico guardarCientifico(Cientifico cientifico) {
		return iCientificoDAO.save(cientifico);
	}

	@Override
	public Cientifico cientificoXID(String id) {
		return iCientificoDAO.findById(id).get();
	}

	@Override
	public Cientifico actualizarCientifico(Cientifico cientifico) {
		return iCientificoDAO.save(cientifico);
	}

	@Override
	public void eliminarCientifico(String id) {
		iCientificoDAO.deleteById(id);
	}

}
