/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcjdob.modelo;

/**
 *
 * @author dasho
 */
public class Modelo {
    private int numeroA;
    private int numeroB;
    private int resultado;

    /**
     *
     */
    public Modelo() {
    }
    
    /**
     * Metodo utilizado para hacer la suma
     * @return
     */
    public int Sumar(){
        resultado = numeroA + numeroB;
        return resultado;
    }
    
    /**
     *
     * @return
     */
    public int getNumeroA() {
        return numeroA;
    }

    /**
     *
     * @param numeroA
     */
    public void setNumeroA(int numeroA) {
        this.numeroA = numeroA;
    }

    /**
     *
     * @return
     */
    public int getNumeroB() {
        return numeroB;
    }

    /**
     *
     * @param numeroB
     */
    public void setNumeroB(int numeroB) {
        this.numeroB = numeroB;
    }

    /**
     *
     * @return
     */
    public int getResultado() {
        return resultado;
    }

    /**
     *
     * @param resultado
     */
    public void setResultado(int resultado) {
        this.resultado = resultado;
    }    
    
}
