package com.asesoftware.reservaturnos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;

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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAforoMaximo() {
		return aforoMaximo;
	}

	public void setAforoMaximo(String aforoMaximo) {
		this.aforoMaximo = aforoMaximo;
	}
}
