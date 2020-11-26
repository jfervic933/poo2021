/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author profesor
 */
public class Aleatorios {

    // Métodos static son métodos de clase
    // No depende de ningún objeto para poder ser invocado
    // Se invocan usando el nombre de la clase
//    public static void main(String[] args) {
//        Scanner tec = new Scanner(System.in);
//        tec.next(); // Método no static. Uso un objeto para invocar
//        Math.random(); // Método statci. Uso el nombre de la clase para invocar
//    }
    public static int enteroAleatorio() {
        int aux;
        Random r = new Random();

        aux = r.nextInt();

        return aux;
    }

    public static int enteroRango(int min, int max) {
        int aux;
        Random r = new Random();

        aux = r.nextInt(max - min + 1) + min;

        return aux;
    }

    public static char letraMinuscula() {
        Random r = new Random();
        return (char) (97 + r.nextInt(27));
    }

    public static char letraMayuscula() {
        Random r = new Random();
        return (char) (65 + r.nextInt(27));
    }
}
