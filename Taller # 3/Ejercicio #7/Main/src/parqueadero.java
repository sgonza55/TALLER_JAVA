public class parqueadero {

    public String placa;
    public String marca;
    public String dueño;
    public String telefono;

    public String getPlaca() {
        return placa;
    }

    public parqueadero(String placa, String dueño, String marca, String telefono) {
        this.placa = placa;
        this.marca = marca;
        this.telefono = telefono;
        this.dueño = dueño;
    }

    public void displayParqueadero() {
        System.out.println("| Placa: " + placa + " Marca: " + marca + " Dueño: " + dueño + " Telefono: " + telefono + " |");
    }

}