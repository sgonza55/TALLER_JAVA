public class bancoPeliculas {

    public String cliente;
    public String tituloPelicula;

    public bancoPeliculas(String cliente, String tituloPelicula) {
        this.cliente = cliente;
        this.tituloPelicula = tituloPelicula;
    }

    public void display() {
        System.out.println("| Cliente: " + cliente + " Titulo:" + tituloPelicula + "|");
    }
}