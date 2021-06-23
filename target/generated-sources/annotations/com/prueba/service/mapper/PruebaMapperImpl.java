package com.prueba.service.mapper;

import com.prueba.dto.PruebaDto;
import com.prueba.persistence.model.PruebaEntidad;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-06-23T12:04:50+0200",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 13.0.2 (Oracle Corporation)"
)
public class PruebaMapperImpl implements PruebaMapper {

    @Override
    public PruebaDto mapToPruebaDto(PruebaEntidad entity) {
        if ( entity == null ) {
            return null;
        }

        PruebaDto pruebaDto = new PruebaDto();

        pruebaDto.setId( entity.getId() );
        pruebaDto.setCampo( entity.getCampo() );

        return pruebaDto;
    }

    @Override
    public PruebaEntidad mapToPurebaEntidad(PruebaDto dto) {
        if ( dto == null ) {
            return null;
        }

        PruebaEntidad pruebaEntidad = new PruebaEntidad();

        pruebaEntidad.setId( dto.getId() );
        pruebaEntidad.setCampo( dto.getCampo() );

        return pruebaEntidad;
    }
}
