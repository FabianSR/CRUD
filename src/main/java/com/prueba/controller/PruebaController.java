package com.prueba.controller;

import com.prueba.dto.PruebaDto;
import com.prueba.service.PruebaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/prueba")
@RequiredArgsConstructor
public class PruebaController {

    private final PruebaService pruebaService;

    @PostMapping(value = "/")
    public PruebaDto create(final @RequestBody PruebaDto input) {
        return pruebaService.createPrueba(input);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(final @RequestParam Long id) {
        pruebaService.deletePrueba(id);
    }

    @PutMapping(value = "/")
    public PruebaDto update(final @RequestBody PruebaDto pruebaDto) {
        return pruebaService.mergePrueba(pruebaDto);
    }

    @GetMapping(value = "/{id}")
    public void get(final @RequestParam Long id) {
        pruebaService.getPrueba(id);
    }


}
