/*
 * Taller 3 - Canteras I - Sofka U
 */

import java.io.Console;
import java.util.Scanner;

/**
 * Programa que registra el ingreso de estudiantes a la escuela y
 * menciona quienes aprobaron segun su nota final
 * 
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */

public class Main {

    public static Integer seleccion;

    public static void main(String[] args) {

        System.out.println("¡Bienvenido a la escuela automovilistica El Maestro!");
        System.out.println("");

        String escuela[][] = new String[8][3];

        int cont = 0;
        int interr = 1;
        int interrMenu = 1;
        int ocupacionEscuela = 0;

        Console console = System.console();
        Scanner input = new Scanner(System.in);

        while (interrMenu == 1) {
            System.out.println("Ingrese 1 para registrar nuevo ingreso.");
            System.out.println("Ingrese 2 para subir nota de estudiante.");
            System.out.println("Ingrese 3 para consultar ususarios que presentaron el curso.");
            System.out.println("Ingrese 4 para consultar usuarios que aprobaron el curso.");
            System.out.println(" ");
            seleccion = Integer.parseInt((console.readLine("Ingrese selección: ")));

            if (seleccion == 1) {
                do {
                    if (ocupacionEscuela < 8) {
                        estudiante nuevoEstudiante = new estudiante();
                        System.out.println(" ");
                        System.out.println("Ingrese nombre completo del estudiante: ");
                        nuevoEstudiante.setNombre(input.next());
                        System.out.println(" ");
                        escuela[ocupacionEscuela][0] = nuevoEstudiante.getNombre();
                        System.out.println("El siguiente estudiante fue registrado exitosamente: ");
                        System.out.println(" ");
                        System.out.println(nuevoEstudiante.getNombre());
                        System.out.println(" ");
                        ocupacionEscuela = ocupacionEscuela + 1;

                    } else {
                        System.out.println("La escuela esta llena.");
                        System.out.println(" ");
                    }

                    interr = Integer
                            .parseInt((console.readLine("Ingrese 1 para añadir nuevo estudiante o ingrese 0"
                                    + " para salir de esta sección: ")));
                } while (interr == 1);

            } 
            
            else if (seleccion == 2) {
                do {
                    System.out.println(" ");
                    System.out.println("Ingrese nombre del estudiante: ");
                    estudiante notaEstudiante = new estudiante();
                    notaEstudiante.setNombre((input.next()));
                    for (int i = 0; i < ocupacionEscuela; i++) {
                        if (notaEstudiante.getNombre().equals(escuela[i][0])) {
                            System.out.println(" ");
                            System.out.println("El estudiante buscado SI se encuentra matriculado.");
                            System.out.println(" ");
                            System.out.println("Ingrese nota del estudiante: ");
                            notaEstudiante.setNota((input.nextFloat()));
                            escuela[i][1] = Float.toString(notaEstudiante.getNota());
                            System.out.println(escuela[i][1]);
                            System.out.println("La nota fue registrada exitosamente.");
                            System.out.println(" ");
                            cont = cont + 1;
                            if (notaEstudiante.getNota() >= 3.0) {
                                escuela[i][2] = "APROBÓ";
                            } else if (notaEstudiante.getNota() < 3.0) {
                                escuela[i][2] = "REPROBÓ";
                            }
                        }
                    }
                    if (cont == 0) {
                        System.out.println("El estudiante NO se encontró en la base de datos. ");
                        System.out.println(" ");
                    }
                    cont = 0;

                    interr = Integer.parseInt((console.readLine("Ingrese 1 para agregar subir más notas o ingrese 0"
                            + " para salir de esta sección: ")));
                } while (interr == 1);

            } 
            
            else if (seleccion == 3) {
                System.out.println(" ");
                System.out.println("Los siguientes estudiantes presentaron el curso: ");
                for (int i = 0; i < ocupacionEscuela; i++) {
                    if (escuela[i][2] != null) {
                        System.out.println(escuela[i][0]);
                        cont = cont + 1;
                    }
                }
                if (cont == 0) {
                    System.out.println("Ningún estudiante ha presentado el examen.");
                    System.out.println(" ");
                }
                cont = 0;
            } 
            
            else if (seleccion == 4) {
                System.out.println(" ");
                System.out.println("Los siguientes estudiantes aprobaron el curso: ");
                for (int i = 0; i < ocupacionEscuela; i++) {
                    if (escuela[i][2] == "APROBÓ") {
                        System.out.println("Nombre: " + escuela[i][0] + ". Nota: " + escuela[i][1]);
                        cont = cont + 1;
                    }
                }
                if (cont == 0) {
                    System.out.println("Ningún estudiante aprobó el curso.");
                    System.out.println(" ");
                }
                cont = 0;
            }
            interrMenu = Integer.parseInt((console.readLine("Ingrese 1 para regresar al menú principal"
                    + " o ingrese 0 para salir del programa: ")));
            System.out.println(" ");
        }

        System.out.println(" Resumen de estudiantes matriculados y resultados: ");
        for (int x = 0; x < escuela.length; x++) {
            System.out.print("|");
            for (int y = 0; y < escuela[x].length; y++) {
                System.out.print(escuela[x][y]);
                if (y != escuela[x].length - 1)
                    System.out.print("\t");
            }
            System.out.println("|");
        }

    }
}