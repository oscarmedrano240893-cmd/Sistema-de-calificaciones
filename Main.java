package main;

import calificaciones.SistemaCalificaciones; // Importacion de la clase y paquete calificaciones

public class Main {
   

    public static void main(String[] args) {
        
        String respuesta;
        //Objeto para comunicar las clases
        SistemaCalificaciones sistema = new SistemaCalificaciones();
        
//Llamar metodos y dar ciclo por si se quiere guardar otro alumno
        do{
        sistema.bienvenida();
        sistema.capturarDatos();
        //sistema.modificarPrimeraCalificacion();
        sistema.mostrarDatos();
        sistema.calcularPromedio();
        sistema.verificarAprobacion();
        respuesta = sistema.preguntarOtroAlumno(); //Guardar respuesta y llamar metodo para otro alumno
            
        } 
        while (respuesta.equalsIgnoreCase("si"));
        sistema.mostrarTotales();  //Metodo que muestra aprobados y reprobados
        
    }

}
