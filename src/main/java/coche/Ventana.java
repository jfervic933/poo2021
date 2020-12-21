/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coche;

/**
 *
 * Java Beans (Judías)
 */
public class Ventana {
    
    private boolean estado; // True abierta
    private boolean tintada; //True si

    @Override
    public String toString() {
        return "Ventana{" + "estado=" + estado + ", tintada=" + tintada + '}';
    }

    public Ventana(boolean estado, boolean tintada) {
        this.estado = estado;
        this.tintada = tintada;
    }

    public Ventana() {
    }

    public void abrir(){
        this.estado = true;
    }
    
    public void cerrar(){
        this.estado = false;
    }
    
    public boolean isEstado() {
        return estado;
    }

//    public void setEstado(boolean estado) {
//        this.estado = estado;
//    }

    public boolean isTintada() {
        return tintada;
    }

    public void setTintada(boolean tintada) {
        this.tintada = tintada;
    }
    
    
    
}
