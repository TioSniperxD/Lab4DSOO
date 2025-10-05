public class Principal {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.listarLibros();
        biblioteca.listarUsuarios();
        biblioteca.buscarLibroPorISBN("100");
        biblioteca.buscarUsuarioPorID("U001");
        Usuario usuario = biblioteca.buscarUsuarioPorID("U001");
        Libro libro = biblioteca.buscarLibroPorISBN("100");
        usuario.tomarPrestado(libro);
        biblioteca.listarLibros();
        usuario.devolverLibro(libro);
        biblioteca.listarLibros();
    }
}