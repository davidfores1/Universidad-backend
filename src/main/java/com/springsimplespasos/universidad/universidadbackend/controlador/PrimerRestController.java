package com.springsimplespasos.universidad.universidadbackend.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PrimerRestController {

    @GetMapping("/saludo")
    public String holamundo(){

        return "Hola mundo desde Spring boot";
    }
}
