package com.asesoftware.reservaturnos.mapper;

import com.asesoftware.reservaturnos.dto.TurnoDTO;
import com.asesoftware.reservaturnos.entity.Turno;
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
public class ITurnoMapperImpl implements ITurnoMapper {

    @Override
    public List<TurnoDTO> listaEntityToDto(List<Turno> listEntity) {
        if ( listEntity == null ) {
            return null;
        }

        List<TurnoDTO> list = new ArrayList<TurnoDTO>( listEntity.size() );
        for ( Turno turno : listEntity ) {
            list.add( listaEntityToDto( turno ) );
        }

        return list;
    }

    @Override
    public TurnoDTO listaEntityToDto(Turno entity) {
        if ( entity == null ) {
            return null;
        }

        TurnoDTO turnoDTO = new TurnoDTO();

        turnoDTO.setEstado( entity.getEstado() );
        turnoDTO.setFechaTurno( entity.getFechaTurno() );
        turnoDTO.setHoraFin( entity.getHoraFin() );
        turnoDTO.setHoraInicio( entity.getHoraInicio() );
        turnoDTO.setId( entity.getId() );
        turnoDTO.setIdServicio( entity.getIdServicio() );

        return turnoDTO;
    }

    @Override
    public Turno listaEntityToDto(TurnoDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Turno turno = new Turno();

        turno.setEstado( dto.getEstado() );
        turno.setFechaTurno( dto.getFechaTurno() );
        turno.setHoraFin( dto.getHoraFin() );
        turno.setHoraInicio( dto.getHoraInicio() );
        turno.setId( dto.getId() );
        turno.setIdServicio( dto.getIdServicio() );

        return turno;
    }
}
