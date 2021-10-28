/*package com.springsimplespasos.universidad.universidadbackend;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Alumno;
import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Carrera;
import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Persona;
import com.springsimplespasos.universidad.universidadbackend.servicios.contratos.AlumnoDAO;
import com.springsimplespasos.universidad.universidadbackend.servicios.contratos.CarreraDAO;
import com.springsimplespasos.universidad.universidadbackend.servicios.contratos.PersonaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AlumnosCommand implements CommandLineRunner {

    @Autowired
    @Qualifier("alumnoDAOImpl")
    private PersonaDAO personaDAO;

    @Autowired
    private CarreraDAO carreraDAO;

    @Override
    public void run(String... args) throws Exception {

*//*        Optional<Carrera> ingSistemas = carreraDAO.finById(2);

        Iterable<Persona> alumnos = personaDAO.findAll();
        alumnos.forEach(alumno -> ((Alumno)alumno).setCarrera(ingSistemas.get()));
        alumnos.forEach(alumno -> personaDAO.save(alumno));*//*

*//*    Optional<Persona> alumno_1 = personaDAO.finById(1);*//*

*//*    Optional<Persona> personaNomApe = personaDAO.buscarNombreYApellido(alumno_1.get().getNombre(), alumno_1.get().getApellido());
        System.out.println(personaNomApe.toString());

    Optional<Persona> personaDni = personaDAO.buscarPorDni(alumno_1.get().getDni());
        System.out.println(personaDni.toString());

    Iterable<Persona> personasApellido = personaDAO.buscarPersonaPorApellido(alumno_1.get().getApellido());
     personasApellido.forEach(System.out::println);*//*

        Optional<Carrera> ingSistemas = carreraDAO.finById(2);
        Iterable<Persona> alumnoCarrera = ((AlumnoDAO) personaDAO).buscarAlumnoPorNombreCarrera(ingSistemas.get().getNombre());
        alumnoCarrera.forEach(System.out::println);
    }
}*/
