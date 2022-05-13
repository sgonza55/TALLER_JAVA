import java.util.Scanner;

public class ingresosYRetiros {

    public static Float ingreso;
    public static Float retiro;

    Scanner entradaEscaner = new Scanner(System.in);

    public Float getIngreso() {
        return ingreso;
    }

    public void setIngreso() {
        ingresosYRetiros.ingreso = (entradaEscaner.nextFloat());
    }

    public Float getRetiro() {
        return retiro;
    }

    public void setRetiro() {
        ingresosYRetiros.retiro = (entradaEscaner.nextFloat());
    }

}
