package EJERCICIO_1;

import ListaGenerica.ColaGenerica;

public class ArbolBinario<T> {

    private T dato;
    private ArbolBinario<T> hijoIzquierdo;
    private ArbolBinario<T> hijoDerecho;

    public ArbolBinario() {
        super();
    }

    public ArbolBinario(T dato) {
        this.dato = dato;
    }

    /*
	 * getters y setters
	 * 
     */
    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    /**
     * Preguntar antes de invocar si tieneHijoIzquierdo()
     *
     * @return
     */
    public ArbolBinario<T> getHijoIzquierdo() {
        return this.hijoIzquierdo;
    }

    public ArbolBinario<T> getHijoDerecho() {
        return this.hijoDerecho;

    }

    public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
        this.hijoIzquierdo = hijo;
    }

    public void agregarHijoDerecho(ArbolBinario<T> hijo) {
        this.hijoDerecho = hijo;
    }

    public void eliminarHijoIzquierdo() {
        this.hijoIzquierdo = null;
    }

    public void eliminarHijoDerecho() {
        this.hijoDerecho = null;
    }

    public boolean esVacio() {
        return this.getDato() == null && !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
    }

    public boolean esHoja() {
        return (!this.tieneHijoIzquierdo() && !this.tieneHijoDerecho());

    }

    @Override
    public String toString() {
        return this.getDato().toString();
    }

    public boolean tieneHijoIzquierdo() {
        return this.hijoIzquierdo != null;
    }

    public boolean tieneHijoDerecho() {
        return this.hijoDerecho != null;
    }

    public int contarHojas() {
        if (this != null) {
            if (this.esHoja()) {
                return 1;
            } else {
                int total = 0;
                if (this.tieneHijoIzquierdo()) {
                    total += this.hijoIzquierdo.contarHojas();
                }
                if (this.tieneHijoDerecho()) {
                    total += this.hijoDerecho.contarHojas();
                }
                return total;
            }
        } else {
            return 0;
        }
    }

    public ArbolBinario<T> espejo() {
        if (!this.esVacio()) {
            ArbolBinario<T> invert = new ArbolBinario<>(this.getDato());
            if (this.tieneHijoIzquierdo()) {
                invert.agregarHijoDerecho(this.getHijoIzquierdo().espejo());
            }
            if (this.tieneHijoDerecho()) {
                invert.agregarHijoIzquierdo(this.getHijoDerecho().espejo());
            }
            return invert;
        } else {
            return null;
        }
    }

    public void entreNiveles(int n, int m) {
        if (n < 0) {
            System.out.println("Valor invalido.");
        } else {
            ArbolBinario<T> arbol = null;
            ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();
            int cont = 0;
            cola.encolar(this);
            cola.encolar(null);
            while (!cola.esVacia()) {
                arbol = cola.desencolar();
                if (arbol != null) {
                    if ((n <= cont) && (cont <= m)) {
                        System.out.println("datos: " + arbol.getDato());
                    }
                    if (arbol.tieneHijoIzquierdo()) {
                        cola.encolar(arbol.getHijoIzquierdo());
                    }
                    if (arbol.tieneHijoDerecho()) {
                        cola.encolar(arbol.getHijoDerecho());
                    }
                } else if (!cola.esVacia()) {
                    System.out.println("~~~~~~Fin nivel " + cont + "~~~~~~");
                    cont++;
                    cola.encolar(null);
                }
            }
        }
    }

    public void inOrder(ArbolBinario<T> a) {
        if (a.tieneHijoIzquierdo()) {
            this.inOrder(a.getHijoIzquierdo());
        }
        System.out.println("datos: " + a.getDato());
        if (a.tieneHijoDerecho()) {
            this.inOrder(a.getHijoDerecho());
        }
    }

    public void PreOrder(ArbolBinario<T> a) {
        System.out.println("datos: " + a.getDato());
        if (a.tieneHijoIzquierdo()) {
            this.PreOrder(a.getHijoDerecho());
        }
        if (a.tieneHijoDerecho()) {
            this.PreOrder(a.getHijoDerecho());
        }
    }

    public void PostOrder(ArbolBinario<T> a) {
        if (a.tieneHijoIzquierdo()) {
            this.PostOrder(a.getHijoDerecho());
        }
        if (a.tieneHijoDerecho()) {
            this.PostOrder(a.getHijoDerecho());
        }
        System.out.println("datos: " + a.getDato());
    }

}
