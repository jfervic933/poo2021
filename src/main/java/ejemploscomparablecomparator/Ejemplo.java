/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploscomparablecomparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import vehiculos.Color;
import vehiculos.Marca;

/**
 *
 * @author profesor
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Vehiculo> lista = new ArrayList<>();
        lista.add(new Vehiculo("343234f", Marca.MCLAREN, "UnmodeloX", Color.ROJO, 632, true));
        lista.add(new Vehiculo("233434f", Marca.MCLAREN, "ZZosdeloX", Color.VERDE, 632, true));
        lista.add(new Vehiculo("143234f", Marca.MCLAREN, "AAAeloX", Color.ROJO, 35, true));
       
        
        lista.forEach(System.out::println);
        
        //Collections.sort(lista);
        //lista.forEach(System.out::println);
        
        
        Collections.sort(lista,(v1,v2)->v1.getModelo().compareTo(v2.getModelo()));
        System.out.println("Por modelo ------------------- ");
        lista.forEach(System.out::println);
        
        Comparator<Vehiculo> criterioPrecio = (v1,v2)->v1.getPrecio().compareTo(v2.getPrecio());
        Comparator<Vehiculo> criterioColor = (v1,v2)->v1.getColor().compareTo(v2.getColor());
        
        Collections.sort(lista,criterioPrecio.reversed().thenComparing(criterioColor));
        System.out.println("Por precio ------------------- ");
        lista.forEach(System.out::println);

    }

}
