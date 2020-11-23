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
        
        int[] variable = crearArray(); //aux
        
        for (int i = 0; i < variable.length; i++) {
            System.out.println(variable[i]);
        }
        
        // Recorrido de un array completo en modo lectura
        // foreach
        // En la parte izquierda se pone el tipo de dato que almacena
        // el array y el nombre de una variable (el que quieras)
        // :
        // En la parte derecha se pone el nombre del array que 
        // queremos recorrer
        // Dentro del bucle no se usan índices, se usa la variable
        // "numero"
        for (int numero : array) {
            //System.out.print(" - " + numero);
            if (numero%2==0){
                System.out.println(numero + " es par");
            }
        }
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
    
    public static int[] crearArray(){
        int[] aux = new int[2];
        aux[0] = 1;
        aux[1] = 2;
        
        return aux;
    }
}
