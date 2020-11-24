/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author profesor
 */
public class Persona {
    
    private String nombre;
    private String ape1;
    private String ape2;
    private String nif;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, String ape1, String ape2, String nif, int edad) {
        this.nombre = nombre;
        this.ape1 = ape1;
        this.ape2 = ape2;
        this.nif = nif;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApe1() {
        return ape1;
    }

    public void setApe1(String ape1) {
        this.ape1 = ape1;
    }

    public String getApe2() {
        return ape2;
    }

    public void setApe2(String ape2) {
        this.ape2 = ape2;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", ape1=" + ape1 
                + ", ape2=" + ape2 + ", nif=" + nif 
                + ", edad=" + edad + '}';
    }
    
    
    
}
