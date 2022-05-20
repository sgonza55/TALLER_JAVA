/*
 * Taller 3 - Canteras I - Sofka U
 */

import java.io.Console;

/**
 * Programa que registra hasta 5 número enteros en un vector y finalmente los 
 * imprime en consola con su respectiva ubicación en el vector. 
 * 
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */

public class Main {

    public static void main(String[] args) {

        Integer vector[] = new Integer[5];

        Console console = System.console();

        for (int i = 0; i < vector.length; i++) {
            vector[i] = Integer.parseInt((console.readLine("Ingrese un número entero: ")));
        }

        for (int i = 0; i < vector.length; i++) {
            System.out.println("[" + i + "]" + " = " + vector[i]);
        }

    }
}