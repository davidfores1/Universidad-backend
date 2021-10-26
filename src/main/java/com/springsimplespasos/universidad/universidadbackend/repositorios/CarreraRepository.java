package com.springsimplespasos.universidad.universidadbackend.repositorios;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Carrera;
import org.springframework.data.repository.CrudRepository;


public interface CarreraRepository extends CrudRepository<Carrera, Integer> {

    //Consulta spring
    Iterable<Carrera> findCarreraByNombreContains(String nombre);

    Iterable<Carrera> findCarreraByNombreContainsIgnoreCase(String nombre);

    Iterable<Carrera> findCarreraByCantidadAniosAfter(Integer cantidadAnios);

}
