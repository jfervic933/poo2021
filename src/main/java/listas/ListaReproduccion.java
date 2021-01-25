/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Ángel
 */
public class ListaReproduccion {

    private ArrayList<Cancion> canciones;

    // constructor predeterminado (creará e inicializará la lista).
    public ListaReproduccion() {
        canciones = new ArrayList<>();
    }

    // numeroCanciones(): devuelve el número de canciones de la lista.
    public int numeroCanciones() {
        return canciones.size();
    }

    // estaVacia(): devuelve si la lista de reproducción está vacía.
    public boolean estaVacia() {
        return canciones.isEmpty();
    }

    // escucharCancion(int): devuelve la Cancion que se encuentra en la posición 
    // indicada.
    public Cancion escucharCancion(int posi) {
        // Mirar que la posicion este correcta
        if (posi >= 0 && posi < canciones.size()) {
            return canciones.get(posi);
        } else {
            // Devuelve null
            return null;
        }
    }

    // cambiarCancion(int, Cancion): cambia la Cancion de la posición indicada 
    // por la nueva Cancion proporcionada.
    public void cambiarCancion(int num, Cancion cancion) {
        // Mirar que la posicion este correcta
        if (num >= 0 && num < canciones.size()) {
            canciones.set(num, cancion);
        }

    }

    // grabarCancion(Cancion): agrega al final de la lista la Cancion proporcionada.
    public void grabarCancion(Cancion cancion) {
        canciones.add(cancion);
    }

    // EliminaCancion(int): elimina la Cancion que se encuentra en la posición indicada.
    public void eliminarCancion(int posicionBorrar) {
        // Mirar que la posicion este correcta
        if (posicionBorrar >= 0 && posicionBorrar < canciones.size()) {
            canciones.remove(posicionBorrar);
        }
    }

    // eliminaCancion(Cancion c), elimina el objeto c si se encuentra en la 
    // lista de reproducción. Usa el método remove(Cancion)
    // SI LA CLASE CANCION NO IMPLEMENTA EL METODO EQUALS, EL MÉTODO REMOVE NO 
    // SE GARANTIZA QUE FUNCIONE CORRECTAMENTE
    public void eliminarCancion(Cancion cancion) {
        canciones.remove(cancion);
    }

    // imprimirLista (ListaReproduccion tmp). Método de clase que imprime los 
    // nombres de las canciones contenidas en tmp
    public static void imprimirLista(ListaReproduccion tmp) {
        for (int i = 0; i <= tmp.numeroCanciones(); i++) {
            System.out.println(tmp.canciones.get(i).getNombre());
        }
    }

    public void imprimirLista() {
        canciones.forEach(System.out::println);
    }

    // buscarCancion(Cancion c), busca la canción c en la lista de reproducción 
    // y devuelve la posición en la que se encuentra. Usa el método indexOf.
    // SI NO TENGO LOS EQUALS NO VA A FUNCIONAR
    public int buscarCancion(Cancion c) {
        return canciones.indexOf(c);
    }

    public void ordenarTitulo() {
        Comparator<Cancion> criterio = (c1, c2) -> c1.getNombre().compareTo(c2.getNombre());
        Collections.sort(canciones, criterio);
    }

    public void ordenarDuracion() {
        Comparator<Cancion> criterio = (c1, c2) -> c1.getDuracion().compareTo(c2.getDuracion());
        Collections.sort(canciones, criterio);
    }

    public void ordenarGrupo() {
        Comparator<Cancion> criterio = (c1, c2) -> c1.getGrupo().compareTo(c2.getGrupo());
        Collections.sort(canciones, criterio);
    }
    
    
    // Para usar búsqueda binaria el array o la lista debe
    // estar ordenado según el criterio por el que se va a buscar
    public int buscarPorTitulo(Cancion c){
        Comparator<Cancion> criterio = (c1, c2) -> c1.getNombre().compareTo(c2.getNombre());
        
        int posicion = Collections.binarySearch(canciones, c, criterio);
        
        return posicion;
    }
}
