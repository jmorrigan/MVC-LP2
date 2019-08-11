/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcjdob;

import mvcjdob.controlador.Controlador;
import mvcjdob.modelo.Modelo;

/**
 *
 * @author dasho
 */
public class MVCJDOB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Modelo modelo = new Modelo();
     Principal principal = new Principal();
     Controlador controlador = new Controlador(modelo, principal);
     principal.setVisible(true);
    }
    
}
