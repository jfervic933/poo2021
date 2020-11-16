/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcarlos.poo;

import java.util.Scanner;

/**
 *
 * @author profesor
 */
public class Programa {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        Galleta g = new Galleta(23, 0.12);
        
        Galleta g2 = new Galleta();
        
        //g2.forma = "Cuadrada";
        
//        System.out.println("Galleta g " + g.precio);
        
//        System.out.println("¿Cómo quieres la galleta?");
//        System.out.println("Forma: ");
//        String forma = teclado.nextLine();
//        System.out.println("Color: ");
//        String color = teclado.nextLine();
//        System.out.println("sabor: ");
//        String sabor = teclado.nextLine();
//        System.out.println("Tiene choco?(si/no)");
//        String tmp = teclado.nextLine();
//        
//        boolean tieneChocolate = tmp.equalsIgnoreCase("si");
//        System.out.println("Gramos: ");
//        double gr = teclado.nextDouble();
//        System.out.println("Precio: ");
//        double precio = teclado.nextDouble();
        
//        Galleta usuario = new Galleta(forma, sabor,
//        color, tieneChocolate, gr, precio);
        
        Galleta cookieChoco = new Galleta("Redonda", "Chocolate",
        "Marrón", true, 10, 3.3);
        
        Galleta galletaMaria = new Galleta("Redonda", "Galleta",
        "Marrón", false, 5, 1);
        
        Galleta galletaDinosaurio = new Galleta("TREX", "Mantequilla",
        "Verde", false, 12, 45);
        
        System.out.println("Color de la galleta maria " + 
                galletaMaria.getColor());
        
        galletaMaria.setForma("Triangular");
        System.out.println("Forma de la galleta maria " + 
                galletaMaria.getForma());
        
        
        
        galletaMaria.setGramos(10);
        System.out.println("Peso de la galleta maria " + 
                galletaMaria.getGramos());
//        cookieChoco.forma = "Cuadrada";
//        
//         System.out.println("Mi galleta Usuario tiene forma:" + 
//                usuario.forma);
//        
//        System.out.println("Mi galleta cookie tiene forma:" + 
//                cookieChoco.forma);
//        
//        System.out.println("Mi galleta cookie tiene sabor:" + 
//                cookieChoco.sabor);
//        
//        System.out.println("Mi galleta María tiene sabor:" + 
//                galletaMaria.sabor);
        
        
//        System.out.println("Mi galleta Dino tiene " + 
//                galletaDinosaurio.sabor + " " + galletaDinosaurio.color
//         + " " + galletaDinosaurio.precio);
    }
       
    
}
