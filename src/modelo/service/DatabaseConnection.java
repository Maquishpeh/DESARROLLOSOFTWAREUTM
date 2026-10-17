package src.service;

public class DatabaseConnection {
    private static DatabaseConnection instancia;
    private DatabaseConnection() {}
    public static synchronized DatabaseConnection getInstancia() {
        if (instancia == null) { instancia = new DatabaseConnection(); }
        return instancia;
    }
}
