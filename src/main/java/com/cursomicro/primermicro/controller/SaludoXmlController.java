package com.cursomicro.primermicro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoXmlController {

    @GetMapping(value = "/saludoXml", produces = "application/xml")
    public String saludar() {
        return "<Saludo>Hola Mundo desde Spring Boot!</Saludo>";
    }
}
