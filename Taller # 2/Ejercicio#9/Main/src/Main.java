/*
 * Taller 3 - Canteras I - Sofka U
 */

import java.util.Scanner;

/**
 * Programa que calcula al área de algunas figuras geometricas. 
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */

public class Main {

    public static Integer figura;

    public static void main(String[] args) {

        Scanner entradaEscaner = new Scanner (System.in);
        System.out.println("Ingrese 1 si la figura es un rectángulo.");
        System.out.println("Ingrese 2 si la figura es un triángulo.");
        System.out.println("Ingrese 3 si la figura es un trapecio.");
        figura = (entradaEscaner.nextInt()); 

        if (figura==1){
            rectangulo rectangulo = new rectangulo();
            System.out.println("Ingrese lado mayor del rectángulo en metros: ");
            rectangulo.setLadoMayor((entradaEscaner.nextFloat()));
            System.out.println("Ingrese lado mayor del rectángulo en metros: ");
            rectangulo.setLadoMenor((entradaEscaner.nextFloat()));
            rectangulo.areaRectangulo(rectangulo.getLadoMayor(), rectangulo.getLadoMenor());
            System.out.println("El área del rectángulo en m2 es: " + rectangulo.getArea());

        } else if (figura==2){
            triangulo triangulo = new triangulo();
            System.out.println("Ingrese altura del triángulo en metros: ");
            triangulo.setAltura((entradaEscaner.nextFloat()));
            System.out.println("Ingrese base del triángulo en metros: ");
            triangulo.setBase((entradaEscaner.nextFloat()));
            triangulo.areaTriangulo(triangulo.getAltura(), triangulo.getBase());
            System.out.println("El área del triángulo en m2 es: " + triangulo.getArea());

        } else if (figura==3){
            trapecio trapecio = new trapecio();
            System.out.println("Ingrese base mayor del trapecio en metros: ");
            trapecio.setbaseMayor((entradaEscaner.nextFloat()));
            System.out.println("Ingrese base menor del trapecio en metros: ");
            trapecio.setbaseMenor((entradaEscaner.nextFloat()));
            System.out.println("Ingrese altura del trapecio en metros: ");
            trapecio.setAltura((entradaEscaner.nextFloat()));
            trapecio.areaTrapecio(trapecio.getbaseMayor(), trapecio.getbaseMenor(), trapecio.getAltura());
            System.out.println("El área del trapecio en m2 es: " + trapecio.getArea());
        }
    }
}
