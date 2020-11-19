/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author profesor
 */
public class Ej5 {

    public static void main(String[] args) {

        int[] arrayNumeros = new int[10];
        leerValoresTeclado(arrayNumeros);
        imprimirArray(arrayNumeros);
        
        int[] otroArray = leerValoresTeclado();
        int numeroPositivos = contarPositivos(arrayNumeros);
        System.out.println("Hay " + numeroPositivos + " números positivos");
        
        imprimirArray(otroArray);
        

    }

    public static void imprimirArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " - ");
        }
    }
    // Método que no devuelve nada --> void
    public static void leerValoresTeclado(int[] array) {
        Scanner tec = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce el valor que quieres en la"
                    + "posición " + i);
            array[i] = tec.nextInt();
        }
    }

    public static int[] leerValoresTeclado() {
        Scanner tec = new Scanner(System.in);
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce el valor que quieres en la"
                    + "posición " + i);
            array[i] = tec.nextInt();
        }
        
        return array;
    }

    public static int contarPositivos(int[] array) {
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                contador++;
            }
        }
        return contador;
    }

}
