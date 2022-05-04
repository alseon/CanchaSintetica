/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Usuario
 */
@Entity
@Table (name = "reservations")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    //IDENTITY
    private Long id ;
    private String nombre;
    private int hora;
    public Date fecha;

    public Reservation() {
    }

    public Reservation(Long id, String nombre, int hora, Date fecha) {
        this.id = id;
        this.nombre = nombre;
        this.hora = hora;
        this.fecha = fecha;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHora() {
        return hora;
    }

    public Date getFecha() {
        return fecha;
    }
}
