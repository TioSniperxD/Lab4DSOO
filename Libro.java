class Libro {
    //Atributos de la clase
    private String titulo;
    private String autor;
    private String ISBN;
    private boolean disponible;

    // Constructor por defecto
    public Libro() {
        this.disponible = true;
    }

    //Contructor con todos los atributos.
    Libro (String titulo, String autor, String ISBN, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.disponible = disponible;
    }

    //Constructor sobrecargado con solo titulo, autor.
    Libro (String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = "N/A";
        this.disponible = true;
    }

    //Accesores y mutadores
    public String getTitulo () {
        return titulo;
    }
    public void setTitulo (String titulo){
        this.titulo = titulo;
    }

    public String getAutor () {
        return autor;
    }
    public void setAutor (String autor){
        this.autor = autor;
    }

    public String getISBN () {
        return ISBN;
    }
    public void setISBN (String ISBN){
        this.ISBN = ISBN;
    }

    public boolean isDisponible () {
        return disponible;
    }

    public void setDisponible (boolean disponible) {
        this.disponible = disponible;
    }
    public boolean estaDisponible() {
        return disponible;
    }

    @Override
    /**Método toString devuelve la info del libro en texto.*/
    public String toString () {
        return "Libro " +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", disponible=" + disponible;
    }
}
