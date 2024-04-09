package com.mycompany.concesionaria;

import com.mycompany.concesionaria.igu.Principal;

public class Concesionaria {

    public static void main(String[] args) {
        //Llamamos y hacemos visible a nuestra interfaz.
        Principal pantallaPrincipal = new Principal();
        pantallaPrincipal.setVisible(true);
        pantallaPrincipal.setLocationRelativeTo(null);
    }
}
