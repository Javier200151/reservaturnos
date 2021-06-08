package com.asesoftware.reservaturnos.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.asesoftware.reservaturnos.dto.ServicioDTO;
import com.asesoftware.reservaturnos.entity.Servicio;

@Mapper(componentModel = "spring")
public interface IServicioMapper {

	public List<ServicioDTO> listaEntityToDto (List<Servicio> listEntity);
	
	public ServicioDTO listaEntityToDto (Servicio entity);
	
	public Servicio listaEntityToDto (ServicioDTO dto);
}
