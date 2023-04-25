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
public class PilaGenerica<T> {
    private ListaEnlazadaGenerica<T> datos;
    
    public PilaGenerica() {
        this.datos = new ListaEnlazadaGenerica<>();
    }
    
    public void apilar (T elem) {
        //*Agrega elem a la pila.
        this.datos.agregarFinal(elem);
    }
    
    public T desapilar() {
        //* Elimina y devuelve el elemento en el tope de la pila.
        if (!datos.esVacia()) {
            T elem = this.datos.elemento(this.datos.tamanio());
            this.datos.eliminarEn(this.datos.tamanio());
            return elem;
        } else {
            return null;
        }
    }
    
    public T tope() { 
        //*Devuelve el elemento en el tope de la pila sin eliminarlo.
        if (!datos.esVacia()) {
            T elem = this.datos.elemento(this.datos.tamanio());
            return elem;
        } else {
            return null;
        }
    }
    
    public boolean esVacia() {
        //*Retorna true si la pila está vacía, false en caso contrario.
        return this.datos.esVacia();
    }
}
