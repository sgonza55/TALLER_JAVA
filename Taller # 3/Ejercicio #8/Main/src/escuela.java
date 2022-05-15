public class escuela {

    public String nombre;
    public float nota;
    public String resultado;

    public escuela(String nombre, float nota, String resultado) {
        this.nombre = nombre;
        this.nota = nota;
        this.resultado = resultado;
    }

    public void displayEscuela() {
        System.out.println("| Nombre: " + nombre + " Nota: " + nota + " Resultado: " + resultado + " |");
    }

}