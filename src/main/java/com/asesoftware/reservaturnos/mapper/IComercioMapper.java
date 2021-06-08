package com.asesoftware.reservaturnos.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.asesoftware.reservaturnos.dto.ComercioDTO;
import com.asesoftware.reservaturnos.entity.Comercio;

@Mapper(componentModel = "spring")
public interface IComercioMapper {
	
	public List<ComercioDTO> listaEntityToDto (List<Comercio> listEntity);
	
	public ComercioDTO listaEntityToDto (Comercio entity);
	
	public Comercio listaEntityToDto (ComercioDTO dto);
}
