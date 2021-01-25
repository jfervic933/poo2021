/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.ArrayList;

/**
 *
 * @author profesor
 */
public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<String> listaCadenas; // null
        
        listaCadenas = new ArrayList<>();
        
        ArrayList<Integer> listaEnteros = new ArrayList<>();
        
        listaCadenas.add("Programación"); // 0 listaCadenas[0] = "Programacion";
        listaCadenas.add("Bases de datos"); // 1
        listaCadenas.add("Entornos");// 2 
        
        
        for (int i = 0; i < listaCadenas.size(); i++) {
            System.out.println(listaCadenas.get(i));
        }
        
        listaCadenas.set(1, "Lenguajes de marcas");  // listaCadenas[1] = "Lenguajes de marcas";
        
        for (String cadena : listaCadenas) {
            System.out.println(cadena);
        }
        
        //listaCadenas.set(20, "Fol"); // IndexOutofBounds
        //listaCadenas.add(20, "Fol"); // IndexOutofBounds
        
        listaCadenas.add(1, "Sistemas"); // el índice debe ser >=0 y < size()
        
        listaCadenas.forEach(e->System.out.println("Hola " + e));
        
        listaCadenas.remove("Lenguajes de marcas");
        
        System.out.println("-------------------------");
        
        listaCadenas.forEach(System.out::println);
        
        listaCadenas.add("Despliegue de aplicaciones");
        
        listaCadenas.add(0,"Desarrollo entorno cliente");
        System.out.println("-------------------------");
        
        listaCadenas.forEach(System.out::println);
        
        String aux = listaCadenas.get(3);
        
        System.out.println("Aux: " + aux);
        
        listaCadenas.clear();
        
         System.out.println("-----------CLEAR---------");
        
        listaCadenas.forEach(System.out::println);
        
        System.out.println("Está vacía? " + listaCadenas.isEmpty());
        
    }
    
}
