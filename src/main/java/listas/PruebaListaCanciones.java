/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author profesor
 */
public class PruebaListaCanciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ListaReproduccion lista = new ListaReproduccion();

        lista.grabarCancion(new Cancion("Un barquito", 120, "Chankete"));
        lista.grabarCancion(new Cancion("Macarena", 220, "Los del Río"));
        lista.grabarCancion(new Cancion("RunRun", 420, "Melendi"));
        lista.grabarCancion(new Cancion("Presidente", 20, "Imad"));
        lista.grabarCancion(new Cancion("Chiki Chiki", 150, "Pablo Alborán"));

        lista.imprimirLista();

        System.out.println("Número de canciones " + lista.numeroCanciones());

        System.out.println("Está vacía? " + lista.estaVacia());

        Cancion escuchar = lista.escucharCancion(3);
        System.out.println("Escuchando .... " + escuchar);

        lista.cambiarCancion(2, new Cancion("Aserejé", 444, "Las Ketchup"));

        lista.imprimirLista();

        lista.eliminarCancion(1);

        lista.imprimirLista();

        System.out.println("----------------");

        lista.eliminarCancion(escuchar);

        lista.imprimirLista();
        lista.grabarCancion(new Cancion("Macarena", 220, "Los del Río"));
        lista.grabarCancion(new Cancion("Presidente", 20, "Imad"));
        System.out.println("-------------");
        lista.imprimirLista();
        
        Cancion aBuscar = new Cancion("Macarena", 220, "Los del Río");
        int posicion = lista.buscarCancion(aBuscar);
        System.out.println("La Macarena está en la posicion " + posicion);
        
        System.out.println("------ Después de ordenar por título --------");
        
        lista.ordenarTitulo();
        
        lista.imprimirLista();
        
        System.out.println("------ Después de ordenar por duración --------");
        
        lista.ordenarDuracion();
        
        lista.imprimirLista();
        
        System.out.println("------ Después de ordenar por grupo --------");
        
        lista.ordenarGrupo();
        
        lista.imprimirLista();
        
        // Para hacer búsqueda binaria por título tengo que ordenar
        // la lista por título
        
        lista.ordenarTitulo();
        
         System.out.println("------ Después de ordenar por título --------");
        
        lista.imprimirLista();
        
        posicion = lista.buscarPorTitulo(aBuscar);
        
        System.out.println("La posicion es " + posicion);
    }

}
