package com.empresa.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.empresa.entity.Disponibilidad;
import com.empresa.repository.DisponibilidadRepository;

@Service
public class DisponibilidadServiceImpl implements DisponibilidadService{

	@Autowired
	DisponibilidadRepository repoDisponibilidad;
	
	@Override
	public List<Disponibilidad> listadoDisponibilidad() {
		return repoDisponibilidad.findAll();
	}

	@Override
	public Disponibilidad guardarDisponibilidad(Disponibilidad obj) {
		return repoDisponibilidad.save(obj);
	}

}
