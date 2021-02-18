/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnoabstracta;

import java.util.ArrayList;

/**
 *
 * @author profesor
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // No se pueden instanciar objetos de la clase abstracta
        // No puedo hacer new Alumno()
        // Debo intanciar con las subclases
        AlumnoUni a1 = new AlumnoUni(23,"pepe", "ape", "222", "a@a.com");
        Alumno a2 = new AlumnoUni(24,"pep", "apell", "222", "a@a.com");
        
        ArrayList<Alumno> lista = new ArrayList<>();
        lista.add(a1);
        lista.add(new AlumnoPost(false,0,"pep", "apell", "222", "a@a.com"));
        
        for (Alumno alumno : lista) {
            alumno.estudiar();
        }
   
    }
    
}
