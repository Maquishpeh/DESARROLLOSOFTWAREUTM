ackage src.model;

public class AnimalFactory {
    public static Animal crearAnimal(String tipo) {
        if (tipo.equalsIgnoreCase("PERRO")) return new Perro();
        throw new IllegalArgumentException("Especie no soportada.");
    }
}
