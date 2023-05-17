package com.cursomicro.primermicro.controllers;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class SaludoController {

    @GetMapping(value = "/saludo", produces = "text/plain")
    public String saludar() {
        log.info("Lanzando servicio Get - Saludo");
        return "Hola Mundo desde Spring Boot!";
    }

}
