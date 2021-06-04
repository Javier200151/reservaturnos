package com.asesoftware.reservaturnos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "servicios")
public class Servicio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="id_comercio")
	private Integer idComercio;
	
	@Column(name="nom_servicio")
	private String nombre;
	
	private String horaApertura;
	
	private String horaCierre;
}
