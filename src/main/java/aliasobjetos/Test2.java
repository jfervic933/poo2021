/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aliasobjetos;

/**
 *
 * @author carlos
 */
public class Test2 {

    public static void main(String[] args) {

        // La variable llamada "array" apunta a una zona de memoria
        // que contiene 5 valores de tipo int.
        // Cada elemento es accesible usando array[i], siendo i un número
        // entre 0 y 4 (las posiciones válidas del array)
        int[] array = {20, 10, 30, 50, 45};
        
        System.out.println("-------------------------");
        
        imprimirArray(array);
        
        System.out.println("-------------------------");
        
        cambiaValores(array);
        
        System.out.println("-------------------------");
        
        imprimirArray(array);
        
    }
    
    public static void cambiaValores(int[] alias) {
        alias[3] = 34;
        alias[4] = 23;
    }
    
    public static void imprimirArray(int[] alias) {
        for (int i = 0; i < alias.length; i++) {
            System.out.println("alias[" + i + "] = " + alias[i]);
        }
    }
}
