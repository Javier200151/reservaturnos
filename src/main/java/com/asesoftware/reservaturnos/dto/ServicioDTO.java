package com.asesoftware.reservaturnos.dto;

import lombok.Data;

@Data
public class ServicioDTO {

	private Integer id;

	private Integer idComercio;

	private String nombre;

	private String horaApertura;

	private String horaCierre;

	private String duracion;
}
