
public class Libro {
    // Inicializamos los atributos de la clase Libro
    private String titulo, autor, ISBN;
    private boolean disponible;

    // Constructor de un libro 
    public Libro (String titulo, String autor, String ISBN, boolean disponible){
        this.titulo = titulo;
        this.autor = autor;
        this. ISBN = ISBN;
        this.disponible = disponible;
    }
    // Constructor sobrecargado para un libro nuevo
    public Libro(String titulo, String autor, String ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.disponible = true; // Un libro nuevo siempre esta disponible
    }

    // Métodos getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public boolean getDisponible() {
        return disponible;
    }

    // Métodos setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Método que erifica si el libro está disponible
    public boolean estaDisponible() {
        return disponible;
    }

    // Método toString que presenta la información del libro
    public String toString() {
        return " \n Título: " + titulo + "\n Autor: " + autor +  " \n ISBN: " + ISBN + " \n Estado: " + (disponible ? " Disponible para préstamo" : "Actualmente prestado");
    }
}

