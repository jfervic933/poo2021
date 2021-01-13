/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumejemplo;

import jcarlos.poo.Persona;

/**
 *
 * @author profesor
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TipoPapel folio = TipoPapel.A4;
        
        System.out.println("El ancho del folio es " + folio.getAncho());
        
        Carta reyesMagos = new Carta(new Persona("Yo", 25, 76), 
                                    new Persona("Melchor", 1000, 0), 
                                    TipoPapel.A3, 
                                    "Mis deseos", 
                                    "Queridos Reyes Magos....");
        
        System.out.println("Ancho de la carta enviada " + reyesMagos.getTipoPapel().getAncho());
    }
    
}
