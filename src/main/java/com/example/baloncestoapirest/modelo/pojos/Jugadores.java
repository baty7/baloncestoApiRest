package com.example.baloncestoapirest.modelo.pojos;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Jugadores {

    @Id
    @Column(name = "codigo_jugador", nullable = false)
    private int codigoJugador;
    @Basic
    @Column(name = "nombre_jugador", nullable = false, length = 40)
    private String nombreJugador;
    @Basic
    @Column(name = "puesto", nullable = false, length = 40)
    private String puesto;
    @Basic
    @Column(name = "estatura", nullable = false)
    private int estatura;
    @ManyToOne
    @JoinColumn(name = "equipo", referencedColumnName = "codigo_equipo", nullable = false)
    private Equipos equipo;

    public int getCodigoJugador() {
        return codigoJugador;
    }

    public void setCodigoJugador(int codigoJugador) {
        this.codigoJugador = codigoJugador;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jugadores jugadores = (Jugadores) o;
        return codigoJugador == jugadores.codigoJugador && estatura == jugadores.estatura && Objects.equals(nombreJugador, jugadores.nombreJugador) && Objects.equals(puesto, jugadores.puesto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoJugador, nombreJugador, puesto, estatura);
    }

    public Equipos getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipos equipo) {
        this.equipo = equipo;
    }
}
