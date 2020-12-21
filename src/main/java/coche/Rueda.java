/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coche;

/**
 *
 * @author profesor
 */
public class Rueda {
    
    private boolean estado; // True es inflada
    private String tipo; // Invierno o Verano

    public Rueda(boolean estado, String tipo) {
        this.estado = estado;
        this.tipo = tipo;
    }

    public Rueda() {
    }
    
    public void inflar(){
        this.estado = true;
    }
    
    public void desinflar(){
        this.estado = false;
    }

    public boolean isEstado() {
        return estado;
    }

//    public void setEstado(boolean estado) {
//        this.estado = estado;
//    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Rueda{" + "estado=" + estado + ", tipo=" + tipo + '}';
    }

    
}
