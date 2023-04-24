package com.rgibert.ta26_ex4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rgibert.ta26_ex4.dao.IInvestigadorDAO;
import com.rgibert.ta26_ex4.dto.Investigador;

@Service
public class InvestigadorServiceImp implements IInvestigadorService {

	@Autowired
	IInvestigadorDAO iInvestigadorDAO;

	@Override
	public List<Investigador> listarInvestigadors() {
		return iInvestigadorDAO.findAll();
	}

	@Override
	public Investigador guardarInvestigador(Investigador investigador) {
		return iInvestigadorDAO.save(investigador);
	}

	@Override
	public Investigador investigadorXID(String id) {
		return iInvestigadorDAO.findById(id).get();
	}

	@Override
	public Investigador actualizarInvestigador(Investigador investigador) {
		return iInvestigadorDAO.save(investigador);
	}

	@Override
	public void eliminarInvestigador(String id) {
		iInvestigadorDAO.deleteById(id);
	}
}
