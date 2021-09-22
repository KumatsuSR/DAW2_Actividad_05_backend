package com.empresa.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="disponibilidad")
@Getter
@Setter

public class Disponibilidad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDisponibilidad;
	
	//@DateTimeFormat(pattern="HH:mm:ss")
	//@Temporal(TemporalType.DATE)
	private String horaInicio;
	
	//@DateTimeFormat(pattern="HH:mm:ss")
	//@Temporal(TemporalType.DATE)
	private String horaFin;
	
	private String dia;
	private int idCiclo;
	private int idUsuario;
}
