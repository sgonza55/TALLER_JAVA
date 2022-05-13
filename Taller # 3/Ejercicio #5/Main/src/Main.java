/*
 * Taller 3 - Canteras I - Sofka U
 */

import java.io.Console;

/**
 * Programa que ejecuta un menú infinito mediante ciclo do-while
 * que finaliza cuando el usuario desee terminarlo
 * 
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */

public class Main {

    public static String nombre;
    public static Integer seleccion;

    public static void main(String[] args) {

        System.out.println("Menú de usuario");

        int interrMenu = 1;
        Console console = System.console();

        while (interrMenu == 1) {
            System.out.println("");
            System.out.println("Ingrese 1 para capturar nombre.");
            System.out.println("Ingrese 2 saludar persona.");
            System.out.println("Ingrese 3 Salir del sistema.");
            System.out.println("");
            seleccion = Integer.parseInt((console.readLine("Ingrese selección: ")));
            System.out.println("");

            if (seleccion == 1) {
                nombre = ((console.readLine("Ingrese nombre: ")));
                System.out.println("El nombre ingresado es: " + nombre + ".");

            } else if (seleccion == 2) {
                if (nombre == null) {
                    System.out.println("No se ha capturado ningún nombre.");
                } else {
                    System.out.println("¡Hola " + nombre + "!");
                }

            } else if (seleccion == 3) {
                interrMenu = 0;
            }
        }
    }
}