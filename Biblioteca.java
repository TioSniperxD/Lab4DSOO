import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> Libros;
    private ArrayList<Usuario> Usuarios;
    //CONSTRUCTOR
    public Biblioteca() {
        this.Libros = new ArrayList<>();
        this.Usuarios = new ArrayList<>();
        inicializarDatos();     //LLAMA AL METODO QUE INICIALIZA
    }
    //METODOS AGREGAR USUARIO Y LIBRO
    public void AgregarUsuario(String nombre, String id){
        Usuarios.add(new Usuario(nombre, id));
    }
    public void AgregarLibro(String titulo, String autor, String ISBN){
        Libros.add(new Libro(titulo, autor, ISBN));
    }
    //METODOS PARA TOMAR Y DEVOLVER
    
    //ESTE METODO LLAMA A OTROS METODOS PARA PRESTAR
    public void TomarPrestado(String id, String ISBN){
        if(ValidarUsuario(id)==true && ValidarLibro(ISBN)==true){   //VERIFICA QUE EL LIBRO Y USUARIO EXISTA
            Libro libro = BuscarLibro(ISBN);
            if(libro.getDisponible()==true){    //VERIFICA QUE EL LIBRO ESTE DISPONIBLE
                Prestado(id, ISBN);     //LLAMA AL METODO PRESTAR
                System.out.println("Libros prestado");
            }else System.out.println("El libro se encuentra ocupado");
        }else System.out.println("Usuario o libro no reconocido");
    }
    //ESTE METODO LLAMA A OTROS METODOS PARA DEVOLVER
    public void DevolverLibro(String id, String ISBN){
        if(ValidarUsuario(id)==true && ValidarLibro(ISBN)==true){   //VERIFICA QUE EL LIBRO Y USUARIO EXISTA
            Usuario usuario = BuscarUsuario(id);
            Libro libro = BuscarLibro(ISBN);
            if(usuario.getLibros().contains(libro)){    //VERIFICA QUE EL USUARIO TENGA EL LIBRO
                Devolver(id, ISBN);     //LLAMA AL METODO DEVOLVER
                System.out.println("Libro devuelto");            
            }else System.out.println("El usuario no tiene ese libro");
        }else System.out.println("Usuario o libro no reconocido");
    }
    //METODO PRESTAR
    public void Prestado(String id, String ISBN){
        Libro libro = BuscarLibro(ISBN);
        BuscarUsuario(id).añadirLibro(libro);
        libro.setDisponible(false);
    }
    //METODO DEVOLVER
    public void Devolver(String id, String ISBN){
        Libro libro = BuscarLibro(ISBN);
        Usuario usuario = BuscarUsuario(id);
        usuario.getLibros().remove(libro);
        libro.setDisponible(true);
    }
    //METODO QUE VALIDA USUARIO
    public Boolean ValidarUsuario(String id){
        for (int i = 0; i < Usuarios.size(); i++) {
            if(Usuarios.get(i).getId().equals(id)) return true;
        }
        return false;
    }
    //METODO QUE VALIA LIBRO
    public Boolean ValidarLibro(String ISBN){
        for (int i = 0; i < Libros.size(); i++) {
            if(Libros.get(i).getISBN().equals(ISBN)) return true;
        }
        return false;
    }
    //METODO QUE BUSCA USUARIOS
    public Usuario BuscarUsuario(String id){
        for (int i = 0; i < Usuarios.size(); i++) {
            if(Usuarios.get(i).getId().equals(id)) return Usuarios.get(i);
        }
        return null;
    }
    //METODOS QUE BUSCA LIBROS
    public Libro BuscarLibro(String ISBN){
        for (int i = 0; i < Libros.size(); i++) {
            if(Libros.get(i).getISBN().equals(ISBN)) return Libros.get(i);
        }
        return null;
    }
    private void inicializarDatos() {
        // Inicializar libros
        Libros.add(new Libro("LIBRO01", "Gabriel", "100"));
        Libros.add(new Libro("LIBRO02", "George", "200"));
        Libros.add(new Libro("LIBRO03", "Miguel", "300"));
        Libros.add(new Libro("LIBRO04", "Juan", "400"));
        
        // Inicializar usuarios
        Usuarios.add(new Usuario("Pepe", "001"));
        Usuarios.add(new Usuario("Carlos", "002"));
        Usuarios.add(new Usuario("María", "003"));
    }
}
