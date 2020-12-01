/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rueda;

/**
 *
 * @author profesor
 */
public class PruebaRueda {
    
    public static void main(String[] args) {
        
        Rueda r =  new Rueda();
        Rueda r2 = new Rueda(25, 1000, "Invierno");
        Rueda r3 = new Rueda(29, 400, "Verano");
        
        System.out.println(r3);
        r3.desinflar();
        System.out.println(r3);
        System.out.println(r2);
        r2.inflar(1250);
        System.out.println(r2);
        
        System.out.println(r);
        r.cambiarTipo("veranillo");
        System.out.println(r);
    }
    
}
