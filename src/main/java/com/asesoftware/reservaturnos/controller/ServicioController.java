package com.asesoftware.reservaturnos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.asesoftware.reservaturnos.dto.ServicioDTO;
import com.asesoftware.reservaturnos.entity.Servicio;
import com.asesoftware.reservaturnos.service.IServicioService;

@RestController
@RequestMapping(path = "/api/servicio")
public class ServicioController {
	
	@Autowired
	private IServicioService servicioService;
	
	@GetMapping(path = "/all")
	public List<ServicioDTO> getAll(){
		return servicioService.getAll();
	}
	
	@GetMapping(path = "/{id}")
	public Servicio getServicioById(@PathVariable Integer id) {
		
		return servicioService.getServicioById(id);
	}
	
	@GetMapping(path = "/parametro")
	public Servicio getServicioParametroById(@RequestParam Integer id) {
		
		return servicioService.getServicioById(id);
	}
	
	@PostMapping(path = "/crear", consumes = "application/json", produces = "application/json")
	public Servicio createServicio(@RequestBody Servicio entity) {
		
		return servicioService.createServicio(entity);
	}
	
	@PostMapping(path = "/editar", consumes = "application/json", produces = "application/json")
	public Servicio editarServicio(@RequestBody Servicio entity) {
		
		return servicioService.updateServicio(entity);
	}
	
	@PostMapping(path = "/delete/{id}")
	public void deleteServicio(@PathVariable Integer id) {
		
		servicioService.deleteServicio(id);
	}
}
