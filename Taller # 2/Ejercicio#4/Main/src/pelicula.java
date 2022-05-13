public class pelicula {

    public String tituloPelicula;

    public pelicula(String tituloPelicula) {
        this.tituloPelicula = tituloPelicula;
    }

    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public void setTituloPelicula(String tituloPelicula) {
        this.tituloPelicula = tituloPelicula;
    }

    public void display() {
        System.out.println("| Titulo: " + tituloPelicula + "|");
    }
}