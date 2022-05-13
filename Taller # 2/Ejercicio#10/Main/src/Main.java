/*
 * Taller 3 - Canteras I - Sofka U
 */

import java.io.Console;

/**
 * Programa que maneja actividades financieras tales como: retirar o ingresar dinero o consultas de saldo. 
 * 
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */

public class Main {

    public static float ingreso;
    public static float retiro;
    public static float saldo;
    public static Integer seleccion;

    public static void main(String[] args) {

        System.out.println("Ingrese el nombre completo del titular de la cuenta: ");
        cuentaBancaria cuentaBancaria = new cuentaBancaria();
        cuentaBancaria.setNombreTitular();
        System.out.println("Titular de la cuenta: " + cuentaBancaria.getNombreTitular());
        cuentaBancaria.setCuenta();
        System.out.println("Número de cuenta: " + cuentaBancaria.getCuenta());
        cuentaBancaria.setSaldo();
        saldo = (cuentaBancaria.getSaldo()).floatValue();

        int interr = 1;
        int interrMenu = 1;
        Console console = System.console();

        while (interrMenu == 1) {
            System.out.println("Ingrese 1 para ingresar dinero.");
            System.out.println("Ingrese 2 para retirar dinero.");
            System.out.println("Ingrese 3 para consultar saldo.");
            seleccion = Integer.parseInt((console.readLine("Ingrese selección: ")));

            if (seleccion == 1) {
                do {
                    ingresosYRetiros ingresos = new ingresosYRetiros();
                    System.out.println("Ingrese valor que desea ingresar: ");
                    ingresos.setIngreso();
                    System.out.println("El valor ingresado a su cuenta fue: " + ingresos.getIngreso() + " COP");
                    ingreso = ingresos.getIngreso();
                    saldo = saldo + ingreso;
                    System.out.println("El saldo final de la transacción es: " + saldo + " COP");
                    interr = Integer.parseInt((console.readLine("Ingrese 1 para ingresar más dinero o ingrese 0"
                            + " para salir de esta sección: ")));
                } while (interr == 1);

            } else if (seleccion == 2) {
                do {
                    ingresosYRetiros retiros = new ingresosYRetiros();
                    System.out.println("Ingrese valor que desea retirar: ");
                    retiros.setRetiro();
                    retiro = retiros.getRetiro();
                    if (saldo - retiro < 0) {
                        System.out.println("El valor a retirar es mayor al saldo de la cuenta.");
                        System.out.println("No se puede realizar la transacción.");
                    } else {
                        saldo = saldo - retiro;
                        System.out.println("El valor retirado de su cuenta fue: " + retiros.getRetiro() + " COP");
                        System.out.println("El saldo final de la transacción es: " + saldo + " COP");
                    }
                    interr = Integer.parseInt((console.readLine("Ingrese 1 para retirar más dinero o ingrese 0"
                            + " para salir de esta sección: ")));
                } while (interr == 1);

            } else if (seleccion == 3) {
                do {
                    System.out.println("Número de cuenta: " + cuentaBancaria.getCuenta());
                    System.out.println("Saldo disponible: " + saldo + " COP");
                    interr = Integer.parseInt((console.readLine("Ingrese 1 para volver a ver el saldo o ingrese 0"
                            + " para salir de esta sección: ")));
                } while (interr == 1);
            }
            interrMenu = Integer.parseInt((console.readLine("Ingrese 1 para regresar al menú principal"
                    + "o ingrese 0 para salir del programa: ")));
        }
    }
}