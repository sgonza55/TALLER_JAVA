/*
 * Taller 3 - Canteras I - Sofka U
 */

import java.io.Console;

/**
 * Programa que registra la entrada y salida de un taller de motos, cons sus
 * respectivas novedades y observaciones.
 * 
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */

public class Main {

    public static String placa;
    public static String observacionesCliente;
    public static String novedades;
    public static String repuestos;
    public static Integer seleccion;

    public static void main(String[] args) {

        System.out.println("!Bienvenido al taller de motos El Maquinista");
        System.out.println("");

        int interr = 1;
        int interrMenu = 1;

        Console console = System.console();

        while (interrMenu == 1) {
            System.out.println("Ingrese 1 para registrar ingreso de vehiculo.");
            System.out.println("Ingrese 2 para registrar salida de vehiculo.");
            System.out.println(" ");
            seleccion = Integer.parseInt((console.readLine("Ingrese selección: ")));
            System.out.println(" ");

            if (seleccion == 1) {
                do {
                    placa = ((console.readLine("Ingrese placa: ")));
                    observacionesCliente = ((console.readLine("Ingrese observaciones del cliente: ")));
                    ingresos moto = new ingresos(placa, observacionesCliente);
                    moto.displayIngreso();

                    interr = Integer
                            .parseInt((console.readLine("Ingrese 1 para añadir nuevo ingreso vehiculo o ingrese 0"
                                    + " para salir de esta sección: ")));
                } while (interr == 1);

            } else if (seleccion == 2) {
                do {
                    placa = ((console.readLine("Ingrese placa: ")));
                    novedades = ((console.readLine("Ingrese repuestos usados por el mecanico: ")));
                    novedades = ((console.readLine("Ingrese novedades realizadas por el mecanico: ")));
                    salidas moto = new salidas(placa, novedades, repuestos);
                    moto.displaySalida();
                    interr = Integer.parseInt((console.readLine("Ingrese 1 para agregar mas salidas o ingrese 0"
                            + " para salir de esta sección: ")));
                } while (interr == 1);
            }
            interrMenu = Integer.parseInt((console.readLine("Ingrese 1 para regresar al menú principal"
                    + " o ingrese 0 para salir del programa: ")));
            System.out.println(" ");
        }

    }
}