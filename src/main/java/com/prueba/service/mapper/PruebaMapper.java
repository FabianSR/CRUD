package com.prueba.service.mapper;

import com.prueba.dto.PruebaDto;
import com.prueba.persistence.model.PruebaEntidad;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PruebaMapper {
    PruebaMapper pruebaMapper = Mappers.getMapper(PruebaMapper.class);

    PruebaDto mapToPruebaDto(PruebaEntidad entity);

    PruebaEntidad mapToPurebaEntidad(PruebaDto dto);

}