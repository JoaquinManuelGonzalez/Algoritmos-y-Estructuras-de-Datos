
package EJERCICIO_1;

public class ej1 {

    public static void main(String[] args) {
        ArbolBinario<Integer> a = new ArbolBinario<>(1);
        ArbolBinario<Integer> hI = new ArbolBinario<>(2);
        hI.agregarHijoIzquierdo(new ArbolBinario<>(4));
        hI.agregarHijoDerecho(new ArbolBinario<>(5));
        ArbolBinario<Integer> hD = new ArbolBinario<>(3);
        hD.agregarHijoIzquierdo(new ArbolBinario<>(6));
        a.agregarHijoIzquierdo(hI);
        a.agregarHijoDerecho(hD);
        System.out.println("------inOrder-------");
        a.inOrder(a);
        System.out.println();
        System.out.println("------contarHojas-------");
        System.out.println(a.contarHojas());
        System.out.println();
        System.out.println("------invertirEInOrder-------");
        ArbolBinario<Integer> invert = a.espejo();
        invert.inOrder(invert);
        System.out.println();
        System.out.println("-------enNiveles------");
        a.entreNiveles(1, 6);
    }
    
}
