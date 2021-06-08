package com.asesoftware.reservaturnos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asesoftware.reservaturnos.entity.Servicio;
import com.asesoftware.reservaturnos.repository.IServicioRepository;

@Service
public class ServicioService implements IServicioService{

	@Autowired
	private IServicioRepository servicioRepository;
	
	@Override
	public List<Servicio> getAll() {
		// TODO Auto-generated method stub
		return servicioRepository.findAll();
	}

	@Override
	public Servicio getServicioById(Integer id) {

		Optional<Servicio> optional = servicioRepository.findById(id);
		
		if(optional.isPresent()) {
			return optional.get();
		}else {
			return null;
		}
	}

	@Override
	public Servicio createServicio(Servicio servicio) {

		try {
			return servicioRepository.save(servicio);
		}catch(Exception e){
			return null;
		}
	}

	@Override
	public Servicio updateServicio(Servicio servicio) {
		
		return servicioRepository.save(servicio);
	}

	@Override
	public void deleteServicio(Integer id) {

		servicioRepository.deleteById(id);
	}

}
