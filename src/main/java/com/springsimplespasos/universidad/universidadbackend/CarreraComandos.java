/*package com.springsimplespasos.universidad.universidadbackend;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Carrera;
import com.springsimplespasos.universidad.universidadbackend.servicios.contratos.CarreraDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CarreraComandos implements CommandLineRunner {

    @Autowired
    private CarreraDAO servicio;

    @Override
    public void run(String... args) throws Exception {

*//*      Carrera ingSistemas = new Carrera(null,"Ingeneria de Sistemas",40,8);
        Carrera ingIndustrial = new Carrera(null,"Ingeneria Industrial",50,5);
        Carrera ingAlimentos = new Carrera(null,"Ingeneria de Alimentos",60,5);
        Carrera ingElectronica = new Carrera(null,"Ingeneria Electronica",30,7);
        Carrera licRecursos = new Carrera(null,"Licenciatura en Recursos Humanos",70,6);

        servicio.save(ingSistemas);
        servicio.save(ingIndustrial);
        servicio.save(ingAlimentos);
        servicio.save(ingElectronica);
        servicio.save(licRecursos);*//*

*//*        List<Carrera> carreras = (List<Carrera>) servicio.findCarreraByNombreContains("sistemas");
        carreras.forEach(System.out::println);

        List<Carrera> carreras1 = (List<Carrera>) servicio.findCarreraByNombreContainsIgnoreCase("SISTEMAS");
        carreras1.forEach(System.out::println);

        List<Carrera> carreras2 = (List<Carrera>) servicio.findCarreraByCantidadAniosAfter(5);
        carreras2.forEach(System.out::println);*//*
    }
}*/
