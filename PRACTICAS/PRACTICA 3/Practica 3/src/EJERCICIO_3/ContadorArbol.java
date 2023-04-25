
package EJERCICIO_3;

import EJERCICIO_1.ArbolBinario;
import ListaDeEnteros.ListaDeEnterosEnlazada;


public class ContadorArbol {
    private ArbolBinario<Integer> a;
    private ListaDeEnterosEnlazada list;
    
    public ContadorArbol (ArbolBinario<Integer> a) {
        this.a = a;
    }
    
    public ListaDeEnterosEnlazada numerosParesInOrden() {
        list = new ListaDeEnterosEnlazada();
        paresInOrden(this.a, list);
        return list;
    }
    
    private void paresInOrden(ArbolBinario<Integer> a, ListaDeEnterosEnlazada list) {
        if (this.a.tieneHijoIzquierdo()) {
            paresInOrden(a.getHijoIzquierdo(), list);
        }
        if (a.getDato() % 2 == 0) {
            list.agregarFinal(a.getDato());
        }
        if (this.a.tieneHijoDerecho()) {
            paresInOrden(a.getHijoDerecho(), list);
        }
    }
    
    public ListaDeEnterosEnlazada numerosParesPreOrden() {
        list = new ListaDeEnterosEnlazada();
        paresPreOrden(this.a, list);
        return list;
    }
    
    private void paresPreOrden(ArbolBinario<Integer> a, ListaDeEnterosEnlazada list) {
        if (a.getDato() % 2 == 0) {
            list.agregarFinal(a.getDato());
        }
        if (this.a.tieneHijoIzquierdo()) {
            paresInOrden(a.getHijoIzquierdo(), list);
        }
        if (this.a.tieneHijoDerecho()) {
            paresInOrden(a.getHijoDerecho(), list);
        }
    }
    
    public void Imprimir() {
        this.list.comenzar();
        while (!this.list.fin()) {
            System.out.println(this.list.proximo());
        }
    }
}
