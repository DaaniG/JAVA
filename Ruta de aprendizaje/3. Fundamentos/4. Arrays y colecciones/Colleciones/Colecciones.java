package ArraysYColecciones;

import java.util.*;

/**
 * Arrays y Colecciones. Colecciones
 * @author TitoDev
 */

public class Colecciones {

    public static void main(String[] args) {

        /* ArrayList */
        ArrayList<String> lista_de_nombres = new ArrayList<String>();

        lista_de_nombres.add("Juan");
        lista_de_nombres.add("Pedro");
        lista_de_nombres.add("María");

        System.out.println(lista_de_nombres.get(0)); // Imprime "Juan"

        /* LinkedList */
        LinkedList<String> lista_de_nombres_link = new LinkedList<String>();

        lista_de_nombres_link.add("Juan");
        lista_de_nombres_link.add("Pedro");
        lista_de_nombres_link.add("María");

        System.out.println(lista_de_nombres_link.get(1)); // Imprime "Pedro"

        /* HashSet */
        HashSet<String> conjunto_de_nombres = new HashSet<String>();

        conjunto_de_nombres.add("Juan");
        conjunto_de_nombres.add("Pedro");
        conjunto_de_nombres.add("María");
        conjunto_de_nombres.add("Pedro"); // Este elemento no se agrega porque ya existe en el conjunto

        for (String nombre : conjunto_de_nombres) {
            System.out.println(nombre);
        }

        /* TreeSet */
        TreeSet<Integer> conjunto_de_numeros = new TreeSet<Integer>();

        conjunto_de_numeros.add(5);
        conjunto_de_numeros.add(2);
        conjunto_de_numeros.add(8);

        for (Integer numero : conjunto_de_numeros) {
            System.out.println(numero);
        }

        /* HashMap */
        HashMap<String, Integer> mapa_de_edades = new HashMap<String, Integer>();

        mapa_de_edades.put("Juan", 25);
        mapa_de_edades.put("Pedro", 30);
        mapa_de_edades.put("María", 27);

        System.out.println(mapa_de_edades.get("Pedro")); // Imprime "30"

        /* TreeMap */
        TreeMap<String, Integer> mapa_de_edades_tree = new TreeMap<String, Integer>();

        mapa_de_edades_tree.put("Juan", 25);
        mapa_de_edades_tree.put("Pedro", 30);
        mapa_de_edades_tree.put("María", 27);

        for (String nombre : mapa_de_edades_tree.keySet()) {
            System.out.println(nombre + ": " + mapa_de_edades_tree.get(nombre));
        }

        /* ArrayDeque */
        ArrayDeque<String> cola_de_nombres = new ArrayDeque<String>();

        cola_de_nombres.add("Juan");
        cola_de_nombres.add("Pedro");
        cola_de_nombres.add("María");

        System.out.println(cola_de_nombres.remove()); // Imprime "Juan"

        /* PriorityQueue */
        PriorityQueue<Integer> cola_de_numeros = new PriorityQueue<Integer>();

        cola_de_numeros.add(5);
        cola_de_numeros.add(2);
        cola_de_numeros.add(8);

        System.out.println(cola_de_numeros.poll()); // Imprime "2"
    }
}
