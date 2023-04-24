package com.rgibert.ta26_ex1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rgibert.ta26_ex1.dto.Pieza;

public interface IPiezaDAO extends JpaRepository<Pieza, Integer> {

}
