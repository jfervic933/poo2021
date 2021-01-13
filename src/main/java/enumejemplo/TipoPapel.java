/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumejemplo;

/**
 *
 * @author profesor
 */
public enum TipoPapel {
    
    
    A2(420,594), 
    A3(297, 420), 
    A4(210, 297), 
    A5(148, 210);
    
    private double ancho;
    private double largo;

    // El constructor es privado para que no se puedan crear objetos
    private TipoPapel(double ancho, double largo) {
        this.ancho = ancho;
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public double getLargo() {
        return largo;
    }
    
  
    
}
