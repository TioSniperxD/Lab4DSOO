public class Principal {
    public static void main(String[] args) {
        Biblioteca sistema = new Biblioteca();
        sistema.AgregarUsuario("Pablo", "004");
        sistema.TomarPrestado("004", "100");
        sistema.TomarPrestado("004", "200");
        sistema.DevolverLibro("004", "100");
        sistema.TomarPrestado("001", "200");
    }
}
