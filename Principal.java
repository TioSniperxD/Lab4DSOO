public class Principal {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.inicializarDatos();

        System.out.println("Libros en la Biblioteca");
        biblioteca.mostrarLibros();
        System.out.println();

        System.out.println("Usuarios registrados");
        biblioteca.mostrarUsuarios();

        //Simulación
        Usuario ana = biblioteca.getUsuarios().get(0);
        Usuario carlos = biblioteca.getUsuarios().get(1);
        System.out.println();

        Libro libro1 = biblioteca.getLibros().get(0); 
        Libro libro2 = biblioteca.getLibros().get(1); 
        System.out.println();

        ana.tomarPrestado(libro1);
        carlos.tomarPrestado(libro1); // No debería poder porque ya está prestado

        ana.devolverLibro(libro1);
        carlos.tomarPrestado(libro1); // Ahora sí debería poder

        System.out.println("\nEstado final de usuarios");
        biblioteca.mostrarUsuarios();

        System.out.println("\nEstado final de libros");
        biblioteca.mostrarLibros();
    }
}