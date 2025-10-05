import java.util.*;
public class Biblioteca{
    // Atributos de la clase Biblioteca
    private ArrayList<Libro> libros;
    private ArrayList<Usuario> usuarios;

    // Constructor de la clase Biblioteca
    public Biblioteca(){
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }
    // Métodos para gestionar libroa
    public void agregarLibro(Libro libro){
        libros.add(libro); //Agregar el libro al inventario de la Biblioteca
        System.out.println( "El libro : " + '"'+libro.getTitulo() + '"'+" ha sido agregado");
    }

    public void mostrarLibros(){
        System.out.println("\n -=-=-=-=-= INVENTARIO DE LIBROS -=-=-=-=-=");
        for (Libro libro1 : libros){
            System.out.println(libro1.toString());
        }
    }
    public void registrarPrestamo(Libro libro, Usuario usuario){
        usuario.prestarLibro(libro);
    }
    public void registrarDevolucion(Libro libro, Usuario usuario){
        usuario.devolverLibro(libro);
    }


    //Métodos para gestionar a los Usuarios
    public void registrarUsuario(Usuario usuario){
        usuarios.add(usuario); // Agregar al usuario nuevo en la lista de usuarios de la biblioteca
        System.out.println( "El usuario: " +  '"'+  usuario.getNombre()  + '"'+ " ha sido registrado");
    }
    public void mostrarUsuarios(){
        System.out.println( "\n -=-=-=-=-= LISTA DE USUARIOS REGISTRADOS -=-=-=-=-= ");
        for (Usuario usuario1 : usuarios){
            System.out.println(usuario1.toString());
        }
    }
}