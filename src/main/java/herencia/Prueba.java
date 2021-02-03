/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.ArrayList;

/**
 *
 * @author profesor
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vehiculo ferrari = new Vehiculo("1234FFF", "Ferrari", "LaFerrari", 
                "Rojo", 900, true);
        
        
        System.out.println(ferrari);
        
        Turismo t = new Turismo(5, true, "1111AAA", "Chevrolet", "Impala", "Negro", 123.30, true);
        // Turismo tiene acceso a sus propios métodos públicos y a los
        // de vehículo, ya que es una subclase de ésta
        System.out.println("La matrícula del turismo es " + t.getMatricula());
        
        System.out.println(t.toString());
        
        // arrancar es polimórfico porque dependiendo del tipo de objeto
        // que lo llame se ejecuta un código u otro
        t.arrancar();
        
        Deportivo d = new Deportivo(5, "1111BBB", "Ford", "Focus", "Negro", 13.30, true);
        
        // Ejecuta el toString de vehículo porque Deportivo no 
        // lo tiene implementado
        System.out.println(d.toString());
        
        d.arrancar();
        t.reparar();
        d.reparar();
        t.reparar(2);
        
        // Conversión de tipos en una jerarquía de herencia
        Vehiculo v1 = new Vehiculo();
        // Conversión implícita
        Vehiculo v2 = new Turismo(0, true, "1111AAA", "Chevrolet", "Impala", "Negro", 123.30, true);
        Vehiculo v3 =  new Deportivo();
        
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
        
        listaVehiculos.add(v1);
        // Conversiones implícitas entre la jerarquía
        listaVehiculos.add(v2);
        listaVehiculos.add(v3);
        listaVehiculos.add(new Turismo());
        listaVehiculos.add(new Deportivo(5, "1111BBB", "Ford", "Focus", "Rojo", 13.30, true));
       
        System.out.println("-----------------------------");
        for (Vehiculo aux : listaVehiculos) {
            System.out.println(aux);   
            aux.arrancar();
            // Conversiones explícitas
            if (aux instanceof Turismo){
                ((Turismo) aux).activarVelocidadCrucero();
            }
            if (aux instanceof Deportivo){
                Deportivo tmp = (Deportivo) aux;
                tmp.activarModoSport();
            }
        }
        
        
    }
    
}
