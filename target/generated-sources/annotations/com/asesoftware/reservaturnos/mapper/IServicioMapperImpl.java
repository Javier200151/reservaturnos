package com.asesoftware.reservaturnos.mapper;

import com.asesoftware.reservaturnos.dto.ServicioDTO;
import com.asesoftware.reservaturnos.entity.Servicio;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-06-10T20:44:13-0500",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.3.1200.v20200916-0645, environment: Java 15.0.2 (Oracle Corporation)"
)
@Component
public class IServicioMapperImpl implements IServicioMapper {

    @Override
    public List<ServicioDTO> listaEntityToDto(List<Servicio> listEntity) {
        if ( listEntity == null ) {
            return null;
        }

        List<ServicioDTO> list = new ArrayList<ServicioDTO>( listEntity.size() );
        for ( Servicio servicio : listEntity ) {
            list.add( listaEntityToDto( servicio ) );
        }

        return list;
    }

    @Override
    public ServicioDTO listaEntityToDto(Servicio entity) {
        if ( entity == null ) {
            return null;
        }

        ServicioDTO servicioDTO = new ServicioDTO();

        servicioDTO.setDuracion( entity.getDuracion() );
        servicioDTO.setHoraApertura( entity.getHoraApertura() );
        servicioDTO.setHoraCierre( entity.getHoraCierre() );
        servicioDTO.setId( entity.getId() );
        servicioDTO.setIdComercio( entity.getIdComercio() );
        servicioDTO.setNombre( entity.getNombre() );

        return servicioDTO;
    }

    @Override
    public Servicio listaEntityToDto(ServicioDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Servicio servicio = new Servicio();

        servicio.setDuracion( dto.getDuracion() );
        servicio.setHoraApertura( dto.getHoraApertura() );
        servicio.setHoraCierre( dto.getHoraCierre() );
        servicio.setId( dto.getId() );
        servicio.setIdComercio( dto.getIdComercio() );
        servicio.setNombre( dto.getNombre() );

        return servicio;
    }
}
