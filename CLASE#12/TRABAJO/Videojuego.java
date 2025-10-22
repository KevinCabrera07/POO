package TRABAJO;

public class Videojuego {
    protected String nombre;
    protected String consola;
     public Videojuego(String nombre, String consola) {
        this.nombre = nombre;
        this.consola = consola;
    }
     public void jugar() {
        System.out.println("Jugando " + nombre + " en " + consola);
    }
     public void informacion() {
        System.out.println("Videojuego: " + nombre + "Plataforma: " + consola);
    }
}
