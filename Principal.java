public class Principal {
    public static void main(String[] args){
        // Crear una biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Inicializamos tres libros
        Libro libro1 = new Libro("Harry Potter y la Orden del Fénix", "J.K. Rowling", "HP005");
        Libro libro2 = new Libro("Rebelion en la Granja", "George Orwell", "ORW001");
        Libro libro3 = new Libro("El jardín de las mariposas", "Dot Hutchisonl", "JM001");

        // Inicializamos dos usuarios
        Usuario usuario1 = new Usuario("Jhon", "U001");
        Usuario usuario2 = new Usuario("Ximena", "U002");

        // Registrar libros y usuarios en la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        biblioteca.registrarUsuario(usuario1);
        biblioteca.registrarUsuario(usuario2);

        // Mostrar inventario de libros
        biblioteca.mostrarLibros();

        // Mostrar lista de usuarios
        biblioteca.mostrarUsuarios();

        // Probar préstamo y devolución
        biblioteca.registrarPrestamo(libro1, usuario1);
        biblioteca.registrarPrestamo(libro2, usuario2);

        biblioteca.mostrarLibros();

        biblioteca.registrarDevolucion(libro1, usuario1);
        
        biblioteca.mostrarLibros();
    }
}
