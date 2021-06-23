package com.prueba.service.impl;

import com.prueba.dto.PruebaDto;
import com.prueba.persistence.repository.PruebaRepository;
import com.prueba.service.PruebaService;
import com.prueba.service.mapper.PruebaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PruebaServiceImpl implements PruebaService {

    private final PruebaRepository pruebaRepository;
    private final PruebaMapper mapper;

    @Override
    public PruebaDto createPrueba(PruebaDto input) {
        return getPruebaDto(input);
    }

    private PruebaDto getPruebaDto(PruebaDto input) {
        return Optional.of(pruebaRepository.save(mapper.mapToPurebaEntidad(input))).map(mapper::mapToPruebaDto).orElseThrow(() -> new RuntimeException());
    }

    @Override
    public void deletePrueba(Long id) {
        pruebaRepository.deleteById(id);
    }

    @Override
    public PruebaDto mergePrueba(PruebaDto input) {
        return Optional.ofNullable(input.getId())
                .map(e -> getPruebaDto(input)).orElseThrow(() -> new RuntimeException("id not exist"));

    }

    @Override
    public PruebaDto getPruebaByCampo(String campo) {
        return pruebaRepository.findFirstByCampo(campo).map(mapper::mapToPruebaDto).orElse(null);
    }

    @Override
    public PruebaDto getPrueba(Long id) {
        return pruebaRepository.findById(id).map(mapper::mapToPruebaDto).orElseThrow(() -> new RuntimeException("prueba not found"));
    }
}
