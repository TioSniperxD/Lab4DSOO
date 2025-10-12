import java.util.ArrayList;

public class Usuario {
    private String nombre; 
    private String id;
    private ArrayList<Libro> libros;
    //CONSTRUCTOR PREDETERMINADO    
    public Usuario() {
        this.nombre = "Sin nombre";
        this.id = "0000";
        this.libros = new ArrayList<>();
    }
    //CONSTRUCTOR SOBRECARGADO
    public Usuario(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.libros = new ArrayList<>();
    }
    //GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }
    public String getId() {
        return id;
    }
    public ArrayList<Libro> getLibros() {
        return libros;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    public void añadirLibro(Libro libro){
        libros.add(libro);
    }
    
    @Override
    public String toString() {
        return "Usuario: " + nombre + ", id: " + id + ", libros: " + libros;
    }

    
}
