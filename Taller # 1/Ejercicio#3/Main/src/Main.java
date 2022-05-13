/*
 * Taller 3 - Canteras I - Sofka U
 */

import java.io.Console;

/**
 * Programa que solicita nombre, apellidos y nombres de la madre y el padre. 
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */

public class Main {

    public static String nombre;
    public static String primerApellido;
    public static String segundoApellido;
    public static String nombreMadre;
    public static String nombrePadre;

    public static void main(String[] args) {

        Console console = System.console();
        String nombre = console.readLine("Ingrese su nombre: ");
        String primerApellido = console.readLine("Ingrese su primer apellido: ");
        String segundoApellido = console.readLine("Ingrese su segundo apellido: ");
        String nombreMadre = console.readLine("Ingrese el nombre de su madre: ");
        String nombrePadre = console.readLine("Ingrese el nombre de su padre: ");

        
        System.out.println("Yo " + nombre + " " + primerApellido + " " + segundoApellido
        + " soy hijo de " + nombreMadre + " y " + nombrePadre + ".");
    }
}
