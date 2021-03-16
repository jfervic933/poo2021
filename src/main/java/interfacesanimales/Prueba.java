/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesanimales;

import java.util.ArrayList;

/**
 *
 * @author profesor
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Una clase abstracta no se puede instanciar
        //Animal animal = new Animal(12);
        Animal gatito = new Gato(34); // Conversión implícita
        Felino gato2 = new Gato(45); // Conversión implícita
        // Clases con tipo diferente
        //Leon simba = new Gato(34);
        // Un animal no siempre es un leon
        // Leon x  = new Animal();

        ArrayList<Animal> zoo = new ArrayList<>();
        ArrayList<Mascota> mascotas = new ArrayList<>();
        // Conversión implícita
        zoo.add(new Gato(34));
        mascotas.add(new Gato(34));
        zoo.add(new Leon(12));
        // mascotas.add(new Leon(34));
        zoo.add(new Elefante(678));
        zoo.add(new Perro(32));
        
        for (Animal a : zoo) {
            
            // Polimorfismo
            a.comer();
            // Si a es una instancia de Felino
            if (a instanceof Felino){
                // Conversión explícita
                ((Felino) a).cazar();
            }
            
            if (a instanceof Gato){
                ((Gato) a).maullar();
            }
            
            if (a instanceof Mascota){
                ((Mascota) a).jugar(300);
                ((Mascota) a).vacunar();
            }
            
        }

    }

}
