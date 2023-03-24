
package practica1bEJ2;
import java.util.Scanner;

public class Practica1BEJ2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero N: ");
        int n = sc.nextInt();
        System.out.println("--------------------");
        System.out.println("Se ha generado el siguiente array: ");
        int[] array = ArregloMultiplos.CreacionArreglo(n);
        for(int i = 0; i < n; i++){
            System.out.println(i + 1 + ") " + array[i]);
        }
        System.out.println("--------------------");
    }
    
}
