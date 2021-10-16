package com.springsimplespasos.universidad.universidadbackend.modelo.entidades;

public class Alumno extends Persona {

    public Alumno() {
    }

    public Alumno(String id, String nombre, String apellido, String dni, Direccion direccion) {
        super(id, nombre, apellido, dni, direccion);
    }
}
