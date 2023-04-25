
package EJERCICIO_3;

import EJERCICIO_1.ArbolBinario;

public class EJ3P3AYED {

    public static void main(String[] args) {
        ArbolBinario<Integer> a = new ArbolBinario<>(1);
        ArbolBinario<Integer> hd = new ArbolBinario<>(2);
        ArbolBinario<Integer> nodo1 = new ArbolBinario<>(3);
        ArbolBinario<Integer> nodo2 = new ArbolBinario<>(4);
        ArbolBinario<Integer> nodo3 = new ArbolBinario<>(5);
        nodo2.agregarHijoDerecho(nodo3);
        hd.agregarHijoIzquierdo(nodo1);
        hd.agregarHijoDerecho(nodo2);
        a.agregarHijoDerecho(hd);
        ArbolBinario<Integer> hi = new ArbolBinario<>(6);
        ArbolBinario<Integer> nodo4 = new ArbolBinario<>(7);
        ArbolBinario<Integer> nodo5 = new ArbolBinario<>(8);
        ArbolBinario<Integer> nodo6 = new ArbolBinario<>(9);
        ArbolBinario<Integer> nodo7 = new ArbolBinario<>(10);
        ArbolBinario<Integer> nodo8 = new ArbolBinario<>(11);
        ArbolBinario<Integer> nodo9 = new ArbolBinario<>(12);
        nodo7.agregarHijoDerecho(nodo8);
        nodo7.agregarHijoIzquierdo(nodo9);
        nodo5.agregarHijoDerecho(nodo6);
        nodo5.agregarHijoIzquierdo(nodo7);
        hi.agregarHijoDerecho(nodo5);
        hi.agregarHijoIzquierdo(nodo4);
        a.agregarHijoIzquierdo(hi);
        ContadorArbol cont = new ContadorArbol(a);
        cont.numerosParesInOrden();
        System.out.println("-----ParesInOrder-----");
        cont.Imprimir();
        System.out.println("----------------------");
        cont.numerosParesPreOrden();
        System.out.println("-----ParesPreOrden-----");
        cont.Imprimir();
    }
    
}
