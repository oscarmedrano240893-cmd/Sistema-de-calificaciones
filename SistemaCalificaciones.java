package calificaciones;

import java.util.Scanner;

public class SistemaCalificaciones {

    String Nombre;
    double PrimeraCalificacion;
    double SegundaCalificacion;
    double TerceraCalificacion;
    double Promedio;
    int Aprobados = 0;
    int Reprobados = 0;
    double SumaPromedios;
    double PromedioGeneral;

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
        SumaPromedios += Promedio;  //Acumular el promedio de cada alumno en la variablr SumaPtomedios
        System.out.println("");
    }

    //Metodo para indicar si aprobo o reprobo el alumno
    public void verificarAprobacion() {
        if (Promedio >= 7.0) {
            System.out.println("El alumno: " + Nombre + " aprobo con: " + Promedio);
            Aprobados++;
        } else {
            System.out.println("El alumno: " + Nombre + " ha reprobado con: " + Promedio);
            Reprobados++;
        }
    }

    //Metodo para mostrar total de alumnos aprobados y reprobados
    public void mostrarTotales() {
        System.out.println("");
        System.out.println("**********************************");
        System.out.println("Alumnos Aprobados: " + Aprobados);
        System.out.println("Alumnos Reprobados: " + Reprobados);
        System.out.println("**********************************");
    }

    //Metodo registrar mas alumnos que devuelva texto
    public String preguntarOtroAlumno() {
        entrada.nextLine(); // Consumir salto de linea pendiente
        System.out.println("¿Desea registrar otro alumo? (si/no): ");
        String respuesta = entrada.nextLine(); //Permite guardar un string
        return (respuesta);   //Retorna la variable 
    }

    //Metodo calcularPromedioGeneral
    public void calcularPromedioGeneral() {
        System.out.println("");
        if (Aprobados + Reprobados > 0) {
            PromedioGeneral = SumaPromedios / (Aprobados + Reprobados);
            System.out.println("-----------------------------------");
            System.out.println("El promedio general de los alumnos es: " + PromedioGeneral);
            System.out.println("-----------------------------------");
        } else {
            System.out.println("-----------------------------------");
            System.out.println(" Error, no hay alumnos registrados.");
            System.out.println("-----------------------------------");
        }
    }

}
