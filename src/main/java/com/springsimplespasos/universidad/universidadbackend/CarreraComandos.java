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

        Carrera carrera = null;
        Optional<Carrera> OCarrera = servicio.finById(1);
        if (OCarrera.isPresent()){
            carrera = OCarrera.get();
            System.out.println(carrera.toString());
        }else {
            System.out.println("Carrera no encontrada");
        }
        carrera.setCantidadMaterias(65);
        carrera.setCantidadAnios(6);

        servicio.save(carrera);

        System.out.println(servicio.finById(1).orElse(new Carrera()).toString());

        servicio.deleteById(1);

        System.out.println(servicio.finById(1).orElse(new Carrera()).toString());
    }
}
