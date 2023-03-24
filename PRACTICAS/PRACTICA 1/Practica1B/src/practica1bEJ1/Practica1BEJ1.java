
package practica1bEJ1;
import java.util.Scanner;

public class Practica1BEJ1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero A: ");
        int a = sc.nextInt();
        System.out.println("Ingrese el numero B: ");
        int b = sc.nextInt();
        System.out.println("-----------------");
        System.out.println("Imprimir con FOR: ");
        AnalisisRangoDeDatos.ImprimirFor(a, b);
        System.out.println("-----------------");
        System.out.println("Imprimir con WHILE: ");
        AnalisisRangoDeDatos.ImprimirWhile(a, b);
        System.out.println("-----------------");
        System.out.println("Imprimir RECURSIVO");
        AnalisisRangoDeDatos.ImprimirRecursivo(a, b);
        System.out.println("-----------------");
    }
    
}
