/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploscomparablecomparator;

import vehiculos.*;

/**
 *
 * @author profesor
 */
public class Vehiculo implements Comparable<Vehiculo>{
    
    // Comparator
    // Comparable
    
    private Long bastidor;
    private String matricula;
    private Marca marca;
    private String modelo;
    private Color color;
    private double precio;
    private boolean disponible;

    public Vehiculo(String matricula, Marca marca, String modelo, Color color, double precio, boolean disponible) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.disponible = disponible;
    }
    
     public Long getBastidor() {
        return bastidor;
    }

    public void setBastidor(Long bastidor) {
        this.bastidor = bastidor;
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

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", precio=" + precio + ", disponible=" + disponible + '}';
    }

    @Override
    public int compareTo(Vehiculo t) {
        return this.getMatricula().compareTo(t.getMatricula());
    }
    
    
    
}
