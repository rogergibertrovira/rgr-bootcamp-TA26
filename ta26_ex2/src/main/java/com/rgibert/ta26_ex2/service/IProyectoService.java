package com.rgibert.ta26_ex2.service;

import java.util.List;

import com.rgibert.ta26_ex2.dto.Proyecto;

public interface IProyectoService {

	public List<Proyecto> listarProyectos(); // Listar All

	public Proyecto guardarProyecto(Proyecto proyecto); // Guarda un proyecto CREATE

	public Proyecto proyectoXID(String id); // Leer datos de un proyecto READ

	public Proyecto actualizarProyecto(Proyecto proyecto); // Actualiza datos del proyecto UPDATE

	public void eliminarProyecto(String id);// Elimina el proyecto DELETE
	
}
