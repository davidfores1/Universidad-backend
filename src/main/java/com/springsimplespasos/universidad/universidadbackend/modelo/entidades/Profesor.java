package com.springsimplespasos.universidad.universidadbackend.modelo.entidades;

import java.math.BigDecimal;

public class Profesor extends Persona{
    private BigDecimal sueldo;

    public Profesor() {
    }

    public Profesor(String id, String nombre, String apellido, String dni, Direccion direccion, BigDecimal sueldo) {
        super(id, nombre, apellido, dni, direccion);
        this.sueldo = sueldo;
    }
}
