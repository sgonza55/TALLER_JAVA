import java.util.Scanner;

public class cuentaBancaria {

    public static String nombreTitular;
    public int cuenta;
    public Integer saldo;

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular() {
        Scanner entradaEscaner = new Scanner (System.in);
        cuentaBancaria.nombreTitular = (entradaEscaner.next()); 
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta() {
        this.cuenta = (int) Math.floor(Math.random()*(100000000)+100000000);
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo() {
        this.saldo = (int) Math.floor(Math.random()*(10000000)+100);
    }

}
