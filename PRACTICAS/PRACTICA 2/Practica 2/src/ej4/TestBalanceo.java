
package ej4;

import ListaGenerica.PilaGenerica;
import ListaGenerica.ListaEnlazadaGenerica;
import java.util.Scanner;

public class TestBalanceo {


    public static void main(String[] args) {
        PilaGenerica <Character> pila = new PilaGenerica <Character>();
        ListaEnlazadaGenerica <Character> list = new ListaEnlazadaGenerica <Character>();
        ListaEnlazadaGenerica <Character> list2 = new ListaEnlazadaGenerica <Character>();
        list.agregarFinal('{');
        list.agregarFinal('(');
        list.agregarFinal('[');
        list2.agregarFinal('}');
        list2.agregarFinal(')');
        list2.agregarFinal(']');
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        sc.close();
        boolean balanceado = true;
        int i = 0;
        while (i < cadena.length() && balanceado) {
                if (list.incluye(cadena.charAt(i))) {
                    pila.apilar(cadena.charAt(i));
                } else {
                    if (list2.incluye(cadena.charAt(i))) {
                        Character charac = pila.desapilar();
                            switch (charac) {
                                case '{':
                                    charac = '}';
                                case '(':
                                    charac = ')';
                                case '[':
                                    charac = ']';
                        if (!charac.equals(cadena.charAt(i))) {
                            balanceado = false;
                            System.out.println("NO ESTA BALANCEADA");
                            }
                        }
                    }
                }
            i++;
            }
        }
    }
    

