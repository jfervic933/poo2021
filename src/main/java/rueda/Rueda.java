/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rueda;

/**
 *
 * @author profesor
 */
public class Rueda {
    
    private double diametro;
    private double presion; // presion que tiene la rueda
    private double presionMax;
    private String tipo;

    public void inflar(double presionNueva){
        this.presion = presionNueva;
    }
    
    public void desinflar(){
        this.presion = 0;
    }
    
    public void cambiarTipo(String tipoNuevo){
        if (tipoNuevo.equalsIgnoreCase("VeRano") || 
                tipoNuevo.equalsIgnoreCase("Invierno")){
            this.tipo = tipoNuevo;
        }
    }
    
    public Rueda(double diametro, double presion, String tipo) {
        this.diametro = diametro;
        this.presion = presion;
        
        if (tipo.equalsIgnoreCase("VeRano") || 
                tipo.equalsIgnoreCase("Invierno")){
            this.tipo = tipo;
        }
    }

    public Rueda() {
    }

    
    
    @Override
    public String toString() {
        return "Rueda{" + "diametro=" + diametro + ", presion=" + presion + ", tipo=" + tipo + '}';
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getPresion() {
        return presion;
    }

    public void setPresion(double presion) {
        this.presion = presion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
