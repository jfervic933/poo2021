/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

/**
 *
 * @author profesor
 */
public class Prueba {
    
    public static void main(String[] args) {
        int entero = Aleatorios.enteroAleatorio();
        System.out.println("El número es " + entero);
        
        int entero2 = Aleatorios.enteroRango(10, 20);
        System.out.println("El número es " + entero2);
        
        char letraMinus = Aleatorios.letraMinuscula();
        System.out.println("La letra minúscula es " + letraMinus);
        
        char letraMayus = Aleatorios.letraMayuscula();
        System.out.println("La letra minúscula es " + letraMayus);
        
        int numeroPorTeclado = Teclado.leerEntero();
        System.out.println("Número leído " + numeroPorTeclado);
    }
    
}
