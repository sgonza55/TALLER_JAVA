/*
 * Taller 3 - Canteras I - Sofka U
 */

import java.io.Console;

/**
 * Programa para registrar alquieleres de peliculas, revisar disponibilidad
 * (inventario) y
 * registrar devoluciones.
 * 
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */

public class Main {

    public static String cliente;
    public static String tituloPelicula;
    public static Integer seleccion;

    public static void main(String[] args) {

        pelicula[] peliculasDisponibles = new pelicula[1000];
        peliculasDisponibles[0] = new pelicula("Dr. Strange - Universe of Madness");
        peliculasDisponibles[1] = new pelicula("The Incredibles");
        peliculasDisponibles[2] = new pelicula("Luca");
        peliculasDisponibles[3] = new pelicula("Shrek 3");
        peliculasDisponibles[4] = new pelicula("Mission Imposible 2");

        bancoPeliculas[] alquileres = new bancoPeliculas[1000];
        bancoPeliculas[] devoluciones = new bancoPeliculas[1000];
        int alquileresRegistrados = 0;
        int devolucionesRegistradas = 0;
        int peliculas = 5;
        int cont = 0;
        int interr = 1;
        int interrMenu = 1;

        System.out.println("Bienvenido a la video tienda del Porvenir");
        System.out.println("");
        Console console = System.console();

        while (interrMenu == 1) {
            System.out.println("Ingrese 1 para registrar alquiler.");
            System.out.println("Ingrese 2 consultar peliculas disponibles.");
            System.out.println("Ingrese 3 para registrar regreso de pelicula");
            seleccion = Integer.parseInt((console.readLine("Ingrese selección: ")));
            System.out.println("");

            if (seleccion == 1) {
                do {
                    cliente = ((console.readLine("Ingrese nombre del cliente: ")));
                    tituloPelicula = ((console.readLine("Ingrese titulo de la pelicula: ")));
                    for (int i = 0; i < peliculas; i++) {
                        if (tituloPelicula.equals(peliculasDisponibles[i].getTituloPelicula())) {
                            System.out.println(peliculasDisponibles[i].getTituloPelicula());
                            System.out.println("La siguiente pelicula si esta disponible: ");
                            peliculasDisponibles[i].display();
                            int add = 0;
                            peliculas = peliculas - 1;
                            for (int j = 0; j < peliculas - i; j++) {
                                peliculasDisponibles[i + add] = peliculasDisponibles[i + add + 1];
                                add = add + 1;
                            }
                            cont = cont + 1;
                            bancoPeliculas alquiler = new bancoPeliculas(cliente, tituloPelicula);
                            alquileres[alquileresRegistrados] = alquiler;
                            alquileres[alquileresRegistrados].display();
                            alquileresRegistrados = alquileresRegistrados + 1;
                        }
                    }
                    if (cont == 0) {
                        System.out.println("No esta esa pelicula");
                    }
                    cont = 0;
                    interr = Integer.parseInt((console.readLine("Ingrese 1 para otro alquiler o ingrese 0"
                            + " para salir de sección de alquileres: ")));
                } while (interr == 1);
                System.out.println("Los alquieleres registrados hasta el momento son las siguientes: ");
                System.out.println(" ");
                for (int i = 0; i < alquileresRegistrados; i++) {
                    alquileres[i].display();
                    System.out.println(" ");
                }

            } else if (seleccion == 2) {
                do {
                    System.out.println("Los peliculas disponibles son las siguientes: ");
                    System.out.println(" ");
                    for (int i = 0; i < peliculas; i++) {
                        peliculasDisponibles[i].display();
                        System.out.println(" ");
                    }
                    interr = 0;
                } while (interr == 1);

            } else if (seleccion == 3) {
                do {
                    cliente = ((console.readLine("Ingrese nombre del cliente: ")));
                    tituloPelicula = ((console.readLine("Ingrese titulo de la pelicula: ")));
                    bancoPeliculas devolucion = new bancoPeliculas(cliente, tituloPelicula);
                    pelicula pelicula = new pelicula(tituloPelicula);
                    peliculas = peliculas + 1;
                    peliculasDisponibles[peliculas - 1] = pelicula;
                    devoluciones[devolucionesRegistradas] = devolucion;
                    devoluciones[devolucionesRegistradas].display();
                    devolucionesRegistradas = devolucionesRegistradas + 1;
                    interr = Integer.parseInt((console.readLine("Ingrese 1 para agregar otra devolución o ingrese 0"
                            + " para salir de sección de devoluciones: ")));
                } while (interr == 1);
                System.out.println("Las devoluciones registradas hasta el momento son las siguientes: ");
                System.out.println(" ");
                for (int i = 0; i < devolucionesRegistradas; i++) {
                    devoluciones[i].display();
                    System.out.println(" ");
                }
            }
            interrMenu = Integer.parseInt((console.readLine("Ingrese 1 para regresar al menú principal"
                    + " o ingrese 0 para salir del programa: ")));
            System.out.println("");
        }
    }
}