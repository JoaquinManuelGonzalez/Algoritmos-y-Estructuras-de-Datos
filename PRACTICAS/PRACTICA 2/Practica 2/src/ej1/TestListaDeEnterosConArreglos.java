
package ej1;

import ListaDeEnteros.ListaDeEnterosConArreglos;

public class TestListaDeEnterosConArreglos {


    public static void main(String[] args) {
        ListaDeEnterosConArreglos list = new ListaDeEnterosConArreglos();
        for (String arg : args) {
            list.agregarFinal(Integer.parseInt(arg));
        }
        while (!list.fin()) {
            System.out.println(list.proximo());
        }
    }
    
}
