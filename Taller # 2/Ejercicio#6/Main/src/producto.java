import java.util.Scanner;

public class producto {

    public String nombre;
    public Integer valor;

    public String getNombre() {
        return nombre;
    }

    public void setNombre() {
        Scanner entradaEscaner = new Scanner(System.in);
        this.nombre = (entradaEscaner.next());
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor() {
        this.valor = (int) Math.floor(Math.random() * (300000) + 100);
    }

}
