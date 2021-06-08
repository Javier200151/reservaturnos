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

import com.asesoftware.reservaturnos.dto.ComercioDTO;
import com.asesoftware.reservaturnos.entity.Comercio;
import com.asesoftware.reservaturnos.mapper.IComercioMapper;
import com.asesoftware.reservaturnos.service.IComercioService;

@RestController
@RequestMapping(path = "/api/comercio")
public class ComercioController {

	@Autowired
	private IComercioService comercioService;
	
	@GetMapping(path = "/all")
	public List<ComercioDTO> getAll(){
		return comercioService.getAll();
	}
	
	@GetMapping(path = "/{id}")
	public Comercio getComercioById(@PathVariable Integer id) {
		
		return comercioService.getComercioById(id);
	}
	
	@GetMapping(path = "/parametro")
	public Comercio getComercioParametroById(@RequestParam Integer id) {
		
		return comercioService.getComercioById(id);
	}
	
	@PostMapping(path = "/crear", consumes = "application/json", produces = "application/json")
	public Comercio createComercio(@RequestBody Comercio entity) {
		
		return comercioService.createComercio(entity);
	}
	
	@PostMapping(path = "/editar", consumes = "application/json", produces = "application/json")
	public Comercio editarComercio(@RequestBody Comercio entity) {
		
		return comercioService.updateComercio(entity);
	}
	
	@PostMapping(path = "/delete/{id}")
	public void deleteComercio(@PathVariable Integer id) {
		
		comercioService.deleteComercio(id);
	}
}
