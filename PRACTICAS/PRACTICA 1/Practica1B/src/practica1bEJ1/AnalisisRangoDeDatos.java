
package practica1bEJ1;


public class AnalisisRangoDeDatos {
    
    public static void ImprimirFor(int a, int b){
        for(int i = a; i <= b; i++){
            System.out.println(i);
        }
    }
    
    public static void ImprimirWhile(int a, int b){
        int indice = a;
        while(indice <= b){
            System.out.println(indice);
            indice++;
        }
    }
    
    public static void ImprimirRecursivo(int a, int b){
        int i = a;
        if(i <= b){
            System.out.println(i);
            ImprimirRecursivo(i + 1, b);
        }
    }
}
