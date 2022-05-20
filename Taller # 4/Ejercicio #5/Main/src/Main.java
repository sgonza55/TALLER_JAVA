/*
 * Taller 3 - Canteras I - Sofka U
 */

import java.io.Console;

/**
 * Programa que imprime un arreglo bidimensional con las tablas de multiplicar del 1 al 10
 * hasta el número 10, y el usuario pide que número de fila y resultado desea ver. 
 * 
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */

public class Main {

    public static void main(String[] args) {

        Integer matriz[][] = new Integer[10][10];
        
        Console console = System.console();

        System.out.println("La matriz inicial es la siguiente: ");

        int cont = 1;

        for (int x = 0; x < matriz.length; x++) {
            System.out.print("|");
            int multiplicador = 1;
            for (int y = 0; y < matriz[x].length; y++) {
                matriz[x][y] = cont*multiplicador;
                multiplicador = multiplicador + 1;
                System.out.print(matriz[x][y]);
                if (y != matriz[x].length - 1)
                    System.out.print("\t");
            }
            cont = cont + 1;
            System.out.println("|");
        }

        int fila = Integer.parseInt((console.readLine("\n" +"Ingrese número de fila en la cual quiere ver el resultado: ")));
        int columna = Integer.parseInt((console.readLine("Ingrese número de columna en la cual quiere ver el resultado: ")));

        System.out.println("\n" + "El valor encontrado en la matriz es el siguiente: " + matriz[fila][columna]);


    }

}