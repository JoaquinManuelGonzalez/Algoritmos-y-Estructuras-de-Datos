
package ej1;

import ListaDeEnteros.ListaDeEnterosEnlazada;

public class TestListaDeEnterosEnlazada {

    public static void imprimirRecursivo (ListaDeEnterosEnlazada list) {
        if (!list.fin()) {
            int a = list.proximo();
            imprimirRecursivo (list);
            System.out.println(a);
        }
    }
    
    public static void main(String[] args) {
        ListaDeEnterosEnlazada list = new ListaDeEnterosEnlazada();
        for (String elem : args) {
            list.agregarFinal(Integer.parseInt(elem));
        }
        list.comenzar();
        while (!list.fin()) {
            System.out.println(list.proximo());
        }
        System.out.println("--------------------");
        imprimirRecursivo(list);
    }
    
}
