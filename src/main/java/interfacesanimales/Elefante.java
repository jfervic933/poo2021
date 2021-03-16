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
public class Elefante extends Animal{

    public Elefante(double peso) {
        super(peso);
    }

    public void llenarTrompa(){
        System.out.println("Me estoy duchando");
    }
    
    @Override
    public void comer() {
        System.out.println("Comiendo como un elefante");
    }
    
}
