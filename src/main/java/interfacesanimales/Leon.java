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
public class Leon extends Felino{

    public Leon(double peso) {
        super(peso);
    }
    
    public void rugir(){
        System.out.println("Grrrrrrr");
    }

    @Override
    public void cazar() {
        System.out.println("Cazando como un león");
        
    }

    @Override
    public void comer() {
        System.out.println("Comiendo como un león");
    }
    
}
