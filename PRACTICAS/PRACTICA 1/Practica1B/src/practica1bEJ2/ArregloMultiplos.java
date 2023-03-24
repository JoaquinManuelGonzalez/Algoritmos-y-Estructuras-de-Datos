
package practica1bEJ2;


public class ArregloMultiplos {
    
    public static int[] CreacionArreglo(int n){
        int mul;
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            mul = n * (i + 1);
            if(mul >= 1){
                array[i] = mul;
            }
        }
        return array;
    }
    
}
