/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcjdob.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import mvcjdob.Principal;
import mvcjdob.modelo.Modelo;

/**
 *
 * @author dasho
 */
public class Controlador implements ActionListener{
    private final Modelo modelo;
    private final Principal panel;

   
    public Controlador(Modelo modelo, Principal panel) {
        this.modelo = modelo;
        this.panel = panel;
        this.panel.BGuardar.addActionListener(this);
        
    }
    
    
    /**
     *metodo que dispara el evento del botón para realizar la operacion
     */
    @Override
    public void actionPerformed(ActionEvent e) {
       modelo.setNumeroA(Integer.parseInt(panel.JTNota.getText()));
       modelo.setNumeroB(Integer.parseInt(panel.JTNota2.getText()));
       if(e.getSource() == panel.BGuardar) modelo.Sumar();
       
       panel.JResultados.append("SUMA = " + String.valueOf(modelo.getResultado()) + "\n");
       
    }
    
    
}
