/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcarlos.poo;

/**
 *
 * @author profesor
 */

// Declaración de una clase
public class Galleta {
    
    // Dos partes
    // Atributos de la clase
    
    String forma; // Redonda, cuadrada
    String sabor; // Mantequilla, fresa, 
    String color; // Marrón, blanca, etc
    boolean tieneChocolate; // True si, false no
    double gramos; // 15, 20, 34 gr
    
    // Métodos
    
    // Constructor de galleta
    public Galleta(String forma, String sabor, String color, boolean
            tieneChoco, double gr){
        // La forma de este objeto (this) igual a la forma del parámetro
        this.forma = forma;
        this.sabor = sabor;
        this.color = color;
        this.tieneChocolate = tieneChoco;
        this.gramos = gr;
                
    }
    
}
