/*
 * Taller 3 - Canteras I - Sofka U
 */

import java.io.Console;

/**
 * Programa que solicita nombre, apellidos, edad y estatura
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */

public class Main {
    public static String nombre;
    public static String primerApellido;
    public static String segundoApellido;
    public static Integer edad;
    public static float estatura;   

    public static void main(String[] args) {

        Console console = System.console();
        String nombre = console.readLine("Ingrese su nombre: ");
        String primerApellido = console.readLine("Ingrese su primer apellido: ");
        String segundoApellido = console.readLine("Ingrese su segundo apellido: ");
        Integer edad = Integer.parseInt(console.readLine("Ingrese su edad: "));
        float estatura = Float.parseFloat(console.readLine("Ingrese su estatura en metros: "));
        
        System.out.println("Mi nombre completo es " + nombre + " " + primerApellido + " " + segundoApellido
        + " tengo " + edad + " años y mido " + estatura + "m.");
    }
}
