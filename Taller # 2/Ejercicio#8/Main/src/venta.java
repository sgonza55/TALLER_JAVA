public class venta {
    
    public String cliente;
    public float valor;

    public venta (String cliente, float valor){
        this.cliente = cliente;
        this.valor = valor;
    }

    public void display(){
        System.out.println("| Cliente: " + cliente + " Valor venta:" + valor + "|");
    }
}
