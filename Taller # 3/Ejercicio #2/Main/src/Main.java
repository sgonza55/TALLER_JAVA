/*
 * Taller 3 - Canteras I - Sofka U
 */

/**
 * Programa que utiliza el ciclo while para imprimir variables con un espaciado inicial de 10.
 * 
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */

public class Main {

    public static String X;

    public static void main(String[] args) {

        int cont = 0;
        X = "*";
        while (cont < 10) {
            System.out.printf("%10s\n", X);
            X = X + "*";
            cont = cont + 1;
        }
    }
}