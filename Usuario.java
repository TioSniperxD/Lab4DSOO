import java.util.ArrayList;
import java.util.List;
public class Usuario {
    //Atributos
    private String nombre;
    private String idUsuario;
    private ArrayList<Libro> librosPrestados;
   
    //Constructor
    public Usuario(String nombre, String idUsuario) {
        this.nombre = nombre;
        this.idUsuario = idUsuario;
        this.librosPrestados = new ArrayList<>();
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }
    public ArrayList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    //Metodos de Instancia
    //Metodo para verificar si esta disponible el libro
    public boolean puedeTomarPrestado(Libro libro) {
    return libro.estaDisponible();
    }
    //Metodo para tomar prestado un libro 
    public void tomarPrestado(Libro libro){
        librosPrestados.add(libro);
        libro.prestar(); 
    }
    //Metodo para prestar un libro, verificando si esta disponible
    public boolean prestarLibro(Libro libro) {
        if (puedeTomarPrestado(libro)) { //Verifica si esta disponible
            tomarPrestado(libro);   //Agrega al arrayList y cambia a no disponible, manda mensaje de prestado
            return true;
        } else {
            libro.NoDisponible(); //Manda mensaje de no disponible
            return false;
        }
    }
    //Metodo para verificar si el libro pertenece al Usuario
    public boolean tieneLibro(Libro libro) {
        return librosPrestados.contains(libro);
    }
    //Metodo para  devolver un libro
    public void devolverLibro(Libro libro){
        librosPrestados.remove(libro);
        libro.devolver(); //Cambia a disponible y manda mensaje de devuelto
    }
    //Metodo para procesar la devolucion de un libro, verificando si el libro pertenece al Usuario
    public boolean procesarDevolucion(Libro libro) {
        if(tieneLibro(libro)){
            devolverLibro(libro); //Elimina del arrayList y cambia a disponible, manda mensaje de devuelto
            return true;
        }
        else {
            libro.LibroNoPrestado();
            return false;
        }
    }

    //Metodo para verificar si tiene libros prestados
    public boolean tieneLibrosPrestados() {
        return !librosPrestados.isEmpty();
    }
    //Obtener nombre de libros prestados
    public List<String> obtenerNombresLibrosPrestados() {
        List<String> nombres = new ArrayList<>();
        for (Libro libro : librosPrestados) {
            nombres.add(libro.getTitulo());
        }
        return nombres;
    }
    //Mostrar libros prestados
    public void mostrarLibrosPrestados() {
        if (!tieneLibrosPrestados()) {
            System.out.println(nombre + " no tiene libros prestados.");
        } else {
            System.out.println("Libros prestados por " + nombre + ":");
            for (String titulo : obtenerNombresLibrosPrestados()) {
                System.out.println("- " + titulo);
            }
        }
    }
    //Metodo toString
    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", idUsuario='" + idUsuario + '\'' +
                ", librosPrestados=" + obtenerNombresLibrosPrestados() +
                '}';
    }
}