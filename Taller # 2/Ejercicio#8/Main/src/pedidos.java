public class pedidos {

    public String cliente;
    public String sabor;
    public float porciones;
    public String decoraciones;

    public pedidos (String cliente, String sabor, float porciones, String decoraciones){
        this.cliente = cliente;
        this.sabor = sabor;
        this.porciones = porciones;
        this.decoraciones = decoraciones;
    }

    public void display(){
        System.out.println("| Cliente: " + cliente + " Sabor:" + sabor + ". Porciones: " + porciones
                            + ". Decoraciones: " + decoraciones + "|");
    }
}
