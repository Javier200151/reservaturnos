package com.asesoftware.reservaturnos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asesoftware.reservaturnos.entity.Comercio;
import com.asesoftware.reservaturnos.repository.IComercioRepository;

@Service
public class ComercioService implements IComercioService{

	@Autowired
	private IComercioRepository comercioRepository;
	
	@Override
	public List<Comercio> getAll() {
		// TODO Auto-generated method stub
		return comercioRepository.findAll();
	}

	@Override
	public Comercio getComercioById(Integer id) {

		Optional<Comercio> optional = comercioRepository.findById(id);
		
		if(optional.isPresent()) {
			return optional.get();
		}else {
			return null;
		}
	}

	@Override
	public Comercio createComercio(Comercio comercio) {
		
		try {
			return comercioRepository.save(comercio);
		}catch(Exception e){
			return null;
		}
	}

	@Override
	public Comercio updateComercio(Comercio comercio) {
		
		return comercioRepository.save(comercio);
	}

	@Override
	public void deleteComercio(Integer id) {
		
		comercioRepository.deleteById(id);
	}
	
}
