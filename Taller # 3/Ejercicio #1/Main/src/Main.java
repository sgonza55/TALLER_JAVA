/*
 * Taller 3 - Canteras I - Sofka U
 */

/**
 * Programa que utiliza el ciclo for para imprimir variables. 
 * 
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */

public class Main {

    public static String X;

    public static void main(String[] args) {

        X = "*";
        for (int i = 1; i <= 10; i++) {
            System.out.println(X);
            X = X + "*";
        }

    }
}