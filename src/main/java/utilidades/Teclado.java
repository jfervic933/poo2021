/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author profesor
 */
public class Teclado {

    private static Scanner s = new Scanner(System.in);

    public static int leerEntero() {
        int entero = 0;
        boolean repetir = false;
        do {
            try {
                System.out.println("Introduce un entero: ");
                entero = s.nextInt();
                repetir = false;
            } catch (InputMismatchException ime) {
                s.nextLine();
                repetir = true;
            }

        } while (repetir);

        return entero;
    }

}
