/*
 * Taller 3 - Canteras I - Sofka U
 */

/**
 * Programa que registra hasta 20 número enteros positivos (sin contar el 0)
 * en un vector y finalmente imprime en consola los números enteros pares y los
 * impares.
 * 
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */

public class Main {

    public static void main(String[] args) {

        Integer vector[] = new Integer[20];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) Math.floor(Math.random() * (100) + 1);
            System.out.print(vector[i]);
            System.out.print("\t");
        }
        System.out.print("\n");

        System.out.print("\n");
        System.out.println("Los siguientes números son pares: ");
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) {
                System.out.print(vector[i]);
                System.out.print("\t");
            }
        }
        System.out.print("\n");

        System.out.print("\n");
        System.out.println("Los siguientes números son impares: ");
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 != 0) {
                System.out.print(vector[i]);
                System.out.print("\t");
            }
        }

    }
}