/*
 * Taller 3 - Canteras I - Sofka U
 */

import java.io.Console;

/**
 * Programa que define si una persona es menor de edad (menor a 18 años).
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */

public class Main {

    public static String nombre;
    public static String primerApellido;
    public static String segundoApellido;
    public static String nombreCompleto;
    public static Integer edad;

    public static void main(String[] args) {

        Console console = System.console();
        String nombre = (console.readLine("Ingrese su nombre: "));
        String primerApellido = (console.readLine("Ingrese su primer apellido: "));
        String segundoApellido = (console.readLine("Ingrese su segundo apellido: "));
        String nombreCompleto = nombre + " " + primerApellido + " " + segundoApellido;
        Integer edad = Integer.parseInt(console.readLine("Ingrese su edad: "));

        if (edad>=18){
            System.out.println(nombreCompleto + " usted es mayor de edad, por lo tanto puede entrar a la fiesta.");
        } else if (edad<18) {
            System.out.println(nombreCompleto + " usted es menor de edad, por lo tanto, no puede entrar a la fiesta, " 
            + "por favor devuélvase a su casa.");
        }
    }
}
