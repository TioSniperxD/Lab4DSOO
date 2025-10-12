import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> Libros;
    private ArrayList<Usuario> Usuarios;

    //CONSTRUCTOR
    public Biblioteca() {
        this.Libros = new ArrayList<>();
        this.Usuarios = new ArrayList<>();
        inicializarDatos();     //LLAMA AL METODO QUE INICIALIZA DATOS
    }

    //ESTOS METODOS SON PARA AGREGAR
    //AGREGA USUARIOS LLAMANDO AL METODO AGREGAR 
    public void AgregarUsuario(String nombre, String id){
        Agregar(nombre, id);
        System.out.println("El usuario se agrego con exito");
    }
    //AGREGA LIBROS LLAMANDO AL METODO AGREGAR 
    public void AgregarLibro(String titulo, String autor, String ISBN){
        Agregar(titulo, autor, ISBN);
        System.out.println("El libro se agrego con exito");
    }
    //METODO AGREGAR SOBRECARGADO
    public void Agregar(String nombre, String id){
        Usuarios.add(new Usuario(nombre, id));
    }
    public void Agregar(String titulo, String autor, String ISBN){
        Libros.add(new Libro(titulo, autor, ISBN));
    }

    //METODOS PARA TOMAR PRESTADO Y DEVOLVER
    
    //ESTE METODO LLAMA A OTROS METODOS PARA PRESTAR
    public void TomarPrestado(String id, String ISBN){
        if(ExistenciaLibroUsuario(id, ISBN)){   //VERIFICA QUE EL LIBRO Y USUARIO EXISTA
            Libro libro = BuscarLibro(ISBN);    //BUSCA EL LIBRO USANDO EL METODO BUSCAR LIBRO
            if(libro.getDisponible()==true){    //VERIFICA QUE EL LIBRO ESTE DISPONIBLE
                Prestado(id, ISBN);     //LLAMA AL METODO PRESTAR
                System.out.println("Libro prestado");
            }else System.out.println("El libro se encuentra ocupado");
        }else System.out.println("Usuario o libro no reconocido");
    }
    //ESTE METODO LLAMA A OTROS METODOS PARA DEVOLVER
    public void DevolverLibro(String id, String ISBN){
        if(ExistenciaLibroUsuario(id, ISBN)){   //VERIFICA QUE EL LIBRO Y USUARIO EXISTA
            Usuario usuario = BuscarUsuario(id);    //BUSCA AL USUARIO USANDO EL METODO BUSCAR USUARIO
            Libro libro = BuscarLibro(ISBN);        //BUSCA EL LIBRO USANDO EL METODO BUSCAR LIBRO
            if(ContieneLibro(usuario, libro)){    //VERIFICA QUE EL USUARIO TENGA EL LIBRO
                Devolver(id, ISBN);     //LLAMA AL METODO DEVOLVER
                System.out.println("Libro devuelto");            
            }else System.out.println("El usuario no tiene ese libro");
        }else System.out.println("Usuario o libro no reconocido");
    }

    //ESTE METODO VERIFICA QUE EXISTAN EL LIBRO Y USUARIO INGRESADO, RETORNA TRUE O FALSE
    public Boolean ExistenciaLibroUsuario(String id, String ISBN){
        if(ValidarUsuario(id)==true && ValidarLibro(ISBN)==true) return true;
        else return false;
    }

    //ESTE METODO RETORNA TRUE SI TIENE EL LIBRO, FALSE SI NO LO TIENE
    public Boolean ContieneLibro(Usuario usuario, Libro libro){
        return usuario.getLibros().contains(libro);
    }

    //METODO PRESTAR
    public void Prestado(String id, String ISBN){
        Libro libro = BuscarLibro(ISBN);    //BUSCA EL LIBRO
        BuscarUsuario(id).añadirLibro(libro);   //BUSCA EL USUARIO Y LE AÑADE EL LIBRO
        libro.setDisponible(false);     //ESTABLECE EN EL LIBRO QUE SU DISPONIBLIDAD ES FALSA
    }

    //METODO DEVOLVER
    public void Devolver(String id, String ISBN){
        Libro libro = BuscarLibro(ISBN);    //BUSCA EL LIBRO
        BuscarUsuario(id).removerLibro(libro);     //BUSCA AL USUARIO Y LE REMUEVE EL LIBRO
        libro.setDisponible(true);      //ESTABLECE EN EL LIBRO QUE SU DISPONIBILIDAD ES TRUE
    }

    //METODO QUE VALIDA USUARIO
    public Boolean ValidarUsuario(String id){
        for (int i = 0; i < Usuarios.size(); i++) {
            if(Usuarios.get(i).getId().equals(id)) return true;  //BUSCA ENTRE TODAS LAS IDS HASTA ENCONTRAR LA DEL USUARIO
        }
        return false;
    }
    //METODO QUE VALIDA LIBRO
    public Boolean ValidarLibro(String ISBN){
        for (int i = 0; i < Libros.size(); i++) {
            if(Libros.get(i).getISBN().equals(ISBN)) return true;  //BUSCA ENTRE TODOS LOS ISBN HASTA ENCONTRAR LA DEL LIBRO
        }
        return false;
    }

    //METODO QUE BUSCA USUARIOS Y DEVUELVE UN OBJETO USUARIO
    public Usuario BuscarUsuario(String id){
        for (int i = 0; i < Usuarios.size(); i++) {
            if(Usuarios.get(i).getId().equals(id)) return Usuarios.get(i);  //BUSCA AL USUARIO Y LO DEVUELVE
        }
        return null;
    }
    //METODOS QUE BUSCA LIBROS Y DEVUELVE UN OBJETO LIBRO
    public Libro BuscarLibro(String ISBN){
        for (int i = 0; i < Libros.size(); i++) {
            if(Libros.get(i).getISBN().equals(ISBN)) return Libros.get(i);  //BUSCA AL LIBRO Y LO DEVUELVE
        }
        return null;
    }

    //ESTO METODO SOLO INICIALIZA LOS DATOS
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
