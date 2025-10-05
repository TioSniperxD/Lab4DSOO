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
        Prestado();
    }
    //Metodo para cambiar a disponible el libro
    public void devolver(){
        this.disponible = true;
        Devuelto();
    }
    //Metodo para indicar que no esta disponible
    public void NoDisponible(){
        System.out.println("El libro "+ titulo + " no esta disponible");
    }
    //Metodo para indicar que el libro ha sido prestado
    public void Prestado(){
        System.out.println("El libro "+ titulo + " ha sido prestado");
    }
    //Metodo para indicar que el libro ha sido devuelto
    public void Devuelto(){
        System.out.println("El libro "+ titulo + " ha sido devuelto");
    }
    //Metodo para indicar que el libro no pertenece al usuario
    public void LibroNoPrestado(){
        System.out.println("El libro "+ titulo + " no pertenece al usuario");
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
