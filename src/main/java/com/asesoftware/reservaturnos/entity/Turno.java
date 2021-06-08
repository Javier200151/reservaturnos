package com.asesoftware.reservaturnos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "turnos")
public class Turno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_turno")
	private Integer id;
	
	@Column(name="id_servicio")
	private String idServicio;
	
	@Column(name="fecha_turno")
	private String fechaTurno;
	
	@Column(name="hora_inicio")
	private String horaInicio;
	
	@Column(name="hora_fin")
	private String horaFin;
	
	@Column(name="estado")
	private String estado;
}
