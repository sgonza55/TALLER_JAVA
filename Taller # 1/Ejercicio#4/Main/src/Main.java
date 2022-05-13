/*
 * Taller 3 - Canteras I - Sofka U
 */

import java.io.Console;

/**
 * Programa que solicita nombre de un país y su respectiva ciudad capital. 
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */

public class Main {

    public static String ciudadCapital;
    public static String pais;

    public static void main(String[] args) {

        Console console = System.console();
        String ciudadCapital = console.readLine("Ingrese nombre de la ciudad capital: ");
        String pais = console.readLine("Ingrese nombre del país: ");
        
        System.out.println("La ciudad " + ciudadCapital + ", es la capital del país " + pais + ".");
    }
}