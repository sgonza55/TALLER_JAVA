/*
 * Taller 3 - Canteras I - Sofka U
 */

import java.io.Console;

/**
 * Programa para registrar pedidos, revisar disponibilidad (inventario) y registrar ventas
 * 
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */

public class Main {

    public static String cliente;
    public static String sabor;
    public static float porciones;
    public static String decoraciones;
    public static String nombreTorta;
    public static Integer cantidad;
    public static float valor;
    public static Integer seleccion;

    public static void main(String[] args) {

        pedidos[] pedidos = new pedidos[1000];
        venta[] ventas = new venta[1000];
        pasteles[] pasteles = new pasteles[1000];
        int pedidosRegistrados = 0;
        int ventasRegistrados = 0;
        int pastelesRegistrados = 0;
        int interr = 1;
        int interrMenu = 1;
        Console console = System.console();

        while (interrMenu == 1) {
            System.out.println("Ingrese 1 para agregar una pedido.");
            System.out.println("Ingrese 2 registrar tortas disponibles.");
            System.out.println("Ingrese 3 para registrar venta");
            seleccion = Integer.parseInt((console.readLine("Ingrese selección: ")));
            if (seleccion == 1) {
                do {
                    cliente = ((console.readLine("Ingrese nombre del cliente: ")));
                    sabor = ((console.readLine("Ingrese sabor del pastel: ")));
                    porciones = Float.parseFloat((console.readLine("Ingrese cantidad de porciones: ")));
                    decoraciones = ((console.readLine("Ingrese decoraciones del pastel: ")));
                    pedidos pedido = new pedidos(cliente, sabor, porciones, decoraciones);
                    pedidos[pedidosRegistrados] = pedido;
                    pedidos[pedidosRegistrados].display();
                    pedidosRegistrados = pedidosRegistrados + 1;
                    interr = Integer.parseInt((console.readLine("Ingrese 1 para agregar otro pedido o ingrese 0"
                            + " para salir de sección pedidos: ")));
                } while (interr == 1);
                System.out.println("Los pedidos registrados hasta el momento son las siguientes: ");
                System.out.println(" ");
                for (int i = 0; i < pedidosRegistrados; i++) {
                    pedidos[i].display();
                    System.out.println(" ");
                }

            } else if (seleccion == 2) {
                do {
                    nombreTorta = ((console.readLine("Ingrese nombre de la torta: ")));
                    cantidad = Integer.parseInt((console.readLine("Ingrese cantidad disponible: ")));
                    sabor = ((console.readLine("Ingrese sabor del pastel: ")));
                    porciones = Float.parseFloat((console.readLine("Ingrese cantidad de porciones: ")));
                    decoraciones = ((console.readLine("Ingrese decoraciones del pastel: ")));
                    pasteles pastel = new pasteles(nombreTorta, cantidad, sabor, porciones, decoraciones);
                    pasteles[pastelesRegistrados] = pastel;
                    pasteles[pastelesRegistrados].display();
                    pastelesRegistrados = pastelesRegistrados + 1;
                    interr = Integer
                            .parseInt((console.readLine("Ingrese 1 para agregar otro pastel al inventario o ingrese 0"
                                    + " para salir de sección de pasteles disponibles: ")));
                } while (interr == 1);
                System.out.println("Los pasteles disponibles hasta el momento son las siguientes: ");
                System.out.println(" ");
                for (int i = 0; i < pastelesRegistrados; i++) {
                    pasteles[i].display();
                    System.out.println(" ");
                }

            } else if (seleccion == 3) {
                do {
                    cliente = ((console.readLine("Ingrese nombre del cliente: ")));
                    valor = Float.parseFloat((console.readLine("Ingrese valor de venta: ")));
                    venta venta = new venta(cliente, valor);
                    ventas[ventasRegistrados] = venta;
                    ventas[ventasRegistrados].display();
                    ventasRegistrados = ventasRegistrados + 1;
                    interr = Integer.parseInt((console.readLine("Ingrese 1 para agregar otra venta o ingrese 0"
                            + " para salir de sección de ventas: ")));
                } while (interr == 1);
                System.out.println("Las ventas registradas hasta el momento son las siguientes: ");
                System.out.println(" ");
                for (int i = 0; i < ventasRegistrados; i++) {
                    ventas[i].display();
                    System.out.println(" ");
                }
            }
            interrMenu = Integer.parseInt((console.readLine("Ingrese 1 para regresar al menú principal"
                        + "o ingrese 0 para salir del programa: ")));
        }
    }
}
