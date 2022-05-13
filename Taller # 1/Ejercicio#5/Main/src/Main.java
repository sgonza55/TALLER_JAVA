/*
 * Taller 3 - Canteras I - Sofka U
 */

import java.io.Console;

/**
 * Programa que solicita nombre, tipo y edad de una mascota, y el nombre completo del dueño.
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */

public class Main {

    public static String nombre;
    public static String primerApellido;
    public static String segundoApellido;
    public static String nombreCompleto;
    public static String nombreMascota;
    public static String tipoMascota;
    public static Integer edadMascota;

    public static void main(String[] args) {
        Console console = System.console();

        String nombre = console.readLine("Ingrese su nombre: ");
        String primerApellido = console.readLine("Ingrese su primer apellido: ");
        String segundoApellido = console.readLine("Ingrese su segundo apellido: ");
        String nombreCompleto = nombre + " " + primerApellido + " " + segundoApellido;
        String nombreMascota = console.readLine("Ingrese el nombre de su mascota: ");
        String tipoMascota = console.readLine("Ingrese el tipo de su mascota: ");
        Integer edadMascota = Integer.parseInt(console.readLine("Ingrese edad de la mascota: "));
        
        System.out.println(nombreMascota + " es un(a) " + tipoMascota + ", el cual, tiene " + edadMascota
        + " años de edad y " + nombreCompleto + " es actualmente su dueño. ");
    }
}