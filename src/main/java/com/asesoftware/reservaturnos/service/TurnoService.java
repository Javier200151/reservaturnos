package com.asesoftware.reservaturnos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asesoftware.reservaturnos.dto.TurnoDTO;
import com.asesoftware.reservaturnos.entity.Turno;
import com.asesoftware.reservaturnos.mapper.IServicioMapper;
import com.asesoftware.reservaturnos.mapper.ITurnoMapper;
import com.asesoftware.reservaturnos.repository.ITurnoRepository;

@Service
public class TurnoService implements ITurnoService{

	@Autowired
	private ITurnoRepository turnoRepository;
	
	@Autowired
	private ITurnoMapper mapper;
	
	@Override
	public List<TurnoDTO> getAll() {
		// TODO Auto-generated method stub
		return mapper.listaEntityToDto(turnoRepository.findAll());
	}

	@Override
	public Turno getTurnoById(Integer id) {

		Optional<Turno> optional = turnoRepository.findById(id);

		if(optional.isPresent()) {
			return optional.get();
		}else {
			return null;
		}
	}

	@Override
	public Turno createTurno(Turno turno) {
		
		try {
			return turnoRepository.save(turno);
		}catch(Exception e){
			return null;
		}
	}

	@Override
	public Turno updateTurno(Turno turno) {

		return turnoRepository.save(turno);
	}

	@Override
	public void deleteTurno(Integer id) {

		turnoRepository.deleteById(id);
	}

}
