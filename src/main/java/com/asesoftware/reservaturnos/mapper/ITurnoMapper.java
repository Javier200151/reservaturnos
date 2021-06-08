package com.asesoftware.reservaturnos.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.asesoftware.reservaturnos.dto.TurnoDTO;
import com.asesoftware.reservaturnos.entity.Turno;

@Mapper(componentModel = "spring")
public interface ITurnoMapper {

	public List<TurnoDTO> listaEntityToDto (List<Turno> listEntity);
	
	public TurnoDTO listaEntityToDto (Turno entity);
	
	public Turno listaEntityToDto (TurnoDTO dto);
}
