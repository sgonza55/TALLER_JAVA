/*
 * Taller 3 - Canteras I - Sofka U
 */

/**
 * Programa que organiza de mayor a menor los datos de las filas 2 y 4 de una matriz con minimo 4 filas. 
 * 
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */

public class Main {

    public static void main(String[] args) {

        Integer matriz[][] = new Integer[4][5];

        System.out.println("La matriz inicial es la siguiente: ");

        Integer cont = 1;

        for (int x = 0; x < matriz.length; x++) {
            System.out.print("|");
            for (int y = 0; y < matriz[x].length; y++) {
                matriz[x][y] = cont;
                cont = cont + 1;
                System.out.print(matriz[x][y]);
                if (y != matriz[x].length - 1)
                    System.out.print("\t");
            }
            System.out.println("|");
        }

        int auxiliar;
        for (int x = 0; x < matriz.length; x++) {
            if (x==1){
                for (int i = 1; i < matriz.length+1; i++) {
                    for (int j = 0; j < matriz[x].length - i; j++) {
                        if (matriz[x][j + 1] > matriz[x][j]) {
                            auxiliar = matriz[x][j];
                            matriz[x][j] = matriz[x][j + 1];
                            matriz[x][j + 1] = auxiliar;
                        }
                    }
                }
            }
            if (x==3){
                for (int i = 1; i < matriz.length+1; i++) {
                    for (int j = 0; j < matriz[x].length - i; j++) {
                        if (matriz[x][j + 1] > matriz[x][j]) {
                            auxiliar = matriz[x][j];
                            matriz[x][j] = matriz[x][j + 1];
                            matriz[x][j + 1] = auxiliar;
                        }
                    }
                }
            }
        }

        System.out.print("\n");
        System.out.println("\n" + "La matriz organizada es la siguiente: ");
        for (int x = 0; x < matriz.length; x++) {
            System.out.print("|");
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print(matriz[x][y]);
                if (y != matriz[x].length - 1)
                    System.out.print("\t");
            }
            System.out.println("|");
        }

    }

}