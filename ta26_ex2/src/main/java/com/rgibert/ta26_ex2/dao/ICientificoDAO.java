package com.rgibert.ta26_ex2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rgibert.ta26_ex2.dto.Cientifico;

public interface ICientificoDAO extends JpaRepository<Cientifico, String> {

}
