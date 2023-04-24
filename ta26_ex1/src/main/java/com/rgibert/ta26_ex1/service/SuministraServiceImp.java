package com.rgibert.ta26_ex1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rgibert.ta26_ex1.dao.ISuministraDAO;
import com.rgibert.ta26_ex1.dto.Suministra;


@Service
public class SuministraServiceImp implements ISuministraService {

	@Autowired
	ISuministraDAO iSuministraDAO;

	@Override
	public List<Suministra> listarSuministras() {
		return iSuministraDAO.findAll();
	}

	@Override
	public Suministra guardarSuministra(Suministra suministra) {
		return iSuministraDAO.save(suministra);
	}

	@Override
	public Suministra suministraXID(int id) {
		return iSuministraDAO.findById(id).get();
	}

	@Override
	public Suministra actualizarSuministra(Suministra suministra) {
		return iSuministraDAO.save(suministra);
	}

	@Override
	public void eliminarSuministra(int id) {
		iSuministraDAO.deleteById(id);
	}
}
