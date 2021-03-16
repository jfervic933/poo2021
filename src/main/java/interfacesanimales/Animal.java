/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesanimales;

/**
 *
 * @author profesor
 */

public abstract class Animal {

    private double peso;

    public Animal(double peso) {
        this.peso = peso;
    }
    
    public abstract void comer();

    /**
     * Get the value of peso
     *
     * @return the value of peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Set the value of peso
     *
     * @param peso new value of peso
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

}
