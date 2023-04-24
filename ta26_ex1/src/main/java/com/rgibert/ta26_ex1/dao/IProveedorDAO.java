package com.rgibert.ta26_ex1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rgibert.ta26_ex1.dto.Proveedor;

public interface IProveedorDAO extends JpaRepository<Proveedor, String> {

}
