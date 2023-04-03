
package ej1;

import ListaDeEnteros.ListaDeEnterosEnlazada;
import java.util.Scanner;

public class CreacionListaSucesion {

    public static ListaDeEnterosEnlazada calcularSucesion(int n) {
        ListaDeEnterosEnlazada list;
        if (n != 1) {
            if (n % 2 == 0) {
                list = calcularSucesion ((n / 2));
            } else {
                list = calcularSucesion (((3 * n) + 1));
            }
        } else {
            list = new ListaDeEnterosEnlazada();
        }
        list.agregarInicio(n);
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaDeEnterosEnlazada list = new ListaDeEnterosEnlazada();
        System.out.println("Ingrese el numero a calcular en la sucesion");
        int n = sc.nextInt();
        System.out.println("----------");
        list = calcularSucesion(n);
        list.comenzar();
        while (!list.fin()) {
            System.out.println(list.proximo());
        }
        
    }
    
}
