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
public class Motor {
    
    private boolean estado; // true es arrancado
    private int numeroCilindros;

    public Motor(boolean estado, int numeroCilindros) {
        this.estado = estado;
        this.numeroCilindros = numeroCilindros;
    }
    
    public Motor(){
        
    }
    
    public void arrancar(){
        this.estado = true;
    }

    public void apagar(){
        this.estado = false;
    }
    
    public boolean isEstado() {
        return estado;
    }

//    public void setEstado(boolean estado) {
//        this.estado = estado;
//    }

    public int getNumeroCilindros() {
        return numeroCilindros;
    }

    public void setNumeroCilindros(int numeroCilindros) {
        this.numeroCilindros = numeroCilindros;
    }

    @Override
    public String toString() {
        return "Motor{" + "estado=" + estado + ", numeroCilindros=" + numeroCilindros + '}';
    }

    
}
