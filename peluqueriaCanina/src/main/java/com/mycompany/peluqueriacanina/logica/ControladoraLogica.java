package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;

public class ControladoraLogica {
    
    ControladoraPersistencia controladoraPersis = 
            new ControladoraPersistencia();

    public void guardar(String nombreMascota, String razaMascota, 
            String colorMascota, String observaciones, String nombreDueño, 
            String celDueño, String esAlergico, String atencionEspecial) {
    
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDueño);
        duenio.setCelular(celDueño);
        
        Mascota mascota = new Mascota();
        mascota.setNombre(nombreMascota);
        mascota.setRaza(razaMascota);
        mascota.setColor(colorMascota);
        mascota.setObservaciones(observaciones);
        mascota.setAlergico(esAlergico);
        mascota.setAtencionEsp(atencionEspecial);
        mascota.setPersona(duenio);
        
        controladoraPersis.guardar(duenio, mascota);
    }

    public List<Mascota> traerMascotas() {
        return controladoraPersis.traerMascotas();
    }

    public void borrarMascota(int numCliente, Mascota masco) {
        controladoraPersis.borrarMascota(numCliente);
        Duenio duenio = this.buscarDuenio(masco.getPersona().getId());
        controladoraPersis.borrarDuenio(duenio);
        
    }

    public Mascota traerMascota(int numCliente) {
        return controladoraPersis.traerMascota(numCliente);
    }

    public void modificarMascota(Mascota masco, String nombreMascota,
            String razaMascota, String colorMascota, String observaciones,
            String nombreDuenio, String celDuenio, String esAlergico,
            String atencionEspecial) {
        
        masco.setNombre(nombreMascota);
        masco.setColor(colorMascota);
        masco.setRaza(razaMascota);
        masco.setObservaciones(observaciones);
        masco.setAlergico(esAlergico);
        masco.setAtencionEsp(atencionEspecial);
        //Modifico mascota
        controladoraPersis.modificarMascota(masco);
        
        Duenio duenio = this.buscarDuenio(masco.getPersona().getId());
        duenio.setNombre(nombreDuenio);
        duenio.setCelular(celDuenio);
        //Llamar al modificar Dueño
        this.modificarDuenio(duenio);
    }

    private Duenio buscarDuenio(int id) {
        return controladoraPersis.buscarDuenio(id);
    }

    private void modificarDuenio(Duenio duenio) {
        controladoraPersis.modificarDuenio(duenio);
    }
    
}
