public class salidas {

    public String placa;
    public String novedades;
    public String repuestos;

    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNovedades() {
        return novedades;
    }

    public void setNovedades(String novedades) {
        this.novedades = novedades;
    }

    public String getRepuestos() {
        return repuestos;
    }

    public void setRepuestos(String repuestos) {
        this.repuestos = repuestos;
    }

    public salidas(String placa, String novedades, String repuestos) {
        this.placa = placa;
        this.repuestos = repuestos;
        this.novedades = novedades;
    }

    public void displaySalida() {
        System.out.println("| Placa: " + placa + " Novedades: " + novedades + " |");
    }

}