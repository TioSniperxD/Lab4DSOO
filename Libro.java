public class Libro{
    //Atributos
    private String titulo;
    private String autor;
    private String ISBN;
    private boolean disponible;

    //Constructor y constructor sobrecargado (Libro disponible)
    public Libro(String titulo, String autor, String ISBN, boolean disponible){
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.disponible = disponible;
    }
    public Libro(String titulo, String autor, String ISBN){
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.disponible = true;
    }

    //Getters y Setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
     public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }
    public boolean isDisponible() {
        return disponible;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    //Metodo de Instancia
    //Metodo para verificar si el libro esta disponible
    public boolean estaDisponible(){
        return disponible;
    }
    //Metodo para cambiar a no disponible el libro
    public void prestar(){
        this.disponible = false;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", disponible=" + disponible +
                '}';
    }
}
