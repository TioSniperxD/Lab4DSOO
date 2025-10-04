import java.util.*;
class Biblioteca {
    //Atributos
    private ArrayList<Libro> libros;
    private ArrayList<Usuario> usuarios;

    //Constructor vacío
    Biblioteca () {
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    //Constructor con listas 
    Biblioteca (ArrayList<Libro> libros, ArrayList<Usuario> usuarios) {
        this.libros = libros;
        this.usuarios = usuarios;
    }

    //Getters y setters
    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    //Métodos para libros
    public void registrarLibro (Libro libro) {
         libros.add(libro);
    }

    public void mostrarLibros () {
        for(Libro libro : libros){
            System.out.println(libro);
        }
    }

    //Métodos para usuarios
    public void registrarUsuario (Usuario usuario) {
        usuarios.add(usuario);
    }

    public void mostrarUsuarios () {
        for (Usuario usuario: usuarios) {
            System.out.println(usuario);
        }
    }

    //Datos de prueba
    public void inicializarDatos () {
        registrarLibro(new Libro ("Un mundo feliz", "Aldous Huxley", "1234", true ));
        registrarLibro(new Libro("El retrato de Dorian Gray", "Oscar Wilde", "1235", true));
        registrarLibro(new Libro("Clean Code", "Robert C. Martin"));

        registrarUsuario(new Usuario("Ana", "U001"));
        registrarUsuario(new Usuario("Carlos", "U002"));
    }

}