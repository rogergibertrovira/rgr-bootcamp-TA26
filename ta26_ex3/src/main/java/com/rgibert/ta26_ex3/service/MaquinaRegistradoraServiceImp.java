package com.rgibert.ta26_ex3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rgibert.ta26_ex3.dao.IMaquinaRegistradoraDAO;
import com.rgibert.ta26_ex3.dto.MaquinaRegistradora;

@Service
public class MaquinaRegistradoraServiceImp implements IMaquinaRegistradoraService {

	@Autowired
	IMaquinaRegistradoraDAO iMaquinaRegistradoraDAO;

	@Override
	public List<MaquinaRegistradora> listarMaquinaRegistradoras() {
		return iMaquinaRegistradoraDAO.findAll();
	}

	@Override
	public MaquinaRegistradora guardarMaquinaRegistradora(MaquinaRegistradora maquinaRegistradora) {
		return iMaquinaRegistradoraDAO.save(maquinaRegistradora);
	}

	@Override
	public MaquinaRegistradora maquinaRegistradoraXID(int id) {
		return iMaquinaRegistradoraDAO.findById(id).get();
	}

	@Override
	public MaquinaRegistradora actualizarMaquinaRegistradora(MaquinaRegistradora maquinaRegistradora) {
		return iMaquinaRegistradoraDAO.save(maquinaRegistradora);
	}

	@Override
	public void eliminarMaquinaRegistradora(int id) {
		iMaquinaRegistradoraDAO.deleteById(id);
	}
}
