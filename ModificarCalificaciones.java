package calificaciones;

import java.util.Scanner;

public class ModificarCalificaciones {

    public int alumnoSeleccionado;
    public int posicionAlumno;
    private SistemaCalificaciones sistema;
    public String nombreAlumno;
    double primeraCalificacion;
    double segundaCalificacion;
    double terceraCalificacion;

    //Constructor
    public ModificarCalificaciones(SistemaCalificaciones sistema) {
        this.sistema = sistema;
    }

    //Metodo modificar
    public void modificarCalificacion() {
        int total = sistema.getContadorAlumnos();

        //Recorrer arreglo de alumnos registrados, mostrar lista
        for (int i = 0; i < total; i++) {
            String nombre = sistema.getNombreAlumno(i);

            System.out.println((i + 1) + ". " + nombre);
        }
        System.out.println("Que numero del alumno deseas modificar:");
        Scanner modificar = new Scanner(System.in);
        alumnoSeleccionado = modificar.nextInt();

        //condicional para el alumno selecionado
        if (alumnoSeleccionado >= 1 && alumnoSeleccionado <= total) {
            posicionAlumno = alumnoSeleccionado - 1;
            System.out.println("Seleccion valida.");

            //Recuperar calificacion y guardar en variable de calificacion
            nombreAlumno = sistema.getNombreAlumno(posicionAlumno);
            primeraCalificacion = sistema.getPrimeraCalificacion(posicionAlumno);
            segundaCalificacion = sistema.getSegundaCalificacion(posicionAlumno);
            terceraCalificacion = sistema.getTerceraCalificacion(posicionAlumno);

            System.out.println("\n nombreAlumno: " + nombreAlumno
                    + "\n Primera calificacion " + primeraCalificacion
                    + "\n Segunda calificacion " + segundaCalificacion
                    + "\n Tercera calificacion " + terceraCalificacion);
            //solicita y guarda las nuevas calificaciónes en el arreglo
            sistema.setPrimeraCalificacion(posicionAlumno);
            primeraCalificacion = sistema.getPrimeraCalificacion(posicionAlumno);

            sistema.setSegundaCalificacion(posicionAlumno);
            segundaCalificacion = sistema.getSegundaCalificacion(posicionAlumno);

            sistema.setTerceraCalificacion(posicionAlumno);
            terceraCalificacion = sistema.getTerceraCalificacion(posicionAlumno);

            //Llamar al metodo para promedio d alumno seleccionado
            sistema.calcularPromedioAlumnoSeleccionado(posicionAlumno);

            System.out.print("\nNueva primera calificacion: " + primeraCalificacion
                    + "\nNueva segunda calificacion: " + segundaCalificacion
                    + "\nNueva tercera calificacion: " + terceraCalificacion);

        } else {
            System.out.println("Seleccion invalida.");
        }
    }

}
