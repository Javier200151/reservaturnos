package com.asesoftware.reservaturnos.dto;

import lombok.Data;

@Data
public class TurnoDTO {
	
	private Integer id;
	
	private String idServicio;

	private String fechaTurno;

	private String horaInicio;

	private String horaFin;

	private String estado;
}
