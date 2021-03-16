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

// Si una clase abstracta hereda de otra clase abstracta
// no está obligada a implentar los métodos abstractos
public abstract class Felino extends Animal{

    public Felino(double peso) {
        super(peso);
    }
    
    public abstract void cazar();
    
    
}
