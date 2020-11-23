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
public class Test {

    public static void main(String[] args) {

        // La variable llamada "array" apunta a una zona de memoria
        // que contiene 5 valores de tipo int.
        // Cada elemento es accesible usando array[i], siendo i un número
        // entre 0 y 4 (las posiciones válidas del array)
        int[] array = {20, 10, 30, 50, 45};

        // Se imprime el contenido de la posición 2 de array
        System.out.println("array[2] = " + array[2]);
        System.out.println("-------------------------");

        // Se imprime el array completo usando un for
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }

        System.out.println("-------------------------");
        // Se crea una referencia de tipo int array apuntando a null
        int[] array2;

        // Se crea un "alias", de forma que array2 y array apuntan a la
        // misma zona de memoria
        array2 = array; // Es igual que int[] array2 = array;

        // "array" y "array2" acceden al mismo espacio y al mismo contenido
        System.out.println("array2[2] = " + array2[2]);
        System.out.println("-------------------------");

        System.out.println("array2[4] = " + array2[4]);
        System.out.println("array[4] = " + array[4]);
        System.out.println("-------------------------");

        // Se modifican los valores con cualquiera de las dos variables
        array[1] = 12;
        array2[0] = 23;

        // Se imprime el array con una variable
        System.out.println("-------------------------");

        // Se imprime el array completo usando la variable array
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }

        // Se imprime el array con una variable
        System.out.println("-------------------------");

        // Se imprime el array completo usando la variable array2
        for (int i = 0; i < array2.length; i++) {
            System.out.println("array2[" + i + "] = " + array2[i]);
        }
    }

}
