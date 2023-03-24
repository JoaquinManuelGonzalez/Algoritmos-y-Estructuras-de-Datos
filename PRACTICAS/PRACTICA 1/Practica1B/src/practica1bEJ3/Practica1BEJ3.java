
package practica1bEJ3;
import java.util.Scanner;

public class Practica1BEJ3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String apellido;
        String email;
        String direccion;
        String facultad;
        int comision;
        int catedra;
        Estudiante[] estudiantes = new Estudiante[2];
        Profesor[] profesores = new Profesor[3];
        for(int i = 0; i < estudiantes.length; i++){
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
            estudiantes[i] = e;
        }
        System.out.println("-----------------------");
        for(int i = 0; i < profesores.length; i++){
            System.out.println("Ingrese el nombre del profesor: ");
            nombre = sc.nextLine();
            System.out.println("Ingrese el apellido del profesor: ");
            apellido = sc.nextLine();
            System.out.println("Ingrese el email del profesor: ");
            email = sc.nextLine();
            System.out.println("Ingrese la facultad del profesor: ");
            facultad = sc.nextLine();
            System.out.println("Ingrese la catedra del profesor: ");
            catedra = sc.nextInt();
            Profesor p = new Profesor();
            p.setApellido(apellido);
            p.setNombre(nombre);
            p.setEmail(email);
            p.setFacultad(facultad);
            p.setCatedra(catedra);
            profesores[i] = p;
        }
        System.out.println("-----------------------");
        System.out.println("Informacion de los Alumnos: ");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.tusDatos());
        }
        System.out.println("-----------------------");
        System.out.println("Informacion de los Profesores: ");
        for (Profesor profesore : profesores) {
            System.out.println(profesore.tusDatos());
        }
        System.out.println("-----------------------");
    }
    
}
