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
    // Visibilidad de atributos: 
    // por defecto --> todas las clases del paquete
    // public --> todas las clases (cualquier paquete)
    // private --> no permite ver desde ninguna clase
    // protected --> clases del paquete y subclases
    
    private String forma; // Redonda, cuadrada
    private String sabor; // Mantequilla, fresa, 
    private String color; // Marrón, blanca, etc
    private boolean tieneChocolate; // True si, false no
    private double gramos; // 15, 20, 34 gr
    private double precio;
    
    // Métodos
    
    // Constructor parametrizado de galleta
    public Galleta(String forma, String sabor, String color, boolean
            tieneChoco, double gr, double precio){
        // La forma de este objeto (this) igual a la forma del parámetro
        this.forma = forma;
        this.sabor = sabor;
        this.color = color;
        this.tieneChocolate = tieneChoco;
        this.gramos = gr;
        this.precio = precio;
                
    }
    
    public Galleta(double gramos, double precio){
        this.forma = "Redonda";
        this.sabor = "Chocolate";
        this.color = "Blanco";
        this.tieneChocolate = true;
        this.gramos = gramos;
        this.precio = precio;
    }
    
    public Galleta(){
        this.forma = "";
        this.sabor = "";
        this.color = "";
        this.tieneChocolate = true;
        this.gramos = 0;
        this.precio = 0;
    }
    
    
    // Métodos getter y setter

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        // Sólo admito cuadradas y redondas
        if (forma.equalsIgnoreCase("Redonda")||
                forma.equalsIgnoreCase("Cuadrada")){
            this.forma = forma;
        }
        
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getTieneChocolate() {
        return tieneChocolate;
    }

    public void setTieneChocolate(boolean tieneChocolate) {
        this.tieneChocolate = tieneChocolate;
    }

    public double getGramos() {
        return gramos;
    }

    public void setGramos(double gramos) {
        // No permito galletas más pesadas de 100gr
        if (gramos<=100){
            this.gramos = gramos;
        }
        
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
