public class Libro{
    private String titulo;
    private String autor;
    private String ISBN;
    private Boolean disponible;

    //CONTRUCTORES

    //CONSTRUCTOR PREDETERMINADO
    public Libro() {
        this.titulo = "Sin título";
        this.autor = "Desconocido";
        this.ISBN = "000-0000000000";
        this.disponible = true;
    }
    //CONSTRUCTOR SOBRECARGADO
    public Libro(String titulo, String autor, String ISBN){
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.disponible = true;
    }
    
    //GETTERS Y SETTERS
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public String getISBN() {
        return ISBN;
    }
    public Boolean getDisponible() {
        return disponible;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }
    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Libro: " + titulo + ", autor: " + autor + ", ISBN: " + ISBN;
    }
    
}