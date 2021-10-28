package com.springsimplespasos.universidad.universidadbackend.repositorios;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Carrera;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface CarreraRepository extends CrudRepository<Carrera, Integer> {

    //consulta por metodos
    Iterable<Carrera> findCarreraByNombreContains(String nombre);

    Iterable<Carrera> findCarreraByNombreContainsIgnoreCase(String nombre);

    Iterable<Carrera> findCarreraByCantidadAniosAfter(Integer cantidadAnios);

    //Consulta Query
/*    @Query("select c from Carrera c join Profesor p where p.nombre = ?1 and p.apellido = ?1 ")
    Iterable<Carrera>buscarCarrerasPorProfesorNombreYApellido(String nombre, String apellido);*/
}
