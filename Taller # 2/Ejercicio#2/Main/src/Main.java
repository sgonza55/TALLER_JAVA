/*
 * Taller 3 - Canteras I - Sofka U
 */

import java.io.Console;

/**
 * Programa que define si una persona es menor de edad (menor a 18 años).
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */

public class Main {

    public static Integer edad;

    public static void main(String[] args) {

        Console console = System.console();
        Integer edad = Integer.parseInt(console.readLine("Ingrese su edad: "));

        if (edad<18){
            System.out.println("Usted es un niño(a).");
        }
    }
}
