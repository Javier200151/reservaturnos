package com.asesoftware.reservaturnos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.asesoftware.reservaturnos.entity.Comercio;

@Service
public interface IComercioService {

	public List<Comercio> getAll();
	
	public Comercio getComercioById(Integer id);
	
	public Comercio createComercio(Comercio comercio);
	
	public Comercio updateComercio(Comercio comercio);
	
	public void deleteComercio(Integer id);
	
}
