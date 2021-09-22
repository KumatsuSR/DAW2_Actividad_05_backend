package com.empresa.service;

import java.util.List;

import com.empresa.entity.Disponibilidad;

public interface DisponibilidadService {
	public abstract List<Disponibilidad> listadoDisponibilidad();
	public abstract Disponibilidad guardarDisponibilidad(Disponibilidad obj);
}
