package com.springsimplespasos.universidad.universidadbackend.modelo.entidades;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.enumeradores.TipoEmpleado;

import java.math.BigDecimal;

public class Empleado extends Persona{
    private BigDecimal sueldo;
    private TipoEmpleado tipoEmpleado;

    public Empleado() {
    }

    public Empleado(String id, String nombre, String apellido, String dni, Direccion direccion, BigDecimal sueldo, TipoEmpleado tipoEmpleado) {
        super(id, nombre, apellido, dni, direccion);
        this.sueldo = sueldo;
        this.tipoEmpleado = tipoEmpleado;
    }

    public BigDecimal getSueldo() {
        return sueldo;
    }

    public void setSueldo(BigDecimal sueldo) {
        this.sueldo = sueldo;
    }

    public TipoEmpleado getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(TipoEmpleado tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }
}
