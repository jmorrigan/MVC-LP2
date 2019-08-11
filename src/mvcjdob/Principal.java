/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcjdob;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author dasho
 */
public class Principal extends JFrame {
    public JLabel LEtiqueta = new JLabel ("      Datos a Sumar:");
    public JTextField  JTNota = new JTextField ();
    public JTextField  JTNota2 = new JTextField ();
    public JButton BGuardar = new JButton ("Sumar");
    public JTextArea JResultados = new JTextArea ();
    
    public Principal(){
        setSize(145, 450);
        setTitle("SUMAS");
        setLocation(800, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        setBackground(Color.darkGray);
        
        LEtiqueta.setBounds(10, 10, 120, 20);
        LEtiqueta.setForeground(Color.BLACK);
        add(LEtiqueta);
        
        JTNota.setBounds(10, 50, 20, 20);
        add(JTNota);
        
        JTNota2.setBounds(110, 50, 20, 20);
        add(JTNota2);
        
        BGuardar.setBounds(10, 80 , 120, 20);
        BGuardar.setBackground(Color.BLACK);
        BGuardar.setForeground(Color.WHITE);
        add(BGuardar);
        
        JResultados.setBounds(10, 110, 120, 300);
        JResultados.setForeground(Color.red);
        add(JResultados);
        
        setVisible(true);
    }
    
}
