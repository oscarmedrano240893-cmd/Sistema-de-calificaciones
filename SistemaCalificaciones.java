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
    int contadorAlumnos = 0;

    //Arreglo para guardar varios nombres
    String[] nombreAlumnos = new String[10];
    double[] primeraCalificacion = new double[10];
    double[] segundaCalificacion = new double[10];
    double[] terceraCalificacion = new double[10];
    Scanner entrada = new Scanner(System.in);

    //Metodo Bienvenida
    public void bienvenida() {
        System.out.println("-------------------------");
        System.out.println("SISTEMA DE CALIFICACIONES");
        System.out.println("-------------------------");
        System.out.println("Bienvenido al sistema");
        System.out.println("");
    }

    /*   //METODO PROBAR ARREGLO
    public void probarArreglo() {

        //Guardar nombres de alumos en distintas posiciones
        nombreAlumnos[0] = "Ana";
        nombreAlumnos[1] = "Luis";
        nombreAlumnos[2] = "Pedro";
        String nombreBuscado = "Luis";  //variable con el ombre a buscar
        boolean encontrado = false;   //variable  que si se encuentra al alumno debe de ser false antes de buscar

        //for rrecore posiciones e if compara las posiciones y el nombre buscado
        for (int i = 0; i < 3; i++) {

            if (nombreAlumnos[i].equals(nombreBuscado)) {
                System.out.println("Alumno encontrado " + nombreBuscado);
                encontrado = true; // se cambia a true si el alumno existe

            }
            
        }
        //Condicion si no se encuentra al alumno
        if (encontrado == false) {
            System.out.println("Alumno no encontrado");
        }

    }
     */
    //Metodo capturar datos y validar que esten dentro del rango de 0 - 10
    public void capturarDatos() {
        System.out.println("¿Cual es tu nombre? ");
        Nombre = entrada.nextLine();
        nombreAlumnos[contadorAlumnos] = Nombre; //utilizar contador para guaradr nombre en el arreglo

        //Primer calificacion, repetir ciclo con do while
        do {
            System.out.print("Dame tu primer calificacion: ");
            PrimeraCalificacion = entrada.nextDouble();

            //utilizar contador para guaradr calificacion en el arreglo
            primeraCalificacion[contadorAlumnos] = PrimeraCalificacion;
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

            //utilizar contador para guaradr calificacion en el arreglo
            segundaCalificacion[contadorAlumnos] = SegundaCalificacion;
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

            //utilizar contador para guaradr calificacion en el arreglo
            terceraCalificacion[contadorAlumnos] = TerceraCalificacion;
            if (TerceraCalificacion >= 0 && TerceraCalificacion <= 10) {
                System.out.println("Calificacion valida");
            } else {
                System.out.println("Calificacion invalida, favor de introducir una calificacion valida");
            }
        } while (TerceraCalificacion < 0 || TerceraCalificacion > 10);
        contadorAlumnos++; //Aumentar contador 

    }

    //METODO BUSCAR ALUMNO
    public void buscarAlumno() {
        //Para guardar promedio individual
        double promedioAlumno;
        String buscar;

        do {

            System.out.println("Desea consultar algun alumno? (si/no)");
            buscar = entrada.nextLine();

            if (buscar.equalsIgnoreCase("si")) {
                //preguntar si se desea consultar algun alumno        

                System.out.print("Nombre del alumno que desea buscar: ");
                String nombreBuscado = entrada.nextLine();
                boolean alumnoBuscado = false; //variable  que si se encuentra al alumno debe de ser false antes de buscar

                //CICLO FOR recorre solo los alumnos registrados
                for (int i = 0; i < contadorAlumnos; i++) {

                    if (nombreBuscado.equals(nombreAlumnos[i])) { //comparar y utilizar el arreglo para la psosicion i
                        System.out.println("**************************************************");
                        System.out.print("El alumno: " + nombreAlumnos[i]
                                + "\nPrimera calificacion: " + primeraCalificacion[i]
                                + "\nSegunda calificacion: " + segundaCalificacion[i]
                                + "\nTercera calificacion: " + terceraCalificacion[i]); //Imprimir en pantalla
                        alumnoBuscado = true; // se cambia a true si el alumno existe
                        promedioAlumno = (primeraCalificacion[i] + segundaCalificacion[i] + terceraCalificacion[i]) / 3.0;
                        System.out.println("\nPromedio del alumno: " + nombreAlumnos[i] + ": " + promedioAlumno);
                        System.out.println("**************************************************");

                    }

                }
                //CONDICION SI NO SE ENCUENTRA ALUMNO
                if (alumnoBuscado == false) {
                    System.out.println("Alumno no esta registrado");

                }
            } else {
                System.out.println("No se desea hacer busqueda");

            }

        } while (buscar.equalsIgnoreCase("si"));
    }  // METODO mostrarAlumnos

    public void mostrarAlumnos() {

        for (int i = 0; i < contadorAlumnos; i++) {
            System.out.println("");
            System.out.println("Listado alumnos");
            System.out.println((i + 1) + ". " + nombreAlumnos[i]);

        }
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

    //Metodo contador de alumnos
    public int getContadorAlumnos() {
        return contadorAlumnos;
    }

    //Metodo devolver nombre y podicion
    public String getNombreAlumno(int posicion) {
        return nombreAlumnos[posicion];
    }

    //Metodo obtener primera calificacion
    public double getPrimeraCalificacion(int posicion) {
        return primeraCalificacion[posicion];
    }

    //Metodo obtener segunda calificacion
    public double getSegundaCalificacion(int posicion) {
        return segundaCalificacion[posicion];
    }

    //Metodo obtener tercera calificacion
    public double getTerceraCalificacion(int posicion) {
        return terceraCalificacion[posicion];
    }

    //Metodo modificar datos
    public void setPrimeraCalificacion(int posicion) {
        System.out.print("Dame el nuevo valor de la primera calificacion: ");
        double nuevaCalificacion = entrada.nextDouble();
        primeraCalificacion[posicion] = nuevaCalificacion;
    }

    //Metodo modificar segunda calificacion
    public void setSegundaCalificacion(int posicion) {
        System.out.print("Dame el nuevo valor de la segunda calificacion: ");
        double nuevaCalificacion = entrada.nextDouble();
        segundaCalificacion[posicion] = nuevaCalificacion;
    }
    //Metodo modificar terecera calificacion

    public void setTerceraCalificacion(int posicion) {
        System.out.println("Dame el nuevo valor para la tercera calificacion: ");
        double nuevaCalificacion = entrada.nextDouble();
        terceraCalificacion[posicion] = nuevaCalificacion;
    }

    //Metodo calcular promedio del alumno seleccionado
    public void calcularPromedioAlumnoSeleccionado(int posicion) {
        double promedio = (primeraCalificacion[posicion] + segundaCalificacion[posicion]
                + terceraCalificacion[posicion]) / 3.0;
        System.out.println("Alumno: " + nombreAlumnos[posicion]
                + "\nPromedio: " + promedio);

    }

}
