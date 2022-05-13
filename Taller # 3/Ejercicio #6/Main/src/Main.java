/*
 * Taller 3 - Canteras I - Sofka U
 */

import java.io.Console;
import java.util.Scanner;

/**
 * Programa para almacenar contactos telefonicos, el cual verifica si el 
 * numero estaba ya en la lista (directorio), ademas, permite borrar contactos e 
 * indagar los contactos guardados. 
 * 
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */

public class Main {

    public static String nombre;
    public static String organizacion;
    public static Integer seleccion;

    public static void main(String[] args) {

        directorio[] directorio = new directorio[1000];
        directorio[0] = new directorio("Julian Alvarez", 9662325, "Universidad EAFIT");
        directorio[1] = new directorio("Juan Arcila", 1234569, "Universidad Medellin");
        directorio[2] = new directorio("Luisa Alvarez", 7894563, "Alcaaldia");
        directorio[3] = new directorio("Pedro Tamayo", 9874561, "Sofka");

        int contactos = 4;
        int cont = 0;
        int interr = 1;
        int interrMenu = 1;

        System.out.println("Menú principal");
        System.out.println("");
        Console console = System.console();
        Scanner entradaEscaner = new Scanner(System.in);

        while (interrMenu == 1) {
            System.out.println("Ingrese 1 para añadir contacto.");
            System.out.println("Ingrese 2 para consultar contactos almacenados.");
            System.out.println("Ingrese 3 para eliminar contactos");
            seleccion = Integer.parseInt((console.readLine("Ingrese selección: ")));
            System.out.println("");

            if (seleccion == 1) {
                do {
                    contacto contacto = new contacto();
                    System.out.println("Ingrese nombre del cliente: ");
                    contacto.setNombre((entradaEscaner.next()));
                    System.out.println("Ingrese organizacion: ");
                    contacto.setOrganizacion((entradaEscaner.next()));
                    System.out.println("Ingrese telefono del contacto: ");
                    contacto.setTelefono((entradaEscaner.nextInt()));
                    directorio contactoDirectorio = new directorio(contacto.getNombre(), contacto.getTelefono(),
                            contacto.getOrganizacion());
                    int aval = 1;

                    for (int i = 0; i < contactos; i++) {
                        if (contacto.getTelefono().equals(directorio[i].getTelefono())) {
                            System.out.println("");
                            System.out.println(directorio[i].getTelefono());
                            System.out.println("El número ya esta registrado.");
                            aval = 0;
                        }
                    }
                    if (aval == 1) {
                        directorio[contactos] = contactoDirectorio;
                        System.out.println("El número fue registrado con éxito.");
                        directorio[contactos].display();
                        contactos = contactos + 1;
                    }
                    interr = Integer.parseInt((console.readLine("Ingrese 1 para agregar otro contacto o ingrese 0"
                            + " para salir de esta sección: ")));
                } while (interr == 1);

            } else if (seleccion == 2) {
                do {
                    System.out.println("Los contactos en el directorio son las siguientes: ");
                    System.out.println(" ");
                    for (int i = 0; i < contactos; i++) {
                        directorio[i].display();
                        System.out.println(" ");
                    }
                    interr = 0;
                } while (interr == 1);

            } else if (seleccion == 3) {
                do {
                    contacto contacto = new contacto();
                    System.out.println("Ingrese telefono del contacto a borrar.");
                    contacto.setTelefono((entradaEscaner.nextInt()));
                    for (int i = 0; i < contactos; i++) {
                        if (contacto.getTelefono().equals(directorio[i].getTelefono())) {
                            System.out.println("El contacto se encontró en el directorio: ");
                            directorio[i].display();
                            int add = 0;
                            contactos = contactos - 1;
                            cont = cont + 1;
                            for (int j = 0; j < contactos - i; j++) {
                                directorio[i + add] = directorio[i + add + 1];
                                add = add + 1;
                            }
                        }
                    }if (cont == 0) {
                        System.out.println("El contacto NO se encontró en el directorio: ");
                    }
                    cont = 0;
                    interr = Integer.parseInt((console.readLine("Ingrese 1 para borrar otro contacto o ingrese 0"
                            + " para salir de la sección: ")));
                } while (interr == 1);
            }
            interrMenu = Integer.parseInt((console.readLine("Ingrese 1 para regresar al menú principal"
                    + " o ingrese 0 para salir del programa: ")));
            System.out.println("");
        }
    }
}