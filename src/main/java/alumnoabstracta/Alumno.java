/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnoabstracta;

/**
 *
 * @author profesor
 */
public abstract class Alumno {
    
    private String nombre, apellido, nif, email;

    public Alumno(String nombre, String apellido, String nif, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nif = nif;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", nif=" + nif + ", email=" + email + '}';
    }
    
    // Un método abstracto no tiene código porque se implementa
    // en las subclases
    // Si se incluye un método abstract entonces la clase debe
    // ser abstract
    public abstract void estudiar();
    
}
