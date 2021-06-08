package com.asesoftware.reservaturnos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.asesoftware.reservaturnos.entity.Turno;

@Service
public interface ITurnoService {

	public List<Turno> getAll();
	
	public Turno getTurnoById(Integer id);
	
	public Turno createTurno(Turno turno);
	
	public Turno updateTurno(Turno turno);
	
	public void deleteTurno(Integer id);
}
