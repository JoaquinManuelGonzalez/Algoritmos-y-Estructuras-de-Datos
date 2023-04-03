
package ej2;

import java.util.Scanner;
import ListaGenerica.ListaEnlazadaGenerica;

public class TestListaEnlazadaGenerica {


    public static void main(String[] args) {
        ListaEnlazadaGenerica <Estudiante> list = new ListaEnlazadaGenerica <Estudiante>();
        Scanner sc = new Scanner(System.in);
        String nombre;
        String apellido;
        String email;
        String direccion;
        int comision;
        for(int i = 0; i < 4; i++){
            System.out.println("Ingrese el nombre del estudiante: ");
            nombre = sc.nextLine();
            System.out.println("Ingrese el apellido del estudiante: ");
            apellido = sc.nextLine();
            System.out.println("Ingrese el email del estudiante: ");
            email = sc.nextLine();
            System.out.println("Ingrese la direccion del estudiante: ");
            direccion = sc.nextLine();
            System.out.println("Ingrese la comision del estudiante: ");
            comision = sc.nextInt();
            Estudiante e = new Estudiante();
            e.setApellido(apellido);
            e.setNombre(nombre);
            e.setEmail(email);
            e.setDireccion(direccion);
            e.setComision(comision);
            list.agregarFinal(e);
        }
        list.comenzar();
        while (!list.fin()) {
            System.out.println (list.proximo().tusDatos());
        }
    }
    
}
