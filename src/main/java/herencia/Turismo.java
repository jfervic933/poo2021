/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author profesor
 */
public class Turismo extends Vehiculo{
    
    private int numeroPuertas;
    private boolean marchaAutomatica;

    public Turismo(int numeroPuertas, boolean marchaAutomatica, String matricula, String marca, String modelo, String color, double precio, boolean disponible) {
        // Constructor parametrizado de la super clase (padre)
        super(matricula, marca, modelo, color, precio, disponible);
        // Inicialización de atributos propios
        this.numeroPuertas = numeroPuertas;
        this.marchaAutomatica = marchaAutomatica;
    }
    
    public Turismo(){
        // Llamada al constructor por defecto de la super clase
        super();
        this.numeroPuertas = 4;
        this.marchaAutomatica = true;
    }

    public int getNumeroPuertas() {

        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public boolean isMarchaAutomatica() {
        return marchaAutomatica;
    }

    public void setMarchaAutomatica(boolean marchaAutomatica) {
        this.marchaAutomatica = marchaAutomatica;
    }

    // Sobrescribe el toString de vehiculo
    @Override
    public String toString() {
        String atributosVehiculo = super.toString();
        return atributosVehiculo+"\nTurismo{" + "numeroPuertas=" + numeroPuertas + ", marchaAutomatica=" + marchaAutomatica + '}';
    }
    
    
    @Override
    public void arrancar(){
        System.out.println("Este turismo está arrancando...");
    }
    
    
}
