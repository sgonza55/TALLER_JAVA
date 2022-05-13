/*
 * Taller 3 - Canteras I - Sofka U
 */

 import java.io.Console;

/**
 * Programa que solicita nombre y apellidos
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */

public class Main {
    public static String nombre;
    public static String primerApellido;
    public static String segundoApellido;

    public static void main(String[] args) {

        Console console = System.console();
        String nombre = console.readLine("Ingrese su nombre: ");
        String primerApellido = console.readLine("Ingrese su primer apellido: ");
        String segundoApellido = console.readLine("Ingrese su segundo apellido: ");
        System.out.println("Mi nombre completo es: " + nombre + " " + primerApellido + " " + segundoApellido);
    }
}
