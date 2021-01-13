/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coche;

/**
 *
 * @author profesor
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Motor m1 = new Motor(true, 6);
        Motor m2 = new Motor(false, 4);

        Rueda r1 = new Rueda(true, "Invierno");
        Rueda r2 = new Rueda(true, "Verano");

        Ventana v1 = new Ventana(false, true);
        Ventana v2 = new Ventana(true, true);
        
        Puerta p1 = new Puerta(false, v1);
        Puerta p2 = new Puerta(true, v2);
        
        System.out.println(p1);
        
        // Abrir la ventana de la puerta p1
        // p1.getVentana() --> ventana
        
        p1.getVentana().abrir();
        
        CocheProfesor c1 = new CocheProfesor(m2, 
                r1, r2, new Rueda(), new Rueda(true, "Invierno"), 
                p1, p2);
        
        CocheProfesor c2 = new CocheProfesor(new Motor(true, 12));
        System.out.println(c1);
        
        // Cerrar la ventana de la puerta del copiloto del coche c1
        c1.getPuertaCopiloto().getVentana().cerrar();
        // Rueda trasera izquierda establecer su tipo a Invierno
        c1.getRuedaTI().setTipo("Invierno");
        // Abrir la puerta del piloto
        c1.getPuertaPiloto().abrir();
        
        System.out.println(c1);
        
        // Apagar el motor de c2
        c2.getMotor().apagar();
        // Poner rueda delantera izquierda a c2
        c2.setRuedaDI(new Rueda(true, "Verano"));
        // Desinflar la rueda delantera izquierda de c2
        c2.getRuedaDI().desinflar();
        
        System.out.println(c2);
    }

}
