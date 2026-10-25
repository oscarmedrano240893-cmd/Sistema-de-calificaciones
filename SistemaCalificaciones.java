package calificaciones;

import java.util.Scanner;

public class SistemaCalificaciones {

    String Nombre;
    double PrimeraCalificacion;
    double SegundaCalificacion;
    double TerceraCalificacion;
    double Promedio;
    Scanner entrada = new Scanner(System.in);

    //Metodo Bienvenida
    public void bienvenida() {
        System.out.println("-------------------------");
        System.out.println("SISTEMA DE CALIFICACIONES");
        System.out.println("-------------------------");
        System.out.println("Bienvenido al sistema");
        System.out.println("");
    }

    //Metodo capturar datos y validar que esten dentro del rango de 0 - 10
    public void capturarDatos() {
        System.out.println("¿Cual es tu nombre? ");
        Nombre = entrada.nextLine();

        //Primer calificacion, repetir ciclo con do while
        do {
            System.out.print("Dame tu primer calificacion: ");
            PrimeraCalificacion = entrada.nextDouble();
            if (PrimeraCalificacion >= 0 && PrimeraCalificacion <= 10) {
                System.out.println("Calificacion valida");
            } else {
                System.out.println("Calificacion invalida, favor de introducir una calificacion valida.");
            }
        } while (PrimeraCalificacion < 0 || PrimeraCalificacion > 10);

        //Segunda calificacion, repetir ciclo con do while
        do {
            System.out.print("Dame tu segunda calificacion: ");
            SegundaCalificacion = entrada.nextDouble();
            if (SegundaCalificacion >= 0 && SegundaCalificacion <= 10) {
                System.out.println("Calificacion valida");
            } else {
                System.out.println("Calificacion invalida, favor de introducir una calificacion valida.");
            }
        } while (SegundaCalificacion < 0 || SegundaCalificacion > 10);

        //Tercera Calificacion, repetir ciclo con do while
        do {
            System.out.print("Dame tu tercera calificacion: ");
            TerceraCalificacion = entrada.nextDouble();
            if (TerceraCalificacion >= 0 && TerceraCalificacion <= 10) {
                System.out.println("Calificacion valida");
            } else {
                System.out.println("Calificacion invalida, favor de introducir una calificacion valida");
            }
        } while (TerceraCalificacion < 0 || TerceraCalificacion > 10);
    }
        //Metodo mostrar datos
    public void mostrarDatos() {
        System.out.println("");
        System.out.println("*******************************");
        System.out.println("Nombre del alumno: " + Nombre);
        System.out.println("Primer calficacion: " + PrimeraCalificacion);
        System.out.println("Segunda calificacion: " + SegundaCalificacion);
        System.out.println("Tercera calificacion: " + TerceraCalificacion);
        System.out.println("*******************************");
        System.out.println("");
    }

    /* //Metodo modificar datos
    public void modificarPrimeraCalificacion(){
        System.out.print("Dame el nuevo valor de la primera calificacion: ");
        PrimeraCalificacion = entrada.nextDouble();
        System.out.println("");
    }*/
    //Metodo calcular promedio
    public void calcularPromedio() {
        Promedio = (PrimeraCalificacion + SegundaCalificacion + TerceraCalificacion) / 3.0;
        System.out.print("Promedio final: " + Promedio);
        System.out.println("");
    }

    //Metodo para indicar si aprobo o reprobo el alumno
    public void verificarAprobacion() {
        if (Promedio >= 7.0) {
            System.out.print("El alumno: " + Nombre + " aprobo con: " + Promedio + " Eres INTELIGENTE!!!");
        } else {
            System.out.println("El alumno: " + Nombre + " ha reprobado con: " + Promedio + "Eres BURRO!!!!!");

        }
    }

}
