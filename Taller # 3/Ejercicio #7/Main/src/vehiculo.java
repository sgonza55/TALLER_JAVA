public class vehiculo {

    public String placa;
    public String marca;
    public String dueño;
    public String telefono;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void displayVehiculo() {
        System.out.println("| Placa: " + placa + " Marca: " + marca + " Dueño: " + dueño + " Telefono: " + telefono + " |");
    }

}