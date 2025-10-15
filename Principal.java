
public class Principal {
    public static void main(String[] args) {
        Biblioteca sistema = new Biblioteca();
        sistema.AgregarUsuario("Pablo", "004");
        sistema.AgregarUsuario("Marco", "005");
        sistema.AgregarUsuario("Petra", "006");

        sistema.AgregarLibro("Libro prueba", "Patricio", "800");        
        sistema.AgregarLibro("Libro prueba", "Pepe", "900");

        sistema.TomarPrestado("001", "200");
        sistema.TomarPrestado("004", "100");
        sistema.TomarPrestado("004", "200");
        sistema.TomarPrestado("006", "900");
        sistema.TomarPrestado("005", "800");
        sistema.TomarPrestado("002", "100");

        sistema.DevolverLibro("004", "100");
        sistema.DevolverLibro("001", "200");
        sistema.DevolverLibro("006", "900");
        sistema.DevolverLibro("004", "300");

        sistema.TomarPrestado("004", "100");
    }
}

