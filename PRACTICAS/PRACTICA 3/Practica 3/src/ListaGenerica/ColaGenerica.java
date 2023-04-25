/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaGenerica;

/**
 *
 * @author Usuario
 */
public class ColaGenerica<T> {
    private ListaEnlazadaGenerica<T> datos;
    
    public ColaGenerica() {
        this.datos = new ListaEnlazadaGenerica<>();
    }
    
    public void encolar(T elem) {
        //* Agrega elem a la cola.
        this.datos.agregarFinal(elem);
    }
    
    public T desencolar() {
        //*Elimina y devuelve el primer elemento de la cola.
        if (!datos.esVacia()) {
            T elem = datos.elemento(1);
            this.datos.eliminarEn(1);
            return elem;
        } else {
            return null;
        }
    }
    
    public T tope() {
        //* Devuelve el elemento en el tope de la cola sin eliminarlo.
        if (!datos.esVacia()) {
            return this.datos.elemento(this.datos.tamanio());
        } else {
            return null;
        }
    }
    
    public boolean esVacia() {
        //*Retorna true si la cola está vacía, false en caso contrario.
        return this.datos.esVacia();
    }
    
}
