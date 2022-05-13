public class directorio {

    public String nombre;
    public Integer telefono;
    public String organizacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getOrganizacion() {
        return organizacion;
    }

    public void setOrganizacion(String organizacion) {
        this.organizacion = organizacion;
    }

    public directorio(String nombre, Integer telefono, String organizacion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.organizacion = organizacion;
    }

    public void display() {
        System.out
                .println("| Nombre Completo: " + nombre + " Tel:" + telefono + " Organización: " + organizacion + "|");
    }
}