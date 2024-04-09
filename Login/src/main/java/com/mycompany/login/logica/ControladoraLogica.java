package com.mycompany.login.logica;

import com.mycompany.login.persistencia.ControladoraPersistencia;
import java.util.List;

public class ControladoraLogica {
    
    ControladoraPersistencia controladoraPers = new ControladoraPersistencia();

    public Usuario validarUsuario(String nombreUsuario, String contrasenia) {
        
        Usuario usr = null;
        List<Usuario> listaUsuarios = controladoraPers.traerUsuarios();
        for(Usuario user : listaUsuarios){
            if(user.getNombreUsuario().equals(nombreUsuario)){
                if(user.getContrasenia().equals(contrasenia)){
                    usr = user;
                }
            }
        }
        return usr;
    }

    public void registrar(String nombreUsuario, String contrasenia, String rolRecibido) {
        Usuario user = new Usuario();
        
        user.setNombreUsuario(nombreUsuario);
        user.setContrasenia(contrasenia);
        Rol rolEncontrado = new Rol();
        rolEncontrado = this.traerRol(rolRecibido);
        if(rolEncontrado!=null){
            user.setRolDeUsuario(rolEncontrado);
        }
        int id = this.buscarUltimoIdUsuario();
        user.setId(id+1);
        controladoraPers.registrar(user);
    }

    public boolean corroborarExistenciaUsuario(String nombreUsuario) {
        boolean existeUsuario = false;
        List<Usuario> listaUsuarios = controladoraPers.traerUsuarios();
        for(Usuario user : listaUsuarios){
            if(user.getNombreUsuario().equals(nombreUsuario)){
                existeUsuario = true;
            }  
        }
        return existeUsuario;
    }

    public String validarRol(String usuario, String contrasenia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<Usuario> traerUsuarios() {
        return controladoraPers.traerUsuarios();
    }

    public List<Rol> traerRoles() {
        return controladoraPers.traerRoles(); 
    }

    private Rol traerRol(String rolRecibido) {
        
        Rol rolcito = null;
        List<Rol> listaRoles = controladoraPers.traerRoles();
        for(Rol rol : listaRoles){
            if(rol.getNombreRol().equals(rolRecibido)){
                rolcito = rol;
            }
        }
        return rolcito;
    }
    
    private int buscarUltimoIdUsuario(){
        //Obtengo la lista de usuarios
       List<Usuario> listaUsuarios = this.traerUsuarios();
       //Obtengo el indice del ultimo usuario de la lista
       int indiceUltimoUsuario = listaUsuarios.size()-1;
       //obtengo el usuario a traves del indice
       Usuario usr = listaUsuarios.get(indiceUltimoUsuario);
       // retorno el id
       return usr.getId();
    }

    public void borrarUsuario(int idUser) {
        controladoraPers.borrarUsuario(idUser);
    }

    public Usuario traerUsuario(int idUser) {
        return controladoraPers.traerUsuario(idUser);
    }

    public void editarUsuario(Usuario usr, String nombreUsuario, String contrasenia, String rol) {
        usr.setNombreUsuario(nombreUsuario);
        usr.setContrasenia(contrasenia);
        usr.setRolDeUsuario(traerRol(rol));
        controladoraPers.editarUsuario(usr);
    }
}
