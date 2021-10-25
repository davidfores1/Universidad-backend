package com.springsimplespasos.universidad.universidadbackend.servicios.implementaciones;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Persona;
import com.springsimplespasos.universidad.universidadbackend.repositorios.PersonaRepository;
import com.springsimplespasos.universidad.universidadbackend.servicios.contratos.AlumnoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class AlumnoDAOImpl implements AlumnoDAO {

    @Autowired
    @Qualifier("repositorioAlumnos")
    private PersonaRepository repository;

    @Override
    @Transactional(readOnly = true)
    public Optional<Persona> finById(Integer id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public Persona save(Persona persona) {
        return repository.save(persona);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Persona> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
     repository.deleteById(id);
    }
}
