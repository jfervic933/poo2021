/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

/**
 *
 * @author profesor
 */
public class EjemploEnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vehiculo ferrari = new Vehiculo("1234FFF", Marca.FERRARI, "LaFerrari", Color.DORADO, 900, true);
        
        System.out.println(ferrari);
        
        
        
    }
    
}
