/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author profesor
 */
public class Prueba {
    
    public static void main(String[] args) {
        
        int resultado = NumerosEnteros.sumar(3, 7);
        
        System.out.println("Resultado " + resultado);
        
        NumerosEnteros x = new NumerosEnteros();
        x.saludar();
        
        resultado = NumerosEnteros.multiplicar(2, 3);
        
        System.out.println("Resultado " + resultado);
        
        NumerosReales nr1 = new NumerosReales(3.4);
        System.out.println(nr1);
        nr1.sumar(5);
        System.out.println(nr1);
        nr1.dividir(2);
        System.out.println(nr1);
        
    }
    
}
