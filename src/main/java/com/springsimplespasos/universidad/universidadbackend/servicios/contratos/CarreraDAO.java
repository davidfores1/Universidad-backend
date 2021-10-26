package com.springsimplespasos.universidad.universidadbackend.servicios.contratos;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Carrera;

import java.util.Optional;

public interface CarreraDAO extends GenericoDAO<Carrera> {

    Iterable<Carrera> findCarreraByNombreContains(String nombre);

    Iterable<Carrera> findCarreraByNombreContainsIgnoreCase(String nombre);

    Iterable<Carrera> findCarreraByCantidadAniosAfter(Integer cantidadAnios);

}
