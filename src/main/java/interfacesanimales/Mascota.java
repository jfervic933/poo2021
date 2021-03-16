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
public interface Mascota {
    
    // Si hay atributos son public, static y final
    
    // Por defecto todos los métodos de una interfaz son public, abstract
    public abstract boolean jugar(int minutosJuego);
    
    // Este
    public default void vacunar(){
        System.out.println("Vacunando como mascota");
    }
    
}
