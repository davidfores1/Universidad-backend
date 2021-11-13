package com.springsimplespasos.universidad.universidadbackend.controlador;

import com.springsimplespasos.universidad.universidadbackend.exception.BadRequestException;
import com.springsimplespasos.universidad.universidadbackend.servicios.contratos.GenericoDAO;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class GenericController <E, S extends GenericoDAO<E>>{

    protected final S service;
    protected String nombreEntidad;


    public GenericController(S service) {
        this.service = service;
    }

    @GetMapping
    public List<E>obtenerTodos(){
        List<E> listado = (List<E>) service.findAll();
        if(listado.isEmpty()){
            throw new BadRequestException(String.format("No se han encontrado %ss", nombreEntidad));
        }
        return listado;
    }
}
