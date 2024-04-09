package com.mycompany.concesionaria.logica;

import com.mycompany.concesionaria.persistencia.ControladoraPersistencia;
import java.util.List;

public class ControladoraLogica {
    
    ControladoraPersistencia controladoraPers = new ControladoraPersistencia();

    public void agregarAutomovil(String modelo, String marca, String motor,
            String color, String patente, String cantidadPuertas) {
   /*Creo la instancia de auto a pasarle a controladora de persistencia con 
   los datos correspondientes*/
    Automovil auto = new Automovil();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantidadPuertas(cantidadPuertas);
        //Le paso a la controladora de persistencia los datos de automovil
        controladoraPers.agregarAutomovil(auto);
    }

    public List<Automovil> traerListaAutos() {
        return controladoraPers.traerListaAutos();
    }

    public void borrarAuto(int idAuto) {
        controladoraPers.borrarAuto(idAuto);
    }

    public Automovil traerAuto(int idAuto) {
        return controladoraPers.traerAuto(idAuto);
    }

    public void modificarAutomovil(Automovil auto, String modelo, 
            String marca, String motor, String color, String patente, 
            String cantidadPuertas) {
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantidadPuertas(cantidadPuertas);
        
        controladoraPers.modificarAuto(auto);
        
    }
    
}
