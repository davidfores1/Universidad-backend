package com.springsimplespasos.universidad.universidadbackend.repositorios;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Persona;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository("repositorioProfesores")
public interface ProfesorRepository extends PersonaRepository {


    //metodo
    @Query("select prof from Profesor prof join fetch prof.carreras c where c.nombre = ?1")
    Iterable<Persona>findProfesoresByCarrera(String carrera);

}
