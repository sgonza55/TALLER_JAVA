/*
 * Taller 3 - Canteras I - Sofka U
 */

/**
 * Programa que imprime todos los números primos de que hay del 1 al 1000.
 * 
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */

public class Main {

    public static void main(String[] args) {

        Integer vector[] = new Integer[1000];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = i+1;
        }

        for (int i = 0; i < vector.length; i++) {
            if (primo(vector[i])) {
                System.out.println("El número " + vector[i] + " no es primo");
            }
        }
    }

    public static boolean primo(int numero) {

        if (numero <= 1) {
            return false;
        }

        int contador = 0;

        for (int i = (int) Math.sqrt(numero); i > 1; i--) {
            if (numero % i == 0) {
                contador++;
            }
        }

        return contador < 1;
    }

}