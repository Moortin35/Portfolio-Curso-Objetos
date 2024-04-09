package com.mycompany.login.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String nombreUsuario;
    private String contrasenia;
    @ManyToOne
    @JoinColumn(name="fk_rol")
    private Rol rolDeUsuario;

    public Usuario() {
    }

    public Usuario(int id, String nombreUsuario, String contrasenia, Rol rolDeUsuario) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
        this.rolDeUsuario = rolDeUsuario;
    }
    
    public Rol getRolDeUsuario() {
        return rolDeUsuario;
    }

    public void setRolDeUsuario(Rol rolDeUsuario) {
        this.rolDeUsuario = rolDeUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
}
