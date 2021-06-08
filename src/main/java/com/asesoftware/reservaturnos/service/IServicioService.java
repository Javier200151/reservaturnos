package com.asesoftware.reservaturnos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.asesoftware.reservaturnos.dto.ServicioDTO;
import com.asesoftware.reservaturnos.entity.Servicio;

@Service
public interface IServicioService {

	public List<ServicioDTO> getAll();
	
	public Servicio getServicioById(Integer id);
	
	public Servicio createServicio(Servicio servicio);
	
	public Servicio updateServicio(Servicio servicio);
	
	public void deleteServicio(Integer id);
}