package com.cursomicro.primermicro.controllers;

import com.cursomicro.primermicro.dto.SaludoRequestDTO;
import com.cursomicro.primermicro.dto.SaludoResponseDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class SaludoController {

    @GetMapping(value = "/saludo", produces = "text/plain")
    public String saludar() {
        log.info("Lanzando servicio Get - Saludo");
        return "Hola Mundo desde Spring Boot!";
    }

    @PostMapping(value = "/saludoPost", consumes = "application/json", produces = "application/json")
    public String saludarConNombre(@RequestBody SaludoRequestDTO request) {
        log.info("Lanzando servicio Post - Saludo con el nombre : " + request.getName() );
        SaludoResponseDTO response = new SaludoResponseDTO();
        response.setSaludo("Hola " + request.getName() + " desde Spring Boot!");
        return response.getSaludo();
    }
}
