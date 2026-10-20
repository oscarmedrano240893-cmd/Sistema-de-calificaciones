package main;
import calificaciones.SistemaCalificaciones; // Importacion de la clase y paquete calificaciones

public class Main {

    public static void main(String[] args) {

        //Llamar Metodos
        SistemaCalificaciones sistema = new SistemaCalificaciones();
        sistema.bienvenida();
        sistema.capturarDatos();
    }

}
