import java.util.*;
class Usuario {
    /**Atributos de la clase.*/
    private String nombre;
    private String idUsuario;
    private ArrayList<Libro> librosPrestados;

    /**Constructor vacío*/
    Usuario (){
    }
    /**Constructor con parámetros*/
    Usuario (String nombre, String idUsuario) {
        this.nombre = nombre;
        this.idUsuario = idUsuario;
        this.librosPrestados = new ArrayList<>();
    }

    /**Constructor sobrecargado*/
    Usuario(String nombre, String idUsuario, ArrayList<Libro> librosPrestados) {
        this.nombre = nombre;
        this.idUsuario = idUsuario;
        this.librosPrestados = librosPrestados;
    }

    /**Getters y Setters*/
    public String getNombre () {
        return nombre;
    }
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public String getIdUsuario () {
        return idUsuario;
    }
    public void setIdUsuario (String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public ArrayList<Libro> getLibrosPrestados () {
        return librosPrestados;
    }

    public void tomarPrestado (Libro libro) {
        if(libro.estaDisponible()){
            librosPrestados.add(libro);
            libro.setDisponible(false);
            System.out.println(nombre + " ha prestado el libro: "+libro.getTitulo());
        }
        else {
            System.out.println("El libro "+libro.getTitulo() + " no está disponible.");
        }
    }

    public void devolverLibro (Libro libro) {
        if(librosPrestados.contains(libro)) {
            librosPrestados.remove (libro);
            libro.setDisponible(true);
            System.out.println(nombre + " ha devuelto el libro: "+libro.getTitulo());
        }
        else {
            System.out.println("El libro "+ libro.getTitulo() + " no fue prestado por: "+nombre);
        }
    }

    public boolean verificarDisponibilidad(Libro libro) {
        return libro.estaDisponible();
    }

    @Override
    public String toString () {
        return "Usuario " +
                "nombre='" + nombre + '\'' +
                ", idUsuario='" + idUsuario + '\'' +
                ", librosPrestados=" + librosPrestados;
    }
}