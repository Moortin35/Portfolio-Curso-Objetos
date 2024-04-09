package com.mycompany.peluqueriacanina.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Mascota implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int numCliente;
    private String nombre;
    private String raza;
    private String color;
    private String alergico;
    private String atencionEsp;
    private String observaciones;
    @OneToOne
    private Duenio persona;

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public String getAtencionEsp() {
        return atencionEsp;
    }

    public void setAtencionEsp(String atencionEsp) {
        this.atencionEsp = atencionEsp;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Duenio getPersona() {
        return persona;
    }

    public void setPersona(Duenio persona) {
        this.persona = persona;
    }

    public Mascota(int numCliente, String nombre, String raza, 
            String color, String alergico, String atencionEsp, 
            String observaciones, Duenio persona) {
        this.numCliente = numCliente;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atencionEsp = atencionEsp;
        this.observaciones = observaciones;
        this.persona = persona;
    }

    public Mascota() {
    }
    
    
}
