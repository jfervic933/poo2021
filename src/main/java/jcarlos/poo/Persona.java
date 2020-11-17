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
public class Persona {
    
    private String nombre;
    private int edad;
    private double peso; // Kg

    public Persona(String name, int old, double peso) {
        this.nombre = name;
        this.edad = old;
        this.peso = peso;
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
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public void comer(Galleta g){
        System.out.println("Persona " + this.nombre + " "
                + "se está comiendo una galleta que pesa " + g.getGramos());
        this.peso += g.getGramos();
    }
}
