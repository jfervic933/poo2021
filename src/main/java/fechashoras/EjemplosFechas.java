/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechashoras;

import java.time.LocalDate;

/**
 *
 * @author profesor
 */
public class EjemplosFechas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        LocalDate fechaActual = LocalDate.now();
        System.out.println(fechaActual);
        
        // DateTimeFormatter
        
        LocalDate nov2000 = LocalDate.of(2000,11,23);
        System.out.println(nov2000);
    }
    
}
