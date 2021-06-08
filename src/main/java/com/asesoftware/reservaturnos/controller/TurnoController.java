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

import com.asesoftware.reservaturnos.entity.Turno;
import com.asesoftware.reservaturnos.service.ITurnoService;

@RestController
@RequestMapping(path = "/api/turno")
public class TurnoController {
	
	@Autowired
	private ITurnoService turnoService;
	
	@GetMapping(path = "/all")
	public List<Turno> getAll(){
		return turnoService.getAll();
	}
	
	@GetMapping(path = "/{id}")
	public Turno getTurnoById(@PathVariable Integer id) {
		
		return turnoService.getTurnoById(id);
	}
	
	@GetMapping(path = "/parametro")
	public Turno getTurnoParametroById(@RequestParam Integer id) {
		
		return turnoService.getTurnoById(id);
	}
	
	@PostMapping(path = "/crear", consumes = "application/json", produces = "application/json")
	public Turno createTurno(@RequestBody Turno entity) {
		
		return turnoService.createTurno(entity);
	}
	
	@PostMapping(path = "/editar", consumes = "application/json", produces = "application/json")
	public Turno editarTurno(@RequestBody Turno entity) {
		
		return turnoService.updateTurno(entity);
	}
	
	@PostMapping(path = "/delete/{id}")
	public void deleteTurno(@PathVariable Integer id) {
		
		turnoService.deleteTurno(id);
	}
}
