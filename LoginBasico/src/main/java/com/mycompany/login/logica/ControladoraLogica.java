package com.mycompany.login.logica;

import com.mycompany.login.persistencia.ControladoraPersistencia;
import java.util.List;

public class ControladoraLogica {
    
    ControladoraPersistencia controladoraPers = new ControladoraPersistencia();

    public String validarUsuario(String usuario, String contrasenia) {
        
        String mensaje = "";
        List<Usuario> listaUsuarios = controladoraPers.traerUsuarios();
        for(Usuario user : listaUsuarios){
            if(user.getUsuario().equals(usuario)){
                if(user.getContrasenia().equals(contrasenia)){
                    mensaje = "Usuario y contraseña correctos. Bievenido/a";
                }
                else{
                    mensaje = "Contraseña incorrecta";
                }
            }
            else{
                mensaje = "Usuario no encontrado";
            }
        }
        return mensaje;
    }

    public void registrar(String usuario, String contrasenia) {
        Usuario user = new Usuario();
        user.setUsuario(usuario);
        user.setContrasenia(contrasenia);
        controladoraPers.registrar(user);
    }

    public boolean corroborarExistenciaUsuario(String usuario) {
        boolean existeUsuario = false;
        List<Usuario> listaUsuarios = controladoraPers.traerUsuarios();
        for(Usuario user : listaUsuarios){
            if(user.getUsuario().equals(usuario)){
                existeUsuario = true;
            }  
        }
        return existeUsuario;
    }
}
