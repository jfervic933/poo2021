/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import vehiculos.*;

/**
 *
 * @author profesor
 */
public class Vehiculo {
    
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double precio;
    private boolean disponible;

    public void arrancar(){
        System.out.println("Este vehículo está arrancando...");
    }
    
    // Sobrecarga de métodos reparar
    public void reparar(){
        System.out.println("El vehículo está en el taller");
    }
    
    public void reparar(int horas){
        System.out.println("El vehículo está en el taller " + horas 
        + " horas");
    }
    
    public Vehiculo(String matricula, String marca, String modelo, String color, double precio, boolean disponible) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.disponible = disponible;
    }
    
    public Vehiculo(){
        this.matricula = "";
        this.marca = "Sin marca";
        this.modelo = "Sin  modelo";
        this.color = "Sin color";
        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }



    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

 

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", precio=" + precio + ", disponible=" + disponible + '}';
    }
    
    
    
}
