package com.springsimplespasos.universidad.universidadbackend.servicios.implementaciones;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Carrera;
import com.springsimplespasos.universidad.universidadbackend.repositorios.CarreraRepository;
import com.springsimplespasos.universidad.universidadbackend.servicios.contratos.CarreraDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class CarreraDAOImpl extends GenedricoDAOImpl<Carrera, CarreraRepository> implements CarreraDAO {

    @Autowired
    public CarreraDAOImpl(CarreraRepository repository) {
        super(repository);
    }

}
