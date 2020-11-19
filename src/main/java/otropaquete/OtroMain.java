/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otropaquete;

import jcarlos.poo.Galleta;
import jcarlos.poo.Persona;

/**
 *
 * @author profesor
 */
public class OtroMain {
    
    public static void main(String[] args) {
        Galleta gall = new Galleta();
        
        Persona juan = new Persona("Juan", 25, 50);
        Persona luisa = new Persona("Luisa", 225, 350);
        
        System.out.println("Edad Luisa? " + luisa.getEdad());
        System.out.println("Peso Luisa? " + luisa.getPeso());
        System.out.println("Edad Juan? " + juan.getEdad());
        
        juan.setEdad(10);
        
        System.out.println("Edad Juan? " + juan.getEdad());
        
        luisa.peso = 1000;
        luisa.setEdad(45);
        luisa.setNombre("María Luisa");
        int edadJuan = juan.getEdad();
        int edadLuisa = luisa.getEdad();
        
        System.out.println("Nombre de luisa " + luisa.getNombre());
        
        System.out.println("Entre los dos suman " + 
                (edadJuan + edadLuisa));
        
        // Declaración sin instanciación
        Persona yo = null; // Apunta a null porque no lo he construido
        // Intento acceder a atrib o métodos de un objeto que apunta a
        // null
        yo.setEdad(10); // Nullpointer
        
    }
    
}
