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
public class Puerta {

    private boolean estado; // true abierta
    // Composición de clases
    // Se crea una clase usando atributos de otra clase
    private Ventana ventana;

    public Puerta(boolean estado, Ventana ventana) {
        this.estado = estado;
        this.ventana = ventana;
    }

    public Puerta() {

    }

    public void abrir() {
        this.estado = true;
    }

    public void cerrar() {
        this.estado = false;
    }

    public boolean isEstado() {
        return estado;
    }

//    public void setEstado(boolean estado) {
//        this.estado = estado;
//    }
    public Ventana getVentana() {
        return ventana;
    }

    public void setVentana(Ventana ventana) {
        this.ventana = ventana;
    }

    @Override
    public String toString() {
        return "Puerta{" + "estado=" + estado + ", ventana=" + ventana + '}';
    }


}
