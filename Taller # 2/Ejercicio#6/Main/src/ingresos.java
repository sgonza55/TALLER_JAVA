public class ingresos {

    public String placa;
    public String observacionesCliente;

    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getObservacionesCliente() {
        return observacionesCliente;
    }

    public void setObservacionesCliente(String observacionesCliente) {
        this.observacionesCliente = observacionesCliente;
    }

    public ingresos(String placa, String observacionesCliente) {
        this.placa = placa;
        this.observacionesCliente = observacionesCliente;
    }

    public void displayIngreso() {
        System.out.println("| Placa: " + placa + " Observaciones: " + observacionesCliente + " |");
    }

}