public class pasteles {

    public String nombreTorta;
    public String sabor;
    public float porciones;
    public String decoraciones;
    public Integer cantidad;

    public pasteles (String nombreTorta, int cantidad, String sabor, float porciones, String decoraciones){
        this.nombreTorta = nombreTorta;
        this.cantidad = cantidad;
        this.sabor = sabor;
        this.porciones = porciones;
        this.decoraciones = decoraciones;
    }

    public void display(){
        System.out.println("| Nombre: " + nombreTorta + ". Cantidad: " + cantidad + ". Sabor:" + sabor + 
                            ". Porciones: " + porciones + ". Decoraciones: " + decoraciones + "|");
    }
}
