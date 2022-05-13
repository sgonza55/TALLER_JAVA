import java.io.Console;

/*
 * Taller 3 - Canteras I - Sofka U
 */

/**
 * Programa que calcula las tablas de multiplicar del 1 al 10 (números enteros) 
 * de un número dado por el usuario.
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */

public class Main {

    public static Integer numero;
    public static Integer multiplicador;
    public static Integer resultado;

    public static void main(String[] args) {

        Console console = System.console();
        numero = Integer.parseInt(console.readLine("Ingrese un número entero: "));
        multiplicador = 1;

        for (int i = 1; i <= 10; i++) {
            resultado = numero * multiplicador;
            System.out.println(multiplicador + " x " + numero + " = " + resultado);
            multiplicador = multiplicador + 1;
        }
    }
}