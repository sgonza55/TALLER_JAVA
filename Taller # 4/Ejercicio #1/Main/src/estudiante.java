public class estudiante {

    public String nombre;
    public float nota;
    public String resultado;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public void displayEstudiante() {
        System.out.println("| Nombre: " + nombre + " Nota: " + nota + " Resultado: " + resultado + " |");
    }

}