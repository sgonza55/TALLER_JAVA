/*
 * Taller 3 - Canteras I - Sofka U
 */

import java.io.Console;

/**
 * Programa que factura productos, devoluciones y consultas de precios. 
 * dinero o consultas de saldo.
 * 
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */

public class Main {

    public static float valor;
    public static float carrito;
    public static float devolucion;
    public static Integer seleccion;

    public static void main(String[] args) {

        System.out.println("!Bienvenido al sistema de facturación de Mi Salud");
        System.out.println("");

        int interr = 1;
        int interrMenu = 1;
        carrito = 0;
        Console console = System.console();

        while (interrMenu == 1) {
            System.out.println("Ingrese 1 para consultar precio.");
            System.out.println("Ingrese 2 para registrar compras de producto.");
            System.out.println("Ingrese 3 para registrar devoluciones");
            System.out.println(" ");
            seleccion = Integer.parseInt((console.readLine("Ingrese selección: ")));
            System.out.println(" ");

            if (seleccion == 1) {
                do {
                    producto producto = new producto();
                    System.out.println("Ingrese nombre del producto: ");
                    producto.setNombre();
                    producto.setValor();
                    valor = producto.getValor().floatValue();
                    System.out.println("El prodcuto " + producto.getNombre() + " cuesta: " + valor + " COP");
                    interr = Integer.parseInt((console.readLine("Ingrese 1 para agregar al carrito o ingrese 0"
                            + " para salir de esta sección: ")));
                    if (interr == 1) {
                        carrito = valor + carrito;
                        System.out.println("El precio que lleva en el carrito es de: " + carrito + " COP");
                        interr = Integer
                                .parseInt((console.readLine("Ingrese 1 para consultar nuevo producto o ingrese 0"
                                        + " para salir de esta sección: ")));
                    }
                } while (interr == 1);

            } else if (seleccion == 2) {
                do {
                    producto producto = new producto();
                    System.out.println("Ingrese nombre del producto: ");
                    producto.setNombre();
                    producto.setValor();
                    valor = producto.getValor().floatValue();
                    System.out.println("El prodcuto " + producto.getNombre() + " cuesta: " + valor + " COP");
                    carrito = valor + carrito;
                    System.out.println("El precio que lleva en el carrito es de: " + carrito + " COP");
                    interr = Integer.parseInt((console.readLine("Ingrese 1 confimar el producto o ingrese 0"
                            + " para quitarlo: ")));
                    if (interr == 0) {
                        carrito = -valor + carrito;
                        System.out.println("El precio que lleva en el carrito es de: " + carrito + " COP");
                    }
                    interr = Integer.parseInt((console.readLine("Ingrese 1 para comprar producto o ingrese 0"
                            + " para salir de esta sección: ")));
                } while (interr == 1);

            } else if (seleccion == 3) {
                do {
                    producto producto = new producto();
                    System.out.println("Ingrese nombre del producto a devolver: ");
                    producto.setNombre();
                    producto.setValor();
                    devolucion = producto.getValor().floatValue();
                    System.out.println("El prodcuto " + producto.getNombre() + " cuesta: " + valor + " COP");
                    System.out.println("El precio de devolución es de: " + devolucion + " COP");
                    interr = Integer.parseInt((console.readLine("Ingrese 1 para agregar más devoluciones o ingrese 0"
                            + " para salir de esta sección: ")));
                } while (interr == 1);
            }
            interrMenu = Integer.parseInt((console.readLine("Ingrese 1 para regresar al menú principal"
                    + " o ingrese 0 para salir del programa: ")));
            System.out.println(" ");
        }
        System.out.println("Total compra: " + carrito + " COP");
        System.out.println("Total devoluciones: " + devolucion + " COP");
    }
}