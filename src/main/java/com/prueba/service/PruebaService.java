package com.prueba.service;

import com.prueba.dto.PruebaDto;

public interface PruebaService {
    PruebaDto createPrueba(PruebaDto input);
    void deletePrueba(Long id);
    PruebaDto mergePrueba(PruebaDto input);
    PruebaDto getPruebaByCampo(String campo);
    PruebaDto getPrueba(Long id);
}
