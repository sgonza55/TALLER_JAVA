/*
 * Taller 3 - Canteras I - Sofka U
 */

/**
 * Programa que utiliza ciclos do-while anidados para imprimir variables con diferentes espaciados.
 * 
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */

public class Main {

    public static int ancho;
    public static int lonText;
    public static int tamañoCampo;
    public static String m;

    public static void main(String[] args) {

        int cont = 0;
        String X = "*";//Texto

        do{ 
            do {
                ancho = 22;
                lonText=X.length();
                tamañoCampo=(ancho/2)+(lonText/2);
                String m= String.format("%" + tamañoCampo + "s", X);
                X = String.format("%" + tamañoCampo + "s", X).replace(" ","");
                X = String.format("%-" + ancho  + "s", X).replace(" ","");
                m= String.format("%-" + ancho + "s", m);
                System.out.print("\n"+m);
                X = "**" + X;
                cont = cont + 1;
            } while (cont < 11);

            X = "***";
            lonText=X.length();
            tamañoCampo=(ancho/2)+(lonText/2);
            m= String.format("%" + tamañoCampo + "s", X);
            X = String.format("%" + tamañoCampo + "s", X).replace(" ","");
            X = String.format("%-" + ancho  + "s", X).replace(" ","");
            m= String.format("%-" + ancho + "s", m);
            System.out.print("\n"+m);

            do{
                lonText=X.length();
                tamañoCampo=(ancho/2)+(lonText/2);
                m= String.format("%" + tamañoCampo + "s", X);
                X = String.format("%" + tamañoCampo + "s", X).replace(" ","");
                X = String.format("%-" + ancho  + "s", X).replace(" ","");
                m= String.format("%-" + ancho + "s", m);
                System.out.print("\n"+m);
                X = "**" + X;
                cont = cont + 1;
            } while (cont < 14);

        } while (cont < 14);
    }
}