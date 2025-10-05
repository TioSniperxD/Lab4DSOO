import java.util.*;
public class Usuario {
    // Inicializamos los atributos de la clase Usuario
    private String nombre, codigoUsuario;
    private ArrayList<Libro> librosPrestados;

    // Constructor para un Usuario
    public Usuario (String nombre, String codigoUsuario){
        this.nombre = nombre;
        this.codigoUsuario = codigoUsuario;
        this.librosPrestados = new ArrayList<>();
    }
    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getcodigoUsuario() {
        return codigoUsuario;
    }

    public ArrayList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setcodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    //Método para que el Usuario se preste un libro
    public void prestarLibro (Libro libro){
        if (libro.estaDisponible()){
            libro.setDisponible(false); // Cambiamos el estado del libro a "Prestado"
            librosPrestados.add(libro); // Añadimos el libro a la lista de libros prestados del Usuario
            System.out.println( nombre + " se ha prestado el libro: " + libro.getTitulo());    
        }
        else
            System.out.println( "Error: Actualmente el libro esta prestado");
    }
    //Método para que el Usuario devuelva un libro prestado
    public void devolverLibro (Libro libro){
        for (int i = 0; i < librosPrestados.size(); i++){
            Libro libro1 = librosPrestados.get(i);
            if ( libro1 == libro){
                libro1.setDisponible(true); // Cambiar el estado del libro a "disponible"
                librosPrestados.remove(i); // Quitar el libro devuelto de la lista de libros prestadps del Usuario
                System.out.println(nombre + " ha devuelto el libro: " + libro1.getTitulo());
            }
            else
                System.out.println("El usuario no se ha prestado el libro: "+ libro.getTitulo());
        }
    }
    // Método toString que presenta la información del usuario
    public String toString(){
        return "\n Usuario: " + nombre + "\n Codigo: " + codigoUsuario + "\n Libros prestados: " + librosPrestados.size(); 
    }

}
