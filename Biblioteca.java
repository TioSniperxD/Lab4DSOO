import java.util.ArrayList;
public class Biblioteca {
    private ArrayList<Libro> catalogo;
    private ArrayList<Usuario> usuarios;
    
    //Constructor
    public Biblioteca() {
        this.catalogo = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        inicializarDatos();
    }
    //Metodo para agregar libro al catalogo
    public void agregarLibro(Libro libro) {
        catalogo.add(libro);
    }
    //Metodo para agregar usuario
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    //Busqueda de libros por ISBN
    public Libro buscarLibroPorISBN(String ISBN) {
        for (Libro libro : catalogo) {
            if (libro.getISBN().equals(ISBN)) {
                return libro;
            }
        }
        return null; // Retorna null si no se encuentra el libro
    }
    //Busqueda de usuario por ID
    public Usuario buscarUsuarioPorID(String idUsuario) {
        for (Usuario usuario : usuarios) {
            if (usuario.getIdUsuario().equals(idUsuario)) {
                return usuario;
            }
        }
        return null; // Retorna null si no se encuentra el usuario
    }

    //Listar libros 
    public void listarLibros() {
        System.out.println("Catálogo de Libros ");
        for (Libro l : catalogo) {
            System.out.println(l);
        }
    }
    //Listar usuarios
    public void listarUsuarios() {
        System.out.println("Lista de Usuarios ");
        for (Usuario u : usuarios) {
            System.out.println(u);
        }
    }   

    //Metodo para inicializar datos
    private void inicializarDatos() {
        //Agregar libros al catalogo
        catalogo.add(new Libro("Cien Años de Soledad", "Gabriel García Márquez", "100"));
        catalogo.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "200"));
        catalogo.add(new Libro("Los Heraldos Negros", "CesarVallejo", "150"));
        catalogo.add(new Libro("Las Cuitas del Joven Werther", "Johann Wolfgang von Goethe", "300"));
        catalogo.add(new Libro("La ciudad y los perros", "Mario Vargas Llosa","50"));
        
        //Agregar usuarios
        usuarios.add(new Usuario("Jefferson Farfan", "U001"));
        usuarios.add(new Usuario("Cristiano Ronaldo", "U002"));
        usuarios.add(new Usuario("Lionel Messi", "U003"));
    }
}
