package com.springsimplespasos.universidad.universidadbackend.controlador;

import com.springsimplespasos.universidad.universidadbackend.exception.BadRequestException;
import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Persona;
import com.springsimplespasos.universidad.universidadbackend.servicios.contratos.AlumnoDAO;
import com.springsimplespasos.universidad.universidadbackend.servicios.contratos.PersonaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alumnos")
public class AlumnoController {

    private PersonaDAO alumnoDAO;

    @Autowired
    public AlumnoController(@Qualifier("alumnoDAOImpl") PersonaDAO alumnoDAO) {
        this.alumnoDAO = alumnoDAO;
    }
    @GetMapping
    public  List<Persona> obtenerTodos(){
    List<Persona> alumnos = (List<Persona>) alumnoDAO.findAll();
    if(alumnos.isEmpty()){
    throw new BadRequestException("No existen alumnos");
    }
    return alumnos;
    }

    @GetMapping("/{id}")
    public Persona obtenerAlumnoPorId(@PathVariable(required = false) Integer id){
        Optional<Persona> oAlumno = alumnoDAO.finById(id);
        if(!oAlumno.isPresent()){
            throw new BadRequestException(String.format("Alumno con id %d no existe", id));
        }
        return oAlumno.get();
    }

    @PostMapping
    public Persona altaAlumno(@RequestBody Persona alumno){

        return alumnoDAO.save(alumno);

    }

    @PutMapping("/{id}")
    public Persona actualizarAlumno(@PathVariable Integer id,@RequestBody Persona alumno){

        Persona alumnoUpdate = null;
        Optional<Persona>  oAlumno = alumnoDAO.finById(id);
        if(!oAlumno.isPresent()){
            throw new BadRequestException(String.format("Alumno con id %d no existe", id));
        }
        alumnoUpdate = oAlumno.get();
        alumnoUpdate.setNombre(alumno.getNombre());
        alumnoUpdate.setApellido(alumno.getApellido());
        alumnoUpdate.setDireccion(alumno.getDireccion());
        return alumnoDAO.save(alumnoUpdate);
    }

    @DeleteMapping("/{id}")
    public void eliminarAlumno(@PathVariable Integer id){
        alumnoDAO.deleteById(id);
    }

}
