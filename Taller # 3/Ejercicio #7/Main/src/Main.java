/*
 * Taller 3 - Canteras I - Sofka U
 */

import java.io.Console;
import java.util.Scanner;

/**
 * Programa que registra la entrada y salida de vehiculos en un parqueadero.
 * 
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */

public class Main {

    public static String placa;
    public static String marca;
    public static String dueño;
    public static String telefono;
    public static Integer seleccion;

    public static void main(String[] args) {

        System.out.println("!Bienvenido al Parqueadero El Guardian");
        System.out.println("");

        parqueadero[] parqueadero = new parqueadero[5];
        int cont = 0;
        int interr = 1;
        int interrMenu = 1;
        int ocupacionParqueadero = 0;

        Console console = System.console();
        Scanner input = new Scanner(System.in);

        while (interrMenu == 1) {
            System.out.println("Ingrese 1 para registrar ingreso de vehiculo.");
            System.out.println("Ingrese 2 para registrar salida de vehiculo.");
            System.out.println("Ingrese 3 para buscar si el vehicula esta en el parqueadero.");
            System.out.println(" ");
            seleccion = Integer.parseInt((console.readLine("Ingrese selección: ")));

            if (seleccion == 1) {
                do {
                    if (ocupacionParqueadero<5){
                        vehiculo vehiculo = new vehiculo();
                        System.out.println(" ");
                        System.out.println("Ingrese placa del vehiculo: ");
                        vehiculo.setPlaca(input.next());
                        System.out.println("Ingrese nombre completo del dueño del vehiculo: ");
                        vehiculo.setDueño(input.next());
                        System.out.println("Ingrese modelo del vehiculo: ");
                        vehiculo.setMarca(input.next());
                        System.out.println("Ingrese telefono del dueño del vehiculo: ");
                        vehiculo.setTelefono(input.next());
                        System.out.println(" ");
                        parqueadero ingresoVehiculo = new parqueadero(vehiculo.getPlaca(), vehiculo.getDueño(),
                                vehiculo.getMarca(), vehiculo.getTelefono());
                        parqueadero[ocupacionParqueadero] = ingresoVehiculo;
                        System.out.println("El siguiente vehiculo fue registrado exitosamente: ");
                        System.out.println(" ");
                        ingresoVehiculo.displayParqueadero();
                        System.out.println(" ");
                        ocupacionParqueadero = ocupacionParqueadero + 1;

                    } else{
                        System.out.println("El parqueadero esta lleno.");
                        System.out.println(" ");
                    }

                    interr = Integer
                            .parseInt((console.readLine("Ingrese 1 para añadir nuevo ingreso vehiculo o ingrese 0"
                                    + " para salir de esta sección: ")));
                } while (interr == 1);

            } else if (seleccion == 2) {
                do {
                    System.out.println(" ");
                    System.out.println("Ingrese placa del vehiculo: ");
                    vehiculo salida = new vehiculo();
                    salida.setPlaca(input.next());
                    for (int i = 0; i < ocupacionParqueadero; i++) {
                        if (salida.getPlaca().equals(parqueadero[i].getPlaca())) {
                            System.out.println("El siguiente vehiculo se encontró en el parquedero: ");
                            System.out.println(" ");
                            parqueadero[i].displayParqueadero();
                            System.out.println(" ");
                            int add = 0;
                            ocupacionParqueadero = ocupacionParqueadero - 1;
                            System.out.println("La salida fue registrada exitosamente.");
                            System.out.println(" ");
                            cont = cont + 1;
                            for (int j = 0; j < ocupacionParqueadero - i; j++) {
                                parqueadero[i + add] = parqueadero[i + add + 1];
                                add = add + 1;
                            }
                        }
                    }
                    if (cont == 0) {
                        System.out.println("El vehiculo NO se encontró en el parqueadero. ");
                        System.out.println(" ");
                    }
                    cont = 0;

                    interr = Integer.parseInt((console.readLine("Ingrese 1 para agregar mas salidas o ingrese 0"
                            + " para salir de esta sección: ")));
                } while (interr == 1);

            } else if (seleccion == 3) {
                do {
                    System.out.println(" ");
                    System.out.println("Ingrese placa del vehiculo: ");
                    placa = (input.next());
                    for (int i = 0; i < ocupacionParqueadero; i++) {
                        if (placa.equals(parqueadero[i].getPlaca())) {
                            System.out.println("El siguiente vehiculo se encontró en el parquedero: ");
                            System.out.println(" ");
                            parqueadero[i].displayParqueadero();
                            System.out.println(" ");
                            cont = cont + 1;
                        }
                    }
                    if (cont == 0) {
                        System.out.println("El vehiculo NO se encontró en el parqueadero. ");
                        System.out.println(" ");
                    }
                    cont = 0;
                    interr = Integer.parseInt((console.readLine("Ingrese 1 para buscar otro vehiculo o ingrese 0"
                            + " para salir de esta sección: ")));
                } while (interr == 1);
            }
            interrMenu = Integer.parseInt((console.readLine("Ingrese 1 para regresar al menú principal"
                    + " o ingrese 0 para salir del programa: ")));
            System.out.println(" ");
        }
 
        for (int j = 0; j < ocupacionParqueadero; j++) {
            parqueadero[j].displayParqueadero();
        }

    }
}