package com.example.baloncestoapirest.modelo.pojos;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Equipos {

    @Id
    @Column(name = "codigo_equipo", nullable = false)
    private int codigoEquipo;
    @Basic
    @Column(name = "nombre_equipo", nullable = false, length = 40)
    private String nombreEquipo;

    public int getCodigoEquipo() {
        return codigoEquipo;
    }

    public void setCodigoEquipo(int codigoEquipo) {
        this.codigoEquipo = codigoEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipos equipos = (Equipos) o;
        return codigoEquipo == equipos.codigoEquipo && Objects.equals(nombreEquipo, equipos.nombreEquipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoEquipo, nombreEquipo);
    }
}
