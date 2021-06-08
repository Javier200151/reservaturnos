package com.asesoftware.reservaturnos.mapper;

import com.asesoftware.reservaturnos.dto.ComercioDTO;
import com.asesoftware.reservaturnos.entity.Comercio;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-06-08T11:33:09-0500",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.3.1200.v20200916-0645, environment: Java 15.0.2 (Oracle Corporation)"
)
@Component
public class IComercioMapperImpl implements IComercioMapper {

    @Override
    public List<ComercioDTO> listaEntityToDto(List<Comercio> listEntity) {
        if ( listEntity == null ) {
            return null;
        }

        List<ComercioDTO> list = new ArrayList<ComercioDTO>( listEntity.size() );
        for ( Comercio comercio : listEntity ) {
            list.add( listaEntityToDto( comercio ) );
        }

        return list;
    }

    @Override
    public ComercioDTO listaEntityToDto(Comercio entity) {
        if ( entity == null ) {
            return null;
        }

        ComercioDTO comercioDTO = new ComercioDTO();

        comercioDTO.setAforoMaximo( entity.getAforoMaximo() );
        comercioDTO.setId( entity.getId() );
        comercioDTO.setNombre( entity.getNombre() );

        return comercioDTO;
    }

    @Override
    public Comercio listaEntityToDto(ComercioDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Comercio comercio = new Comercio();

        comercio.setAforoMaximo( dto.getAforoMaximo() );
        comercio.setId( dto.getId() );
        comercio.setNombre( dto.getNombre() );

        return comercio;
    }
}
