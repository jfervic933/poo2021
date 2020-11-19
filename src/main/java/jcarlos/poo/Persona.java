/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcarlos.poo;

/**
 *
 * Sólo se pueden crear personas entre 0 y 199 años
 * y además el peso estará limitado entre 3kg y 300 kg
 */
public class Persona {
    
    private String nombre;
    private int edad;
    public double peso; // Kg

    public Persona(String name, int old, double peso) {
        this.nombre = name;
        this.edad = old;
        this.peso = peso;
        
        if (old <0 || old > 199){
            this.edad = 1; // Un año
        }
        if (peso <3 || peso > 300){
            this.peso = 3; // tres kilos
        }

    }
    
    // this siempre hace referencia a los atributos y métodos
    // de la propia clase. Hace referencia al propio objeto

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad>=0 && edad <= 199){
            this.edad = edad;
        }
        
    }

    // Un método get siempre devuelve el mismo tipo de dato
    // que el atributo al que hace referencia
    // Dentro el método hace return del atributo de la clase
    public double getPeso() {
        return peso;
    }

    // Un método set nunca devuelve valor (void)
    // Recibe un parámetro con el tipo de dato igual al 
    // tipo de dato al que hace referencia
    // Dentro tiene la asignación al atributo del parámetro
    public void setPeso(double x) {
        this.peso = x;
    }
    
    public void comer(Galleta g){
        System.out.println("Persona " + this.nombre + " "
                + "se está comiendo una galleta que pesa " + g.getGramos());
        this.peso += g.getGramos();
    }
}
