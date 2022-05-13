public class persona {

    public String nombre;
    public Float altura;
    public Float peso;
    public Float IMC;
    public String resultado;

    public persona (String nombre, float altura, float peso, float IMC, String resultado){
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
        this.IMC = IMC;
        this.resultado = resultado;
    }

    public void display(){
        System.out.println("|" + nombre + " Altura:" + altura + "m. Peso: " + peso
                            + "kg. IMC: " + IMC + " Valoración: " + resultado + "|");
    }
}
