/*
 * Taller 3 - Canteras I - Sofka U
 */

import java.io.Console;

/**
 * Programa que calcula el IMC de un grupo de personas.
 * 
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */

public class Main {

    public static String nombre;
    public static Float altura;
    public static Float peso;
    public static Float IMC;
    public static String resultado;

    public static void main(String[] args) {

        persona[] personas = new persona [1000];
        int cont = 0;
        int interr = 1;
        System.out.println("Ingrese 1 para agregar una persona a la base de datos: ");
        Console console = System.console();

        do {

            nombre = ((console.readLine("Ingrese nombre de la persona: ")));
            peso = Float.parseFloat((console.readLine("Ingrese el peso de la persona en kg: ")));
            altura = Float.parseFloat((console.readLine("Ingrese la altura de la persona en m: ")));
            IMC = peso / (altura * altura);

            if (IMC < 18.5) {
                resultado = "Bajo peso";
            } else if (IMC >= 18.5 && IMC < 24.9) {
                resultado = "Normal";
            } else if (IMC >= 24.9 && IMC < 29.9) {
                resultado = "Sobrepeso";
            } else if (IMC >= 29.9) {
                resultado = "Obeso";
            }

            persona persona1 = new persona(nombre, altura, peso, IMC, resultado);
            personas [cont] = persona1;
            personas[cont].display();
            cont = cont + 1;
            interr =Integer.parseInt((console.readLine("Ingrese 1 para agregar otra persona a la base de datos o ingrese 0 para salir: ")));

        } while (interr==1);

        System.out.println("Las personas agregadas a la base de datos son las siguientes: "); 
        System.out.println(" ");
        for(int i=0; i<cont;i++){
            personas[i].display();
            System.out.println(" ");
        } 
        return;

    }
}
