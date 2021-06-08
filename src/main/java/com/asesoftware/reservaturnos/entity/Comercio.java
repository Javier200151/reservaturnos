package com.asesoftware.reservaturnos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "comercios")
public class Comercio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_comercio")
	private Integer id;
	
	@Column(name="nom_comercio")
	private String nombre;
	
	@Column(name="aforo_maximo")
	private String aforoMaximo;

}
