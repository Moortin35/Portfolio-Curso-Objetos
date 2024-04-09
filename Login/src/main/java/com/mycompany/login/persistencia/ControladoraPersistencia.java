package com.mycompany.login.persistencia;

import com.mycompany.login.logica.Rol;
import com.mycompany.login.logica.Usuario;
import com.mycompany.login.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    UsuarioJpaController usuarioJPA = new UsuarioJpaController();
    RolJpaController rolJPA = new RolJpaController();

    public List<Usuario> traerUsuarios() {
        return usuarioJPA.findUsuarioEntities();
    }

    public void registrar(Usuario usuario) {
        usuarioJPA.create(usuario);
    }

    public List<Rol> traerRoles() {
        return rolJPA.findRolEntities();
    }

    public void borrarUsuario(int idUser) {
        try {
            usuarioJPA.destroy(idUser);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario traerUsuario(int idUser) {
        return usuarioJPA.findUsuario(idUser);
    }

    public void editarUsuario(Usuario usr) {
        try {
            usuarioJPA.edit(usr);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
