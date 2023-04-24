package com.rgibert.ta26_ex4.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rgibert.ta26_ex4.dto.Investigador;

public interface IInvestigadorDAO extends JpaRepository<Investigador, String> {

}
