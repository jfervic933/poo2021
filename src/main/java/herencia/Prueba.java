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
        
        
    }
    
}
