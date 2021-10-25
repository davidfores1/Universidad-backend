package com.springsimplespasos.universidad.universidadbackend;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Carrera;
import com.springsimplespasos.universidad.universidadbackend.servicios.contratos.CarreraDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CarreraComandos implements CommandLineRunner {

    @Autowired
    private CarreraDAO servicio;

    @Override
    public void run(String... args) throws Exception {

        /*Carrera ingSistemas = new Carrera(null, "Ingeneria en sistemas", 50,5);
        Carrera save = servicio.save(ingSistemas);
        System.out.println(save.toString());*/

        Optional<Carrera> OCarrera = servicio.finById(1);
        if (OCarrera.isPresent()){
            Carrera carrera = OCarrera.get();
            System.out.println(carrera.toString());
        }else {
            System.out.println("Carrera no encontrada");
        }

    }
}
